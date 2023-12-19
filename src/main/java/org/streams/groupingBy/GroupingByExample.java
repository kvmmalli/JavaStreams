package org.streams.groupingBy;

import org.streams.model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByExample {

    //Group by age
    private static Map<Integer, List<Employee>> groupByAge(List<Employee> employeeList) {
        return employeeList
                .stream()
                .collect(Collectors.groupingBy(x -> x.getAge()));
    }
    //group by age and should not contains any duplicates

    private static Map<Integer, Set<Employee>> groupByAgeAndNoDuplicates(List<Employee> employeeList) {
        return employeeList
                .stream()
                .collect(Collectors.groupingBy(x -> x.getAge(), Collectors.toSet()));
    }

    //group by age and should not contains any duplicates and sorted by age

    private static Map<Integer, Set<Employee>> groupByAgeAndNoDuplicatesAndSortedByAge(List<Employee> employeeList) {
        return employeeList
                .stream()
                .collect(Collectors.groupingBy(x -> x.getAge(), TreeMap::new, Collectors.toSet()));
    }

    // Find the duplicate Elements.
    private static Set<Employee> getDuplicatesByGrouping(List<Employee> employeeList) {
        Map<String, Long> groupByNameMap = employeeList
                .stream()
                .collect(Collectors.groupingBy(x -> x.getName(), Collectors.counting()));

        return employeeList.stream()
                .filter(x -> groupByNameMap.get(x.getName()) > 1)
                .collect(Collectors.toSet());
    }

    // Find the duplicate Elements by frequency.
    private static Set<Employee> getDuplicatesByFrequency(List<Employee> employeeList) {
        return employeeList.stream()
                .filter(x -> Collections.frequency(employeeList, x) > 1)
                .collect(Collectors.toSet());
    }

    // Find the unique Elements by frequency.
    private static Set<Employee> getUniqueElementsByFrequency(List<Employee> employeeList) {
        return employeeList.stream()
                .filter(x -> Collections.frequency(employeeList, x) == 1)
                .collect(Collectors.toSet());
    }

    // Find the Unique Elements.
    private static Set<Employee> getUniqueElementsByGrouping(List<Employee> employeeList) {
        Map<String, Long> groupByNameMap = employeeList
                .stream()
                .collect(Collectors.groupingBy(x -> x.getName(), Collectors.counting()));

        return employeeList.stream()
                .filter(x -> groupByNameMap.get(x.getName()) == 1)
                .collect(Collectors.toSet());
    }

    // iterate names from list and change it to upper case and join them by comma and as a single string
    private static String  getCommaSeperatedString(List<Employee> employeeList) {
        return employeeList.stream()
                .map(x-> x.getName())
                .collect(Collectors.joining(", "));
    }


    public static void main(String args[]) {
        Employee e1 = new Employee(1, "Kartheek", 28, 12000);
        Employee e2 = new Employee(2, "vidya", 38, 14000);
        Employee e3 = new Employee(3, "dilip", 28, 16000);
        Employee e4 = new Employee(4, "rohini", 22, 18000);
        Employee e5 = new Employee(4, "rohini", 22, 18000);
        System.out.println(groupByAge(Arrays.asList(e1, e2, e3, e4, e5)));
        System.out.println(groupByAgeAndNoDuplicates(Arrays.asList(e1, e2, e3, e4, e5)));
        System.out.println(groupByAgeAndNoDuplicatesAndSortedByAge(Arrays.asList(e1, e2, e3, e4, e5)));
        System.out.println(getDuplicatesByGrouping(Arrays.asList(e1, e2, e3, e4, e5)));
        System.out.println(getDuplicatesByFrequency(Arrays.asList(e1, e2, e3, e4, e5)));
        System.out.println(getUniqueElementsByGrouping(Arrays.asList(e1, e2, e3, e4, e5)));
        System.out.println(getUniqueElementsByFrequency(Arrays.asList(e1, e2, e3, e4, e5)));
        System.out.println(getCommaSeperatedString(Arrays.asList(e1, e2, e3, e4, e5)));

    }
}
