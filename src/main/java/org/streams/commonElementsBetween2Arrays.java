package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class commonElementsBetween2Arrays {
    private static List<Integer> getCommonElements(int arr1[], int arr2[]) {
        return Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2).boxed().anyMatch(y -> x == y))
                .boxed()
                .collect(Collectors.toList());
    }

    private static List<Integer> getCommonElementsByWrapper(Integer arr1[], Integer arr2[]) {
        List<Integer> list1 = Arrays.asList(arr1);
        return Arrays.stream(arr2)
                .filter(x -> list1.contains(x))
                .collect(Collectors.toList());
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int arr2[] = {4, 5};

        Integer arr1[] = new Integer[] {1, 2, 3, 4, 5};
        Integer arr3[] = new Integer[] {4, 5};
        System.out.println(getCommonElements(arr, arr2));
        System.out.println(getCommonElementsByWrapper(arr1, arr3));
    }
}
