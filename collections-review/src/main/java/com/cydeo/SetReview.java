package com.cydeo;

import java.util.HashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {
        // 1. Create a set
        Set<Student> mySet = new HashSet<>();

        // 2. add element
        mySet.add(new Student(7,"Idabet"));
        mySet.add(new Student(8,"Ahmet"));
        mySet.add(new Student(9,"Muhabbet"));
        mySet.add(new Student(9,"Muhabbet"));

        System.out.println(mySet);

        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(1);
        numberSet.add(2);

        System.out.println(numberSet);
        System.out.println(numberSet.add(2));

        System.out.println("First repeating: "+firstRepeatingChar("java developer"));

    }

    public static Character firstRepeatingChar(String str){
        // Create a hashmap
        Set<Character> chars = new HashSet<>();
        // Iteration return ch if add returns false
        for(Character ch:str.toCharArray()) if(!chars.add(ch)) return ch;
        return null;
    }
}
