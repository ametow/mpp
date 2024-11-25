package lecture10.lecture.generics.wildcardcapture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Capture {
	public void copyFirstToEnd(List<?> items) {
		//items.add(items.get(0)); //compiler error
	}
	
	public void copyFirstToEnd2(List<?> items) {
		copyFirstToEndHelper(items);
	}
	
	private <T> void copyFirstToEndHelper(List<T> items) {
		T item = items.get(0);
		items.add(item);
	}
	
	public static void main(String args[]){
		
		Capture c = new Capture();
		List<Integer> l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		List<String> l2 = new ArrayList();
		l2.add("Hello");
		l2.add("Java");
		c.copyFirstToEnd2(l1);
		System.out.println(l1);
		c.copyFirstToEnd2(l2);
		System.out.println(l2);
	}
}
