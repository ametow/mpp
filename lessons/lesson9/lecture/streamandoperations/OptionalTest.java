// OptionalTest.java
package lesson9.lecture.streamandoperations;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptionalTest {
	public static void main(String[] args) {
		// Get the maximum of odd integers from the stream
		OptionalInt maxOdd = IntStream.of(15, 20, 30,33,19)
		                              .filter(n -> n % 2 == 1)
		                              .max();
		//System.out.println(maxOdd.getAsInt());
		if (maxOdd.isPresent()) {
			int value = maxOdd.getAsInt();
			System.out.println("Maximum odd integer is " + value);
		} 
		else {
			System.out.println("No Max Odd");
		}

		// Get the minimum of Even integers from the stream
		OptionalInt numbers = IntStream.of(1, 10, 37, 20, 31)
		                               .filter(n -> n % 2 == 0)
		                               .min();
		// If no match found, nothing printed on the console
		numbers.ifPresent(num -> System.out.println(num)); 
		

		// Get the longest name
	//	Optional<String> list = Optional.empty();
		//Optional<String> name = Stream.of("Ken", "Ellen", "Li")
		Optional<String> name = Stream.of("Ken", "Ellen", "Li")				
			                      .max(Comparator.comparingInt(String::length));
		System.out.print("Longest Name : " + name.orElse(null));
		System.out.println();
			
		Optional<Person> person = Person.persons()
				.stream()
				.reduce((p1, p2) -> p1.getIncome() > p2.getIncome()?p1:p2);
		
		System.out.print("Highest Earner" + person.orElse(null));
		
		Optional< String > firstName = Optional.of( "Tom" ); 
		Optional< String > fullName = Optional.ofNullable( null );
	//	Optional< String > fullName = Optional.ofNullable( "Renuka" );
		
		System.out.println("ofNullable");
		//System.out.println(Optional.ofNullable("Renuka").orElse("No Value"));
		System.out.println(Optional.ofNullable("Java").orElse("No Value"));
		System.out.println( "\nFirst Name is set? " + firstName.isPresent() );
		System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) ); 
		System.out.println( firstName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) ); 
		System.out.println();
		
		 String lan = null;
		   // Optional<String> opt = Optional.of(lan);
		   Optional<String> opt = Optional.ofNullable(lan);
		    System.out.println(opt.toString());

			
		}
}