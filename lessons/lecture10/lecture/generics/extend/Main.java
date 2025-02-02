package lecture10.lecture.generics.extend;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Manager> list1 = new ArrayList<>();
		list1.add(new Manager("Joe", 110000, 2002, 1, 15));
		// List<Employee> list2 = list1; //compiler error 
		List<? extends Employee> list3 = list1;
		System.out.println(list3);
		List<? extends Object> list4 = list3;

		reverse(list1);
	}

	public static <E> void reverse(List<E> list) {
		List<E> tmp = new ArrayList<>(list);
		for (int i = 0; i < list.size(); i++) {
			list.set(i, tmp.get(list.size() - i - 1));
		}
	}
}
