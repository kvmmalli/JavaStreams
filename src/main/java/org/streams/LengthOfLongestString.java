package org.streams;

import java.util.Comparator;
import java.util.List;

public class LengthOfLongestString {
    private static int getLongestString(List<String> names) {
        return names.stream()
                .map(x -> x.length())
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .orElseThrow(() -> new RuntimeException("There is no Longest Element"));
    }

    private static int getLongestStringUsingMax(List<String> names) {
        return names.stream()
                .map(x -> x.length())
                .max(Comparator.naturalOrder())
                .orElseThrow(() -> new RuntimeException("There is no Longest Element"));
    }

    public static void main(String args[]) {
        List<String> list = List.of("ABC", "ABCDE", "ABCDEFGHI", "AB");
        System.out.println(getLongestString(list));
        System.out.println(getLongestStringUsingMax(list));
    }
}
