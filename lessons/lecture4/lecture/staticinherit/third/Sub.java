package lecture4.lecture.staticinherit.third;

//Shows an instance method cannot override a static method
public class Sub extends Super {
	public static void main(String[] args) {
		Super s = new Super();
		s.greet();
	}

	public void greet() {
		System.out.println(hi());
	}

	private int hi() {
		return 0;
	}

	static void tryit() {
		System.out.println("trying it too");
	}
}
