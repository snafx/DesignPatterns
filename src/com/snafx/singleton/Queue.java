package com.snafx.singleton;


import java.util.ArrayList;
import java.util.List;

public class Queue {
    //jest kolejka FIFO

    private static Queue instance = null;

    public static Queue getInstance() {
        if (instance == null) {
            instance = new Queue();
        }
        return instance;
    }

    private Queue() {
        values = new ArrayList<>();
    }

    //linie 10-21 wzorzec Singleton

    private List<String> values;

    public void push (String value) {
        values.add(value);
    }

    public String pop() {
        String valueToReturn = null;
        if (values.size()>0) {
            valueToReturn = values.remove(0);
        }
        return valueToReturn;
    }
}
