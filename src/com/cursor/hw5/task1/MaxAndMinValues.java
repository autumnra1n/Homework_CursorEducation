package com.cursor.hw5.task1;

import java.util.Collections;

public class MaxAndMinValues extends Main {
    void largest() {
        System.out.println("Largest value is: " + Collections.max(myList.getListOfArguments()));
    }

    void smallest() {
        System.out.println("Smallest value is: " + Collections.min(myList.getListOfArguments()));
    }
}
