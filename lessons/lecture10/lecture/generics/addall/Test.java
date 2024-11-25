package lecture10.lecture.generics.addall;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		MyList<Employee> list = new MyListImpl<Employee>();
		Employee e = new Employee("Joe", 100000);
		list.add(e);
		Manager m = new Manager("John", 200000);
		list.add(m);
		MyList<Manager> list2 = new MyListImpl<Manager>();
		list2.add(m);
		list.addAll(list2); //compiler error
		System.out.println(list);
		// What is the issue in this part?
		ArrayList<? extends Integer> list3 = new ArrayList<>(); // use super no issue while adding elements
		//list3.add(2);
		
		ArrayList<? super Integer> lis = new ArrayList<>(); 
		lis.add(2);
		lis.add(5);
		int x = (int) lis.get(0);
		
		
		List<Number> nums = new ArrayList<Number>();
		List<Integer> ints = Arrays.asList(1, 2);
		List<Double> doubles = Arrays.asList(2.78, 3.14);
		nums.addAll(ints);
		nums.addAll(doubles);
		System.out.println(nums);  //output:  [1, 2, 2.78, 3.14]

	}
}
