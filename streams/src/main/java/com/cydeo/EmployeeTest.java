package com.cydeo;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        // Print all emails
        System.out.println("*******************************");
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        // Print all phone numbers
        System.out.println("*******************************");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);
        System.out.println("*******************************");
        EmployeeData.readAll()
                .flatMap(e -> e.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);
        System.out.println("*******************************");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}
