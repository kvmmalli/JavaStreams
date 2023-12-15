package org.streams;

import org.streams.model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class PojoToMapBySort {
    public Map<String, Integer> pojoToMap(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toMap(Employee::getName, Employee::getAge, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }
}
