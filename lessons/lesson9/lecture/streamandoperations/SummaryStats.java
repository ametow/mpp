// SummaryStats.java
package lesson9.lecture.streamandoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummaryStats {
	public static void main(String[] args) {
		
		List<String> words = new ArrayList(Arrays.asList("Java","Spring","VB.Net"));
		IntSummaryStatistics summary 
	    = words.stream().collect(Collectors.summarizingInt(String::length));
		
		System.out.println(summary);
	double averageWordLength = summary.getAverage();
	int maxWordLength = summary.getMax();
	int mini = summary.getMin();
	
	System.out.println(maxWordLength + " " + mini + " " + averageWordLength);
		
		DoubleSummaryStatistics stats = new DoubleSummaryStatistics();
		stats.accept(100.0);
		stats.accept(500.0);
		stats.accept(400.0);
		
		// Get stats
		long count = stats.getCount();
		double sum = stats.getSum();
		double min = stats.getMin();
		double avg = stats.getAverage();
		double max = stats.getMax();
		
		System.out.printf("count=%d, sum=%.2f, min=%.2f, average=%.2f, max=%.2f%n", 
			count, sum, min, avg,max);

		
		/*DoubleSummaryStatistics incomeStats =
				Person.persons()
				.stream()
				.map(Person::getIncome)
				.collect(DoubleSummaryStatistics::new,
				DoubleSummaryStatistics::accept, // add the elements into DoubleSummaryStatistics
				DoubleSummaryStatistics::combine); // give DoubleSummary statistics such as count, sum, min, max and average
				System.out.println(incomeStats);*/
				
				// Using Collectors
				DoubleSummaryStatistics incomeStats1 =
						Person.persons()
						.stream()
						.collect(Collectors.summarizingDouble(Person::getIncome));
						System.out.println(incomeStats1);
	}
}
