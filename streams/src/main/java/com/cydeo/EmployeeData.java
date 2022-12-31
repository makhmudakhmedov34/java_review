package com.cydeo;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Mike", "mike@cydeo.com", Arrays.asList("2023093454","2234450909")),
                new Employee(101,"Ozzy", "ozzy@cydeo.com", Arrays.asList("7033093454","7034450909")),
                new Employee(102,"Peter", "peter@cydeo.com", Arrays.asList("5163093454","5164450909"))

        );
    }
}
