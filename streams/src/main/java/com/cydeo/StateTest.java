package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {

        State ny = new State();
        ny.addCity("Brooklyn");
        ny.addCity("Quence");
        ny.addCity("Bronx");
        ny.addCity("Manhattan");

        State tx = new State();
        tx.addCity("Dallas");
        tx.addCity("Huston");
        tx.addCity("Austin");
        tx.addCity("San Antonio");

        List<State> stateList = Arrays.asList(ny,tx);
        stateList.stream()
                .map(state -> state.getCities())
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
