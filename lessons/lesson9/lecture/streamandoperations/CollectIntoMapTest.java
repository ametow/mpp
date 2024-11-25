// CollectIntoMapTest.java
package lesson9.lecture.streamandoperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectIntoMapTest {
	public static void main(String[] args) {
		/* Collectors.toMap() accepts three parameters-> 
		 * 1. Key Mapping Function, 
		 * 2. Value Mapping Function
		 * 3. Merging of all keys in to a single entity, 
		 * here gender is the key, it merge all  male, merge all the female*/
		
		System.out.println("Highest Paid Male and Female");
	/*	Map<Person.Gender, Person> highestEarnerByGender = Person.persons().stream()
				.collect(Collectors.toMap(Person::getGender, 
				Function.identity(), // Similar like (p) -> p,
				(oldPerson, newPerson) -> newPerson.getIncome() > oldPerson.getIncome() ? newPerson : oldPerson));

		System.out.println(highestEarnerByGender);*/

		// group people by gender and count the number of people in each group
		System.out.println("Gender and Count");
		Map<Person.Gender, Long> countByGender = Person.persons().stream()
				.collect(Collectors.groupingBy(Person::getGender, Collectors.counting()));
		System.out.println(countByGender);

		// Mapping each Id with its own object
		System.out.println("ID and Person ");
		Map<Long, Person> idToPerson = Person.persons().stream()
				.collect(Collectors.toMap(Person::getId, Function.identity()));
		System.out.println(idToPerson);
	}
}
