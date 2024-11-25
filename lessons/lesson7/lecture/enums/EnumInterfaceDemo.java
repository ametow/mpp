package lesson7.lecture.enums;

interface Operator {

	int calculate(int firstOperand, int secondOperand);

	default int Multiply(int firstOperand, int secondOperand) {
		return firstOperand * secondOperand;
	}

	double divide(int x, int y);
}

enum EOperator implements Operator {

	SUM {
		@Override
		public int calculate(int firstOperand, int secondOperand) {
			return firstOperand + secondOperand;
		}

		@Override
		public double divide(int x, int y) {
			// TODO Auto-generated method stub
			return x / y;
		}
	},
	SUBTRACT {
		@Override
		public int calculate(int firstOperand, int secondOperand) {
			return firstOperand - secondOperand;
		}

		@Override
		public double divide(int x, int y) {
			// TODO Auto-generated method stub
			return x / y;
		}
	};
}

public class EnumInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Sum = " + EOperator.SUM.calculate(10, 20));
		System.out.println("Subtraction = " + EOperator.SUBTRACT.calculate(30, 10));
		System.out.println("Multiplication = " + EOperator.SUBTRACT.Multiply(10, 10));
	}

}
