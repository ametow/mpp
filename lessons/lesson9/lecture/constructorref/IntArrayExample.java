package lesson9.lecture.constructorref;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntArrayExample {
	public static void main(String[] args) {
		//infStream();
		
	    //Set up inputs
		List<Integer> ints = Arrays.asList(3,5,2,3,8);
		
		//Create a list of int[]s by mapping ints, as input lengths with default values, to int[] 
		//constructor
		List<int[]> intArrs = ints.stream()
				                  .map(int[]::new)   ////short for len -> new int[len]
				                  .collect(Collectors.toList());
		//System.out.println(intArrs);
		System.out.println("Printing of intArrs");
		intArrs.forEach((a)->System.out.println(Arrays.toString(a)));
		//Represent each int[] in the list as a string so it can be printed,
		//mapping Arrays.toString to each int[] in the list
	/*	System.out.println("Printing of intArrsStr");
		List<String> intArrsStr = intArrs.stream().map(Arrays::toString).collect(Collectors.toList());
		System.out.println(intArrsStr);*/
		infStream();
	
	}
	public static void infStream() {
		List<int[]> intArrs = Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE)).limit(5)
				.map(x -> x.intValue())
                .map(int[]::new)   //short for len -> new int[len]
                .collect(Collectors.toList());

		List<String> intArrsStr = intArrs.stream().map(Arrays::toString).collect(Collectors.toList());
		System.out.println("Printing of infinite Stream");
		System.out.println(intArrsStr);	
	}
}

