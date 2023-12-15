package org.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OnlyDupCount {
    public Map<String, Long> onlyDupsCount(List<String> dupsList) {
        return dupsList.stream()
                .filter(x -> Collections.frequency(dupsList, x) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
