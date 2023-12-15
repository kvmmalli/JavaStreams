package org.streams;

import java.util.List;

public class MinNumberList {
    public int getMin(List<Integer> list) {
        return list.stream()
                .min(Integer::min)
                .orElse(-1);
    }
}
