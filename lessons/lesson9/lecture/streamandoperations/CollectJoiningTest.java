// CollectJoiningTest.java
package lesson9.lecture.streamandoperations;

import java.util.List;
import java.util.stream.Collectors;

public class CollectJoiningTest {
	
	// Overloading of joining methods
	public static void main(String[] args) {
		List<Person> persons = Person.persons();
		String names = persons.stream()
		                      .map(Person::getName)
		                      .collect(Collectors.joining());// Join all the names without space 

		String delimitedNames = persons.stream()
		                               .map(Person::getName)
		                               .collect(Collectors.joining(", ")); //Join all the names separated by , 

		String prefixedNames = persons.stream()
			.map(Person::getName)
			.collect(Collectors.joining(", ", "Hello ", ". Goodbye.")); // add Hello as prefix and end with Goodbye

		System.out.println("Joined names: " + names);
		System.out.println("Joined, delimited names: " + delimitedNames);
		System.out.println(prefixedNames);
	}
}
