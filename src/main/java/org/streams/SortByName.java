package org.streams;

import org.streams.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByName {
    public List<Employee> sortByName(List<Employee> employeeList)
    {
        return employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
    }
}
