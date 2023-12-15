package org.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfStrings {
    public Map<String, Long> getFrequencyOfCharacters(List<String> stringList) {
        return stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
