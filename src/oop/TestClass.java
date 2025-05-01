package oop;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "chandan", 1000);
//        employee1.setId(1);
//        employee1.setName("chandan");
//        employee1.setSalary(1000);
        Employee employee2 = new Employee(2, "chanda", 2000);
//        employee2.setId(2);
//        employee2.setName("chandan1");
//        employee2.setSalary(2000);
        Employee employee3 = new Employee(3, "chandan1", 3000);
//        employee3.setId(3);
//        employee3.setName("chandan1");
//        employee3.setSalary(2000);
        Employee employee4 = new Employee();
        employee4.setId(4);
        Employee employee5 = new Employee();
        employee5.setId(5);

        Department department = new Department(Employee.count);
        department.setName("SWE");
        System.out.println(department.toString());
        System.out.println("Total Employees:" + department.getEmployeesCount());
        department.addEmployees(employee1);
        department.addEmployees(employee2);
        department.addEmployees(employee3);
        department.addEmployees(employee4);
        department.addEmployees(employee5);
        Arrays.stream(department.getEmployees()).toList().forEach(x -> System.out.println(x));

        System.out.println( department.getEmployee(5));

        System.out.println(department.getTotalSalary());
        System.out.println(department.getAverageSalary());


    }
}
