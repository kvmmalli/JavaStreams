package org.streams;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesByPreservingOrder {

    // Removing elements but preserving order
    private static List<String> removeDuplicatesByPreservingOrder(List<String> strings) {
        return strings.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    // Removing elements but preserving order using Set
    private static List<String> removeDuplicatesByPreservingOrderSet(List<String> strings) {
        return new LinkedHashSet<>(strings)
                .stream()
                .collect(Collectors.toList());
    }

    public static void main(String args[]) {
        List<String> names = List.of("apple", "banana", "apple", "mango");
        System.out.println(removeDuplicatesByPreservingOrder(names));
        System.out.println(removeDuplicatesByPreservingOrderSet(names));
    }
}
