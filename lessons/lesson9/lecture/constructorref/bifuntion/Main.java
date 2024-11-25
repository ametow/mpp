package lesson9.lecture.constructorref.bifuntion;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		Supplier<Apple> supplier1 = () -> new Apple();
		Apple a1 = supplier1.get();
         
		Supplier<Apple> supplier2 = Apple::new; //Invoke default constructor
        Apple aa = supplier2.get(); 
		Function<String, Apple> f1 = (color) -> new Apple(color);
		Apple a2 = f1.apply("red");

		Function<String, Apple> f2 = Apple::new;
		Apple a3 = f2.apply("blue");
		System.out.println(a3.getColor());

		BiFunction<String, Double, Apple> bi1 = (color, weight) -> new Apple(color, weight);
		Apple a4 = bi1.apply("green", 150.0);
		
		BiFunction<String, Double, Apple> bi2 = Apple::new;
		Apple a5 = bi2.apply("pink", 200.0);
		System.out.println(a5.getColor() + " " + a5.getWeight());

		BiFunction<String, Double, Apple> bi3 = (color, weight) -> new Apple(color, weight);
		
		TriFunction<String, Double, Double, Apple> t1 = (color, weight,price) -> new Apple(color, weight,price);
		//TriFunction<String, Double, Double, Apple> t1 = (color, weight,price) -> apply(color,weight,price);
		Apple at1 = t1.apply("green", 150.0,5.4);
		
		TriFunction<String, Double, Double, Apple> t2 = Apple::new;
		Apple at2 = t2.apply("green", 150.0,5.4);
		
		System.out.println(a5.getColor() + " " + a5.getWeight());

		// public Apple(String color, double weight, double price, Size size)
		QuadFunction<String, Double, Double, Size, Apple> af1 = (String color, Double weight, Double price,
				Size size) -> new Apple(color, weight, price, size);

		QuadFunction<String, Double, Double, Size, Apple> af2 = Apple::new;
		af2.apply("Purple", 200.0, 5000.0, Size.JUMBO);

	}

}
