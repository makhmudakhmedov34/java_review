package com.cydeo;

import java.util.*;
import java.util.stream.Collectors;



public class JavaCollectors {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,6,6,7);

        // toCollection(Supplier) : is used to create a collection using collector
        System.out.println("***********toCollection()************");
        ArrayList<Integer> list1 = list.stream()
                .filter(i -> i%2==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list1);

        System.out.println("***********toCollection(HashSet)************");
        Set<Integer> numberSet = list.stream()
                .filter(i -> i%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        // toList() : returns a Collector interface that gathers the input data a new list
        System.out.println("***********toList()************");
         List<Integer> numbersList = list.stream()
                .filter(i -> i%2==0)
                 .collect(Collectors.toList());
        System.out.println(numbersList);

        // toSet() : returns a Collector interface that gathers the input data a new Set
        System.out.println("***********toSet()************");

        Set<Integer> numbersSet2 = list.stream()
                .filter(i -> i%2==0)
                .collect(Collectors.toSet());
        System.out.println(numbersSet2);

        // toMap(Function,Function) : returns a Collector interface that gathers the input data a new Map
        System.out.println("***********toMap()************");
        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        // counting(): returns a Collector that counts the numbers of the elements
        System.out.println("***********counting()************");
        Long evenCount = list.stream()
                .filter(i -> i%2==0)
                .collect(Collectors.counting());
        System.out.println(evenCount);

        // summingInt(ToIntFunction): returns a Collector that produces the sum of the integer value
        System.out.println("***********summingInt()************");
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        // averagingInt(ToIntFunction) : returns the average of the integers passed values
        System.out.println("***********averagingInt()************");
       Double caloriesAvg = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(caloriesAvg);

        // joining() : is used to join various elements of a character or string array into a single string object
        System.out.println("***********joining()************");
        List<String> courses = Arrays.asList("Java","JS","TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));

        System.out.println(str);

        //partitioningBy() : is used to partition a stream of objects(or stream of elements) based on a  given predicate
        System.out.println("***********partitioningBy()************");
        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(veggieDish);

        //groupingBy() : is  used for grouping objects by some property and storing in a map
        System.out.println("***********groupingBy()************");
        Map<Type,List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishType);

    }
}
