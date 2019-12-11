package com.cursor.hw5.task1;

import java.util.ArrayList;
import java.util.List;

class MyList<T extends Number> {

    private List<T> listOfArguments = new ArrayList<T>();

    List<T> getListOfArguments() {
        return listOfArguments;
    }

    void add(T argument) {
        this.listOfArguments.add(argument);
    }
}
