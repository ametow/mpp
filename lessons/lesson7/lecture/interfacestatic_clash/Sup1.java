package lesson7.lecture.interfacestatic_clash;

public interface Sup1 {
	static int myMethod() {
		return 1;
	}
	static int hi() {
		return 8;
	}
}
