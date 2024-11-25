package java8featurepack.lambda;

// Demo code for the functional Interface
public class CalculatorDemo {
	public static void main(String args[]) {
		// Calculator addition = (int a, int b)->(a+b);
		Calculator addition = (a, b) -> (a + b);
		System.out.println("Addition Result = " + addition.calculate(10, 20));

		//Calculator sub = (a, b) -> {return a - b;};
		Calculator sub = (a, b) -> (a - b);
		System.out.println("Subtraction Result = " + sub.calculate(25, 10));

		
		Calculator mul = (a, b) -> (a * b);
		System.out.println("Multiplication Result  = " + mul.calculate(25, 10));
		
		Calculator division = (a, b) -> a / b;
		System.out.println("Division Result = " + division.calculate(15, 2));

	}

}
