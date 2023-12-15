package org.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListInReverse {
    public List<Integer> sortInReverse(List<Integer> list) {
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
