package lesson8.lecture.functionalprogramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import lesson8.lecture.methodreferences.Employee;
import lesson8.lecture.methodreferences.EmployeeNameComparator;

class Person{
	String name;
	int age;
	@Override
	public String toString() {
		return  name  + ", " + age ;
	}
	public Person(){}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
@FunctionalInterface
interface Square{
	 double apply(double x);
}
public class MyExample {
	
	// Lambda Concepts
	public static void main(String args[]){
		// Implementation of Display Interface
		
		Square test = (x) -> (x*x);
		System.out.println(test.apply(10));
		
		Function<Double, Double> ob = (x)->(x*x);
		System.out.println(ob.apply(15.5));
		
		Person p1 = new Person("John",35);
		Person p2 = new Person("David",30);
		Person p3 = new Person("Anish",15);
		Person p4 = new Person("Anne",39);
		Person p5 = new Person("Peter",31);
		Person x = new Person();
		List<Person> obj = Arrays.asList(p1,p2,p3,p4,p5);
		
		// Comparator Implementation using Anonymous way
		Collections.sort(obj,new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		System.out.println("Sort Anonymous :" + obj);
		
		// Comparator implementation using Member Inner Class - To reuse the code
	 class NameComparator implements Comparator<Person>{

			@Override
			public int compare(Person o1, Person o2) {
			 return o1.getName().compareTo(o2.getName());
			}
		}
	 Collections.sort(obj, new NameComparator());
		System.out.println("Sort By using Inner Class :" + obj);
		
		System.out.println("Sort by Person Name using Lambdas : ");
		Collections.sort(obj, (e1,e2) ->e1.getName().compareTo(e2.getName()));
		System.out.println(obj);  
		System.out.println("Sort by Person Age using Lambdas : ");
		Collections.sort(obj, (e1,e2) ->e1.getAge()-e2.getAge());
		System.out.println(obj);  
		
			
		NameComparator comp = new NameComparator();
		Collections.sort(obj, comp::compare);
		System.out.println("Sort by Person Name using Method Reference : " + obj);
		
	}

}
