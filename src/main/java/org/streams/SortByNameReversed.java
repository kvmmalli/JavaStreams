package org.streams;

import org.streams.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByNameReversed {
    public List<Employee> sortByNameReversed(List<Employee> employeeList)
    {
        return employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList());
    }
}
