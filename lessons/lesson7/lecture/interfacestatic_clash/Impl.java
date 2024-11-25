package lesson7.lecture.interfacestatic_clash;

public class Impl extends Super implements Sup1 , Sup2 {
	int x = myMethod();
	public static void main(String[] args) {
		Sup1 s = new Impl();
		int val = Sup1.myMethod();
		System.out.println(val + "hi");
	}
	
	public static int myMethod() {
		return 4;
	}

	public void afd() {
	}
}
