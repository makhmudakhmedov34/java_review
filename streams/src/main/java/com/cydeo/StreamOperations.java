package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,2,2,4,4,6,6,8);
        myList.forEach(System.out::println);

        //FILTER
        System.out.println("============Filter+Distinct=========");
        myList.stream()
                .filter(i -> i%2==0)
                .distinct()
                .forEach(System.out::println);

        //LIMIT
        System.out.println("============Limit=========");
        myList.stream()
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);

        //SKIP
        System.out.println("============Skip=========");
        myList.stream()
                .filter(i -> i%2==0)
                .skip(2).skip(3)
                .forEach(System.out::println);

        //MAP
        System.out.println("============Map=========");
        myList.stream()
                .filter(i -> i%2==0)
                .map(i -> i*10)
                .forEach(System.out::println);



    }

}
