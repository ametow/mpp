// ForEachTest.java
package lesson9.lecture.streamandoperations;

import java.util.List;
import java.util.stream.Stream;

public class ForEachTest {
	public static void main(String[] args) {
		// Get the list of persons
		List<Person> persons = Person.persons();

		// Print the list
		System.out.println("Before increasing the income: " + persons);

		// Increase the income of females by 10%
		persons.stream()
		       .filter(Person::isFemale)
		       .forEach(p -> p.setIncome(p.getIncome()+p.getIncome() * 0.10));
           System.out.println("After Modification Result");
		//persons.stream().forEach(System.out::println);
         System.out.println( persons);
		
	/*	persons.stream()
	       .filter(Person::isFemale)
	       .forEach(p -> p.setIncome(p.getIncome() * 1.10));
		persons.stream().forEach(System.out::println);*/
		// Print the list again
	//	System.out.println("Modified Result");
	//	System.out.println("After increasing the income: " + persons);
		
	 /*  //  maps the elements of a stream of people to their names 
		// and prints the mapped stream
		System.out.println("List of Persons ");
		System.out.println("~~~~~~~~~~~~~~~~~ ");
		 Person.persons()
		.stream()
		.map(Person::getName)
		.forEach(System.out::println);
	
		 // applies two filter operations to print the names of all males having income more than 5000.0
		 System.out.println("Male Persons getting more than 5000 income ");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
		 Person.persons()
		 .stream()
		 .filter(Person::isMale)
		 .filter(p -> p.getIncome() > 5000.0)
		 .map(Person::getName)
		 .forEach(System.out::println);
		 
		 // applies two filter operations to print the names startsWith L
		 System.out.println("Person Name starts with L ");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
		 Person.persons()
		 .stream()
		 .filter(p -> p.getName().startsWith("L"))
		 .map(Person::getName)
		 .forEach(System.out::println);
		 
		 // reduce operation - examples to sum the income of persons
		 
		 double sum = Person.persons()
				 .stream()
				 .map(Person::getIncome)
				 .reduce(0.0, Double::sum);
	      System.out.println("Sum of income : " + sum);*/
	}
}
