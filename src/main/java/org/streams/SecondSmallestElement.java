package org.streams;

import java.util.Arrays;

public class SecondSmallestElement {

    // second smallestElement
    private static int getSmallestElement(int arr[]) {
        return Arrays.stream(arr)
                .boxed()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(-1);
    }
    public static void main(String args[])
    {
       int arr[]= {1,8,9,2,4,6,5,7,3};
       System.out.println(getSmallestElement(arr));
    }
}
