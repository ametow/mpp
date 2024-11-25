package lesson9.lecture.streamandoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFlatMapDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("Java","Design Pattern","Data Structures");
		System.out.println("Mapping : ");
		// Mapping String into Stream<String>
        Stream<Stream<String>> result = words.stream().map(w->letters(w));
        Stream<List<String>> res = result.map(x->x.collect(Collectors.toList()));
        res.forEach(System.out::println);
        
      //  Stream<String> flatresult = words.stream().flatMap(w->letters(w));
       // flatresult.forEach(System.out::print);
        
        System.out.println("Flat Mapping : "); 
       List<String> flatresult1 = words.stream().flatMap(w->letters(w))
        		.collect((Collectors.toList()));
        System.out.println(flatresult1);
        
     //   Stream<String> firstletters = words.stream().map(s->s.substring(0,1));
      //  firstletters.forEach(System.out::println);
        }
 public static Stream<String> letters(String s){
	 List<String> result = new ArrayList<>();
	 for(int i=0;i<s.length();i++)
		 result.add(s.substring(i,i+1)); // add each character into the list
	 return result.stream(); 
 }
}
