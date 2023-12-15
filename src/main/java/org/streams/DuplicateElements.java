package org.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {
    public boolean dupElements(int[] arr) {
        List<Integer> integers = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
        Set<Integer> set = new HashSet<>();
        if (integers.size() == set.size()) {
            return true;
        }
        return false;
    }

    public boolean dupElementsUsingStream(List<String> dupList) {
        Set<String> dupSet = new HashSet<>();
        return dupList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .anyMatch(x -> x > 1);

    }
}
