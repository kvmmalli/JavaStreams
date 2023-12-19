package org.streams.ConsumerAndSupplier;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerTest {

    private static void consumer(List<String> names)
    {
        Consumer<String> consume = (con) -> System.out.println(con);
        names.forEach(consume);
    }
    private static void supplier()
    {
        Supplier<Double> supply =  Math::random;
        System.out.println(supply.get());
    }
    public static void main(String args[])
    {
       consumer(List.of("A", "B", "C", "D"));
       supplier();
    }
}
