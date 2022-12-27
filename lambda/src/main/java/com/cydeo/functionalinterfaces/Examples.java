package com.cydeo.functionalinterfaces;

import java.util.function.*;

public class Examples {

    public static void main(String[] args) {
        // ************ Predicate *******************//

//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };
//
//        lesserThan.test(50);

    Predicate<Integer> lesserThan = i -> i<18;
        System.out.println("lesserThan.test(20) = " + lesserThan.test(20));


        // ************ Consumer *******************//

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(100);

        // ************ BiConsumer *******************//

        BiConsumer<Integer,Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(100,200);

        // ************ Function *******************//

        Function<String,String> fun = s -> "Hello " +s;
        String str = fun.apply("Java");
        System.out.println(str);

        // ************ Supplier *******************//

        Supplier<Double> random = () -> Math.random();
        System.out.println("random.get() = " + random.get());
    }
}
