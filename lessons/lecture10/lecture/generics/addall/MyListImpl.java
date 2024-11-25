package lecture10.lecture.generics.addall;

import java.util.Arrays;

public class MyListImpl<T> implements MyList<T> {

	@Override
	public String toString() {
		String ot = "";
		for(int i =0; i<size;i++){
			ot = ot + arr[i].toString();
		}
		return ot;
	}

	private Object[] arr = new Object[10];
	private int size = 0;

	public void add(T s) {
		arr[size++] = s;
	}

	/*
	 * public void addAll(MyList<? extends T> list) { //public void
	 * addAll(MyList<T> list) { for(int i = 0; i < list.getSize(); ++i) {
	 * add(list.get(i)); } }
	 */
	public T get(int i) {
		if (size > i)
			return (T) arr[i];
		return null;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void addAll(MyList<? extends T> list) {
		{
			for (int i = 0; i < list.getSize(); ++i) {
				add(list.get(i));
			}

		}

	}
}
