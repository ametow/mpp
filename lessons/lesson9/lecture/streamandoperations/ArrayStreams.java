package lesson9.lecture.streamandoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayStreams {
    public static void main(String[] args) {
        Integer[] arrOfInt = {1, 3, 5, 7,-1,-3};
        Stream<Integer> intst = Arrays.stream(arrOfInt);
        long count = intst.filter(x->x>0)
                .count();
        System.out.println(count);
        // List of employees in the Sales department
        List<String> salesEmployees = List.of("Alice", "Bob", "Charlie");
        // List of employees in the Marketing department
        List<String> marketingEmployees = List.of("David", "Eva", "Frank");

        // Concatenate the two streams of employees
        Stream<String> allEmployeesStream = Stream.concat(salesEmployees.stream(), marketingEmployees.stream());

        // Process the concatenated stream (e.g., print each employee name)
        allEmployeesStream.forEach(employee -> System.out.println("Employee: " + employee));
    }
}
