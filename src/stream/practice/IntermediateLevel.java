package stream.practice;

import java.util.Arrays;
import java.util.List;

public class IntermediateLevel {

    public static void shortEmployeeBySalary() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 70000),
                new Employee("Bob", 50000),
                new Employee("Charlie", 90000)
        );

        System.out.println(Arrays.stream(employees.stream().map(x->x.getName()).toList().stream().sorted().toArray()).toList());
    }

    public static void groupStringByLength() {
        List<String> words = Arrays.asList("hi", "book", "pen", "apple", "go");

    }

    public static void main(String[] args) {
        shortEmployeeBySalary();
    }
}
