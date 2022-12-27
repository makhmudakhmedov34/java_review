package com.cydeo.functionalinterfaces;

import java.util.function.Predicate;

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

    }
}
