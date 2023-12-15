package org.streams;

import org.streams.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByAge {
    public List<Employee> sortByAge(List<Employee> employeeList)
    {
        return employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
    }
}
