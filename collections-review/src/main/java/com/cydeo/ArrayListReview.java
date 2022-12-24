package com.cydeo;

import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        // Create Array List and class
        List<Student> students = new ArrayList<>();
        // Add Elements to ArrayList
        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Sayed"));
        students.add(new Student(3,"Nick"));
        students.add(new Student(4,"Ronnie"));
        System.out.println(students);
        System.out.println();

        // Iteration on ArrayList
            // 1. For Loop with get(index)
            // 2. Iterator
                // Forward Iteration
        for(int i=0;i<students.size();i++) System.out.println(students.get(i));
        System.out.println();
                
        Iterator iter = students.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println();

        // Backwards Iteration
//        while (((ListIterator<?>)iter).hasPrevious()){
//            System.out.println(((ListIterator<?>) iter).previous());
//        }
            // 3. for each loop
        for(Student student:students) System.out.println(student);
            // 4. Lambda
        System.out.println();
            students.forEach(student -> System.out.println(student));
        // Sorting Elements in List
        System.out.println();
        Collections.sort(students,new sortByIdDesc());
        System.out.println(students);

        System.out.println();
        Collections.sort(students,new sortByNameDesc());
        System.out.println(students);
    }

    static class sortByIdDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}