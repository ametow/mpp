package lesson3.lecture.orderofexec;

public class ClassE {

	static int superInt = superIntMethod();
	static int superIntMethod(){
		System.out.println("1-Initializing superclass static variable superInt");
		return 1;
	}
	static {
		System.out.println("2-Executing superclass static block");
	}
	
	static int superInstanceIntMethod() {
		System.out.println("5-Initialzing superclass instance variable superInstanceInt");
		return 3;
	}
	
	@SuppressWarnings("unused")
	private int superInstanceInt=superInstanceIntMethod();
	
	ClassE(){
		System.out.println("7-Running superclass constructor");
	}
	
	{
		System.out.println("6-Running superclass object initialization block");
	}
	public static void main(String[] args) {
		new SubClass();

	}

}

class SubClass extends ClassE {
	static int subInt = subIntMethod();
	static int subIntMethod(){
		System.out.println("3-Initializing subclass static variable subInt");
		return 2;
	}
	
	static {
		System.out.println("4-Executing subclass static block");
	}


	static int superInstanceIntMethod() {
		System.out.println("5-Initialzing superclass instance variable superInstanceInt");
		return 3;
	}
	static int subInstanceIntMethod() {
		System.out.println("9-Initialzing subclass instance variable subInstanceInt");
		return 3;
	}
	SubClass(){
		System.out.println("10-Running subclass constructor");
	}
	{
		System.out.println("8-Running subclass object initialization block");
	}
	
	
	@SuppressWarnings("unused")
	private int subInstanceInt = subInstanceIntMethod();
		
}
