package org.streams.reduce;

import java.util.List;
import java.util.stream.Collectors;

public class ReduceTest {
    private static int sumOfAllNumbers(List<Integer> elements) {
        return elements
                .stream()
                .reduce((a, b) -> a + b)
                .get();
    }

    // Product Of all numbers except current number
    private static List<Integer> productOfAllNumbersExceptCurrentNumber(List<Integer> elements) {
        int productNumber = elements
                .stream()
                .reduce((a, b) -> a * b)
                .get();

        return elements.stream()
                .map(x -> productNumber / x)
                .collect(Collectors.toList());
    }

    public static void main(String arr[]) {
        System.out.println(sumOfAllNumbers(List.of(1, 2, 3, 4, 5)));
        System.out.println(productOfAllNumbersExceptCurrentNumber(List.of(1, 2, 3, 4, 5)));
    }
}
