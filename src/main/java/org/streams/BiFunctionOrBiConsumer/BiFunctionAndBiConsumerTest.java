package org.streams.BiFunctionOrBiConsumer;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionAndBiConsumerTest {

    private static void biFunction() {
        BiFunction<Integer, Integer, Integer> function = (x, y) -> x + y;
        System.out.println(function.apply(1, 2));

    }

    private static void biConsumer() {
        BiConsumer<Integer, Integer> function = (x, y) -> System.out.println(x + y);
        function.accept(2,3);

    }

    public static void main(String args[]) {
        biFunction();
        biConsumer();
    }

}
