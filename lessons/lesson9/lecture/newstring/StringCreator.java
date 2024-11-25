package lesson9.lecture.newstring;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
public class StringCreator {
	public static void main(String[] args) {
		
		char[] charArray = {'s','p','e','a','k','i','n','g','c','s'};
	 // Using method reference to create String object	
      Function<char[], String> myFunc = String::new; // take char[] array as input and return the string
      System.out.println(myFunc.apply(charArray));
      
      // Using lambdas to create String Object
      Function<char[], String> myFunc1 = charArr -> new String(charArr); 
      System.out.println(myFunc1.apply(charArray));
      
      // Usual Implementation of Converting CharArray to String object
       String s = new String(charArray);
       System.out.println(s);
       
      // Slide - 27
       List<String> strings 
		  = Arrays.asList("Eleven", "strikes", "the", "clock");
     //  String[] coll =  strings.stream().toArray(); // Error
    //  String[] coll =  (String[]) strings.stream().toArray(); // Throw Exception
     // Recommended way - Convert List<String> to String[]
       // Using Method Reference :: new
       String[] vals = strings.stream().toArray(String[]::new);
       System.out.println(Arrays.toString(vals));
       // Using Lambda, take an input of size and return the array with the given size
        // toArray method gives the size from the Stream
       String[] vals1 = strings.stream().toArray(size -> new String[size]);

	  
    }

}
