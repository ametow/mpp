// IncomeStatsByGender.java
package lesson9.lecture.streamandoperations;

import java.util.DoubleSummaryStatistics;
import java.util.Map;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summarizingDouble;

public class IncomeStatsByGender {
	public static void main(String[] args) {
		// Summarizing Genders count, min, average, total and max
		Map<Person.Gender, DoubleSummaryStatistics> incomeStatsByGender = 
			Person.persons()
			      .stream()	
			      .collect(groupingBy(Person::getGender, 
			                          summarizingDouble(Person::getIncome)));

		System.out.println(incomeStatsByGender);
	}
}
