package lesson10.lecture.JunitTestProject.src.junittestpack;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionClass {
	int add(int x, int y){
		return x + y;
	}
	public String StringJoin(String str1, String str2)
	 {
		 if (str1.length() == 0 && str2.length()==0)
			 return "Empty";
		 else
			 return str1 + str2;
	 }
	
	public static List<String> allToUpperCase(List<String> words) {
	    return words.stream()
	                .map(string -> string.toUpperCase())
	                .collect(Collectors.toList());
	}
	
	public static List<String> uppercaseFirstChar(List<String> words) {
	    return words.stream()
	                .map(FunctionClass::firstToUppercase)
	                .collect(Collectors.toList());
	}
	 
	public static String firstToUppercase(String value) {
	    char firstChar = value.charAt(0);
	    firstChar = Character.toUpperCase(firstChar);
	    return firstChar + value.substring(1);
	}
	
	
	public static List<String> uppercaseFirstChar1(List<String> words) {
	    return words.stream()
	                .map(value -> {
	                    char firstChar = value.charAt(0);
	    firstChar = Character.toUpperCase(firstChar);
	                    return firstChar + value.substring(1);
	                })
	                .collect(Collectors.toList());
	}
}
