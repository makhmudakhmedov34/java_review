package com.cydeo.functionalinterfaces;

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();

        users.add(new User("Mike","Smith",27));
        users.add(User.builder().firstName("John").lastName("Wick").age(31).build());
        users.add(new User("Ahmet","Borov",15));
        users.add(new User("Emma","Ahberdi",32));

        // Print all elements in the test list

        printName(users,p->true);

        System.out.println();

        // Print all users that last name starts with E

        printName(users,p->p.getFirstName().startsWith("E"));

    }

    private static void printName(List<User> users, Predicate<User> p){
        for(User user:users){
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
