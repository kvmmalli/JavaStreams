package org.streams.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
    private static List<Integer> predicate(List<Integer> voters) {
        Predicate<Integer> pred = (x) -> x > 18;
        return voters.stream()
                .filter(pred)
                .collect(Collectors.toList());
    }

    public static void main(String args[]) {
        System.out.println(predicate(List.of(19, 1, 2, 3, 45, 36, 6)));
    }

}
