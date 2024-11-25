package lesson9.lecture.streamandoperations;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Stream;

//Lambda Library 

public class MyLambdaLibrary {
	public static final BiFunction<List<String>,String,Stream<String>> FILTERNAMES 
	= (list,s)-> list.stream().filter(x->x.startsWith(s));
}


