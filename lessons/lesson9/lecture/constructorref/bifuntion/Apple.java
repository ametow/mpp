package lesson9.lecture.constructorref.bifuntion;

public class Apple {

	private String color;
	private double weight;
	private double price;
	private Size size;

	public Apple() {
	}

	public Apple(String color) {
		this.color = color;
	}

	public Apple(String color, double weight) {
		this.color = color;
		this.weight = weight;
	}

	public Apple(String color, double weight, double price) {
		this.color = color;
		this.weight = weight;
		this.price = price;
	}

	public Apple(String color, double weight, double price, Size size) {
		this.color = color;
		this.weight = weight;
		this.price = price;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public double getPrice() {
		return price;
	}

	public Size getSize() {
		return size;
	}

}
