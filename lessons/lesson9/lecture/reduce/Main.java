package lesson9.lecture.reduce;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3, 5, 9, 2, 8, 1, 7);
		List<Exam> exams = List.of(new Exam("A", 1.23), new Exam("b", 2.31), new Exam("C", 3.45));
		exams.stream().mapToDouble(Exam::getScore).summaryStatistics();
		var a = exams.stream().collect(Collectors.summarizingDouble(Exam::getScore));
		System.out.println(a);

		// Use reduce to find both min and max
		// int[] minMax = numbers.stream()
		// 		.reduce(new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE },
		// 				(result, value) -> {
		// 					result[0] = Math.min(result[0], value); // min
		// 					result[1] = Math.max(result[1], value); // max
		// 					return result;
		// 				},
		// 				(result1, result2) -> new int[] {
		// 						Math.min(result1[0], result2[0]),
		// 						Math.max(result1[1], result2[1])
		// 				});

		// int min = minMax[0];
		// int max = minMax[1];

		// System.out.println("Min: " + min);
		// System.out.println("Max: " + max);

		// List<Integer> list = Arrays.asList(2, 1, 4, 3);
		// Main m = new Main();
		// m.printSum(list);
		// m.printProduct(list);
		// m.printDifference(list);

		// Optional<T> reduce(BinaryOperator<T> accumulator);
		// No need of seed if it return optional
		/*
		 * Optional<Integer> sum = list.stream().reduce((a,b)->(a+b));
		 * System.out.println("Sum = " + sum.get());
		 * 
		 * Optional<Integer> prd = list.stream().reduce((a,b)->(a*b));
		 * System.out.println("Product = " + prd.get());
		 */

	}

	public void printSum(List<Integer> list) {
		// T reduce(T identity, BinaryOperator<T> accumulator); It accepts seed
		int sum1 = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println("sum1 = " + sum1);
		int sum2 = list.parallelStream().reduce(0, (a, b) -> a + b);
		System.out.println("sum2 = " + sum2);
	}

	public void printProduct(List<Integer> list) {
		int prod1 = list.stream().reduce(1, (a, b) -> a * b);
		System.out.println("prod1 = " + prod1);
		int prod2 = list.parallelStream().reduce(1, (a, b) -> a * b);
		System.out.println("prod2 = " + prod2);
	}

	public void printDifference(List<Integer> list) {
		int diff1 = list.stream().reduce(0, (a, b) -> a - b);
		System.out.println("diff1 = " + diff1);
		int diff2 = list.parallelStream().reduce(0, (a, b) -> a - b);
		System.out.println("diff2 = " + diff2);

	}

}
