package lesson8.lecture.streams;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "Mike", "Molly");
    names.stream()
        .filter(name -> name.startsWith("J"))
        .map(String::toUpperCase)
        .forEach(System.out::println);
  }
}
