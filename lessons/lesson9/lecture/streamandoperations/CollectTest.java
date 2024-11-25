// CollectTest.java
package lesson9.lecture.streamandoperations;

import java.util.List;
import java.util.stream.Collectors;

public class CollectTest {
	public static void main(String[] args) {
		System.out.println("Sorted List");
		List<String> sortedNames = Person.persons()
                                 .stream()
		                                 .map(Person::getName)
		                                 .sorted()  // .sorted(Collections.reverseOrder())
		                                 .collect(Collectors.toList());
		System.out.println(sortedNames);
		     	long count = Person.persons()
				.stream()
				.collect(Collectors.counting()); // .count();
				System.out.println("Person count: " + count);
	}
}
