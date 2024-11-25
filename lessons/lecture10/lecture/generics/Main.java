package lecture10.lecture.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String args[]){
		
		List<Number> nums = new ArrayList<Number>();
		List<Integer> ints = Arrays.asList(1, 2);
		List<Double> doubles = Arrays.asList(2.78, 3.14);
		List<Long> longs = Arrays.asList(2l, 7l,13l,15l);
		
		nums.addAll(ints);
		nums.addAll(doubles);
		nums.add(12);
		System.out.println(nums);  
		
    //	nums=ints; // Generics is not Covariant , to resolve it by using Bounded Type
		List<? extends Number> list = new ArrayList();
		list = ints;
		System.out.println(list);
		
		list=doubles;
		System.out.println(list); 
		
		/* Drawback of ? extends Bounds
		 * Try to add another integer value into the list creates compilation error,
		 * because add method accepts only null, ? - means unknown type. 
		*/
		//list.add(12);
		
		// Manager Employee class using Bounds
		
				List<Employee> elist = new ArrayList<>();
				List<Manager> mlist = new ArrayList<>();
				elist.add(new Employee("John",3000));
				elist.add(new Employee("David",5000));
			//	mlist=elist; // Compilation Error - Not Covariant
				
				// To resolve it by using Bounds
				List<? extends Employee> mlist1 = new ArrayList<>();
				mlist1 = mlist; // But can not add Employee or Manager
				System.out.println(mlist1);
				
	// ? super Bounds - Examples
		
		List<? super Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
	//	Integer x = list1.get(0); // Compilation Error - Resolve by doing casting or make the Receiver type as Object
		Integer x = (Integer) list1.get(0);
		Object x1 = list1.get(1);
		
		List<? super Manager> mlist2 = new ArrayList<>();
		mlist2.add(new Manager("Pam",4500));
		mlist2.add(new PartTimeManager("Ana",3000));
		System.out.println(mlist2);
	}
}
