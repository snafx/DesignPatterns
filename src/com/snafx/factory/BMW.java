package com.snafx.factory;

public class BMW implements Car {

    private String model;
    private Engine engine;
    private Wheels wheels;

    public BMW(String model, Engine engine, Wheels wheels) {
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Override
    public void drive() {
        System.out.println("Driving with BMW");
        System.out.println("Engine: " + engine.toString());
        System.out.println("Wheels: " + wheels.toString());
    }
}
