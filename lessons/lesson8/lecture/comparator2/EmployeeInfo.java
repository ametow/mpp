package lesson8.lecture.comparator2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
	SortMethod method;
	
	public EmployeeInfo(SortMethod method) {
		this.method = method;
	}
	public void sort(List<Employee> emps) {
		if(method == SortMethod.BYNAME) {
			Collections.sort(emps, new EmployeeNameComparator());
		}
		else if(method == SortMethod.BYSALARY) {
			Collections.sort(emps, new EmployeeSalaryComparator());
		}
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Joe", 50000));
		emps.add(new Employee("Andy", 60000));
		
		Collections.sort(emps, new EmployeeNameComparator());
		System.out.println(emps);
		
		Collections.sort(emps, new EmployeeSalaryComparator());
		System.out.println(emps);
	
		
	}
}
