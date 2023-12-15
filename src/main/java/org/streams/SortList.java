package org.streams;

import java.util.List;
import java.util.stream.Collectors;

public class SortList {
    public List<Integer> sort(List<Integer> list) {
        return list.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
