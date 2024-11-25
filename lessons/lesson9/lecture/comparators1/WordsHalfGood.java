package lesson9.lecture.comparators1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Sorts words in descending order of length, using a lambda-defined
 * Comparator.
 *
 */
public class WordsHalfGood {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Rom", "Joseph", "Richard", "Tom");
		Stream<String> longestFirst = words.stream()
				.sorted((x, y) -> (Integer.valueOf(y.length()).compareTo(Integer.valueOf(x.length()))));
		System.out.println(longestFirst.collect(Collectors.toList()));
	}

}
