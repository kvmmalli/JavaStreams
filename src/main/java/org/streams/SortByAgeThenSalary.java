package org.streams;

import org.streams.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByAgeThenSalary {
    public List<Employee> sortByAgeThenSalary(List<Employee> employeeList)
    {
        return employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getAge).thenComparing(Employee::getSalary))
                .collect(Collectors.toList());
    }
}
