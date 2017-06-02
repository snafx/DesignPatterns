package com.snafx.factory;

public class Engine {
    private int horsePower;
    private int capacity;
    private String type;

    public Engine(int horsePower, int capacity, String type) {
        this.horsePower = horsePower;
        this.capacity = capacity;
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}
