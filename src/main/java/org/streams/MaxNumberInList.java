package org.streams;

import java.util.List;

public class MaxNumberInList {
    public int getMax(List<Integer> list) {
        return list.stream()
                .max(Integer::max)
                .orElse(-1);
    }
}
