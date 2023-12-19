package org.streams.skipAndLimit;

import org.streams.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SkipAndLimitTest {

    // second youngest boy
    private static Employee getSecondYounger(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .skip(1)
                .findFirst()
                .get();

    }

    // second elder boy
    private static Employee getSecondElder(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .skip(1)
                .findFirst()
                .get();

    }

    // fetch top 3 highest salaries
    private static List<Employee> fetchTop3Salaries(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());

    }

    // fetch employees less than third highest salary
    private static List<Employee> lessThanThirdHighestSalary(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .skip(3)
                .collect(Collectors.toList());

    }

    public static void main(String args[]) {
        Employee e1 = new Employee(1, "Kartheek", 28, 12000);
        Employee e2 = new Employee(2, "vidya", 38, 14000);
        Employee e3 = new Employee(3, "dilip", 29, 16000);
        Employee e4 = new Employee(4, "rohini", 20, 9000);
        Employee e5 = new Employee(4, "rohini", 22, 18000);
        Employee e6 = new Employee(4, "rohini", 20, 38000);
        Employee e7 = new Employee(4, "rohini", 22, 48000);
        System.out.println(getSecondYounger(List.of(e1, e2, e3, e4, e5, e6, e7)));
        System.out.println(getSecondElder(List.of(e1, e2, e3, e4, e5, e6, e7)));
        System.out.println(fetchTop3Salaries(List.of(e1, e2, e3, e4, e5, e6, e7)));
        System.out.println(lessThanThirdHighestSalary(List.of(e1, e2, e3, e4, e5, e6, e7)));
    }

}
