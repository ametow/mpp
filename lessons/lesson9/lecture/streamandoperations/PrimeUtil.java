// PrimeUtil.java
package lesson9.lecture.streamandoperations;

import java.util.stream.Stream;

public class PrimeUtil {
	// Used for a stateful PrimeUtil
	private long lastPrime = 0L;
	
	// Computes the prime number after the last generated prime
	public long next() {
		lastPrime = next(lastPrime);
		return lastPrime;
	}

	// Computes the prime number after the specified number
	public static long next(long after) {
		long counter = after;

		// Keep looping until you find the next prime number
		while (!isPrime(++counter));

		return counter;
	}

	// Checks if the specified nubmer is a prime number
	public static boolean isPrime(long number) {
		// <= 1 is not a prime number
		if (number <= 1) {
			return false;
		}

		// 2 is a prime number
		if (number == 2) {
			return true;
		}

		// Even numbers > 2 are not prime numbers
		if (number % 2 == 0) {
			return false;
		}

		long maxDivisor = (long) Math.sqrt(number);
		for (int counter = 3; counter <= maxDivisor; counter += 2) {
			if (number % counter == 0) {
				return false;
			}
		}

		return true;
	}
	public static void main(String args[]){
		System.out.println("First five Primes :");
		Stream.iterate(2L, PrimeUtil::next)
		.limit(5)
		.forEach(System.out::println);
		
		// Skip first 100 primes and the next 5 primes using skip
		
		System.out.println("Five Primes after 100 primes :");
		Stream.iterate(2L, PrimeUtil::next)
		.skip(100)
		.limit(5)
		.forEach(System.out::println);
		
		// Skip first 100 primes and the next 5 primes using generate()
		System.out.println("Five Primes after 100 primes using generate():");
		Stream.generate(new PrimeUtil()::next)
		.skip(100)
		.limit(5)
		.forEach(System.out::println);
		 
	// generate method() Examples - generate five random numbers
		System.out.println("Five Random Numbers :");
		Stream.generate(Math::random)  // (or) Stream.generate(new Random()::nextInt)
		.limit(5)
		.forEach(System.out::println);
		
		//The following snippet of code uses the peek() method at three places to print the elements 
		//passing through the stream pipeline:
		int sum = Stream.of(1, 2, 3, 4, 5)
		.peek(e -> System.out.println("Taking integer: " + e))
		.filter(n -> n % 2 == 1)
		.peek(e -> System.out.println("Filtered integer: " + e))
		.map(n -> n * n)
		.peek(e -> System.out.println("Mapped integer: " + e))
		.reduce(0, Integer::sum);
		System.out.println("Sum = " + sum);
	}
}
