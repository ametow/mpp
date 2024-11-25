package lesson8.lecture.methodreferences.classmethod.math;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
  public static void main(String[] args) {
    BiFunction<Item, String, Integer> parser = Item::parseInt;

    Supplier<Item> supplier = Item::new;

    BiFunction<String, String, Integer> aa = String::compareToIgnoreCase;

    Function<String, String> upperFunction = String::toUpperCase;
    var res = upperFunction.apply("123");

    BiFunction<Item, Item, Integer> upperFunction2 = Item::parse;

    System.out.println(res);
  }
}
