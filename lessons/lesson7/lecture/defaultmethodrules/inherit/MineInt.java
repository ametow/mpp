package lesson7.lecture.defaultmethodrules.inherit;

public interface MineInt {
	default void myMethod(int x) {
		System.out.println("Hi" + x);
	}
}
