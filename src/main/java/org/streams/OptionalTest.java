package org.streams;

import org.streams.model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class OptionalTest {
    public List<String> optionalTest(List<Employee> dupsList) {
        return Optional.of(dupsList)
                .orElse(List.of())
                .stream()
                .filter(Objects::nonNull)
                .map(employee -> employee.getName())
                .collect(Collectors.toList());
    }
}
