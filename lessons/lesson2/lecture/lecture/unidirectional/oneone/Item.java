package lesson2.lecture.lecture.unidirectional.oneone;

public class Item {
	String name;
	public Item(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
}
