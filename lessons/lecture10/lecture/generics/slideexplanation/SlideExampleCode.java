package lecture10.lecture.generics.slideexplanation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// 1. Creation of Generic class
class MyGeneric<T,U>{
	T t;
	MyGeneric(T t){
		this.t = t;
	}
	
	MyGeneric(T t1, U t2){
		
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
}
public class SlideExampleCode {
public static void main(String args[]){

	// Think about ArralyList class
	List list = new ArrayList();
	list.add(10);
	list.add("Hello");
	
	List<Integer> list1 = Arrays.asList(10,20,30,40);
	List<Double> list2 = Arrays.asList(10.3,20.0,30.9,40.5);
	
	// Generic Method
	print(list1);
	print(list2);
	
	// My Generic class
MyGeneric ob1 = new MyGeneric("Java");
ob1.setT(10);
System.out.println(ob1.getT());

//MyGeneric<String> ob2 = new MyGeneric("Streams");
//ob2.setT(10); // Compilation Error - It accepts only String
System.out.println(ob1.getT());

// Rule 1 : Generic Sub typing Is Not Covariant 

List<Integer> ints = new ArrayList<Integer>();
ints.add(1);
ints.add(2);
//List<Number> nums = ints;    //compiler error

//Rule 3 : Component type of an array is not allowed to be a parametrized type.

//List<String>[] = new List<String>[5];   

}


// 2. Creation of Generic Methods 

static <E> void print(List<E> a) {
	System.out.println("\nList of Elements : ");
	 for (E ae : a) {
	 System.out.print(ae + " ");
	 }
   }

// Rule 2 - Component type of an array is not allowed to be a type variable
/*public static <T> T[] toArray(Collection<T> coll) {
	T[]  arr = new T[coll.size()];   //compiler error
	int k = 0;
	for(T element : coll)
		arr[k++] = element;
	return arr; 		
	}*/
}
