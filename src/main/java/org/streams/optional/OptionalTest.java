package org.streams.optional;

import org.streams.model.Employee;

import java.util.List;
import java.util.Optional;

public class OptionalTest {
    static List<Employee> optionalTest(List<Employee> employeeList) {
        return Optional.ofNullable(employeeList)
                .stream()
                .findFirst()
                .orElse(List.of());
    }

    static List<Employee> elseTest(List<Employee> employeeList) {
        return Optional.ofNullable(employeeList)
                .stream()
                .findFirst()
                .orElse(getEmployees());
    }

    static List<Employee> elseGetTest(List<Employee> employeeList) {
        return Optional.ofNullable(employeeList)
                .stream()
                .findFirst()
                .orElseGet(OptionalTest::getEmployees);
    }
    static void isPresentTest(List<Employee> employeeList) {
        Optional.ofNullable(employeeList)
                .ifPresent(empList -> getConsumerEmps("if present"));
    }

    private static List<Employee> getConsumerEmps(String s) {
        return List.of(new Employee(10, "IfPresent", 23, 12000));
    }

    private static List<Employee> getEmployees() {
        System.out.println("Else ");
        return List.of(new Employee(10, "Else", 23, 12000));
    }

    public static void main(String args[]) {
        Employee e1 = new Employee(1, "Kartheek", 28, 12000);
        Employee e2 = new Employee(2, "vidya", 38, 14000);
        Employee e3 = new Employee(3, "dilip", 18, 16000);
        Employee e4 = new Employee(4, "rohini", 22, 18000);
       /* List<Employee> employees1 = optionalTest(List.of(e1, e2, e3, e4));
        List<Employee> employees2 = optionalTest(List.of());
        List<Employee> employees3 = optionalTest(null);
*/
       /* List<Employee> employees1 = elseTest(List.of(e1, e2, e3, e4));
        List<Employee> employees2 = elseTest(List.of());
        List<Employee> employees3 = elseTest(null);
*/

        List<Employee> employees1 = elseGetTest(List.of(e1, e2, e3, e4));
        List<Employee> employees2 = elseGetTest(List.of());
        List<Employee> employees3 = elseGetTest(null);

        System.out.println(employees1);
        System.out.println(employees2);
        System.out.println(employees3);

    }
}
