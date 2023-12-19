package org.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayReverse {
    private static void getArrayReverse(int arr[]) {
        IntStream.range(0, arr.length / 2)
                .boxed()
                .forEach(i -> {
                    int temp = arr[arr.length - 1 - i];
                    arr[arr.length - 1 - i] = arr[i];
                    arr[i] = temp;
                });
    }

    public static void main(String args[]) {
        int arr[] = {1, 8, 9, 2, 4, 6, 5, 7, 3};
        getArrayReverse(arr);
        Arrays.stream(arr)
                .forEach(x -> System.out.print(" " + x));
    }
}
