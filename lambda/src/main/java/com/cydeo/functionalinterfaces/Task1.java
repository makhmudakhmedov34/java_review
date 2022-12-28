package com.cydeo.functionalinterfaces;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");
        words.stream()
                .map(String::length)
                .filter(i -> i%2==0)
                .forEach(System.out::println);

    }
}
