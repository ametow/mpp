package lesson3.lecture.polymorphism1;

class Manager extends Employee {
	public Manager() {
		super("", 23);
	}

	public Manager(String name, double salary) {
		super(name, salary);
		bonus = 0;
	}

	@Override
	public double getSalary() {
		// no direct access to private variables of superclass
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	public void setBonus(double b) {
		bonus = b;
	}

	private double bonus;
}
