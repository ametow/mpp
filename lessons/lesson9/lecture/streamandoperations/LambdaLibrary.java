package lesson9.lecture.streamandoperations;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class LambdaLibrary {
 public static final BiFunction<List<String>,String,Stream<String>> Q1 =
		  (list,sw) -> list.stream().filter(x->x.startsWith(sw));
		  
 public static final  Function<List<String>,Stream<Integer>> Q2 = 
		   (input)-> input.stream().map(String::length);
		 
}
