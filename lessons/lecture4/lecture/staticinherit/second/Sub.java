package lecture4.lecture.staticinherit.second;

@SuppressWarnings("static-access")
//Shows that, although static methods are inherited,
//they cannot be used polymorphically
public class Sub extends Super {
	public static void main(String[] args) {  
		Super s = new Sub();
		s.print();
	}
	public static void print() {
		System.out.println("bye");
	}
}


// can we override the static method