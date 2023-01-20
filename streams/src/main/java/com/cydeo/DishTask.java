package com.cydeo;

import java.util.Comparator;
import java.util.Optional;

public class DishTask {
    public static void main(String[] args) {

        // Print all dish's name that has less than 400 calories
        System.out.println("*******************************");
        DishData.getAll().stream()
                .filter(i -> i.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);
        // Print the length of the name of each dish
        System.out.println("*******************************");
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);
        // Print Three High Caloric Dish Name(>300)
        System.out.println("*******************************");
        DishData.getAll().stream()
                .filter(d -> d.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);
        // Print all dish name that are below 400 calories in sorted
        System.out.println("*******************************");
        DishData.getAll().stream()
                .filter(d -> d.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);
        //Count number of dishes
        System.out.println("*******************************");
       int dishCount  = DishData.getAll().stream()
                .map(d ->1)
                .reduce(0,(a,b) -> a+b);
        System.out.println(dishCount);

        long dishCount2  = DishData.getAll().stream()
                .count();
        System.out.println(dishCount2);

    }
}
