package lecture10.lecture.generics.slideexplanation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestUpperLowerComError {
	public static void main(String args[]){
		List<Integer> ints = new ArrayList();
		ints.add(1);
		ints.add(2);
		
		
		List<? extends Number> nums = ints;
	//	nums.add(3.14);      //compiler error � it does not allow any input except null, ? � unknown, add method allow for specific type, not for unknown typeSystem.out.println(ints.toString());  //output:  [1, 2]nums.add(null);   //OK � see below
        nums.add(null);
        System.out.println(nums);
	List<? super Integer> list = new ArrayList();
	list.add(10);
	System.out.println(list);
	//int x = list.get(0);
	//Number x = list.get(0);
	Object x = list.get(0);
	System.out.println("x =" + x);
	
	List<Integer> its = Arrays.asList(1, 2, 3);
	Double val = sum(its);   //output: 6.0
	System.out.println("Sum = " + val);
	List<Double> doubles = Arrays.asList(2.78, 3.14);
	Double vals = sum(doubles);  //output 5.92
	System.out.println("Sum = " + vals);
	
	List<Object> ds = Arrays.<Object>asList(2, 3.14, "four"); //explicit type argument required here
	List<Integer> sc = Arrays.asList(5, 6);
	copy(ds, sc);    //copy the narrow type (Integer) into the wider type (Object)
	 System.out.println(ds);  
	 
	 List<Number> l1 = new ArrayList();
	 count(l1,5);
	 System.out.println("List 1 : " + l1);
	 
	 List<Integer> l2 = new ArrayList();
	 count(l2,5);
	 l2.add(8);
	 System.out.println("List 2 : " + l2);
	 
	 List<Object> l3 = new ArrayList();
	 count(l3,5);
	 l3.add("Java");
	 System.out.println("List 3 : " + l3);
	}
	
	public static double sum(Collection<? extends Number> nums) {		
		double s = 0.0;
		for(Number num: nums) 
			s += num.doubleValue();
		return s;	
		}
	
	public static <T> void copy(List<? super T> destination, List<? extends T> source) {
		  for(int i = 0; i < source.size();  ++i) {
			  destination.set(i, source.get(i));
		  }
		
		  }
	public static void count (Collection<? super Integer>ints, int n){
		for(int i=0;i<n;i++){
			ints.add(i);
		}
	}

}
