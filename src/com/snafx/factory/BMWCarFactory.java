package com.snafx.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class BMWCarFactory implements CarFactory {
    @Override
    public Car buildCar(String model) {
        Car car = null;
        if (model.equals("M4")) {
            Engine engine = new Engine(420, 3000, "petrol");
            Wheels wheels = new Wheels(20, "summmer");
            car = new BMW("M4", engine, wheels);
        } else if (model.equals("320d")) {
            Engine engine = new Engine(163, 1999, "diesel");
            Wheels wheels = new Wheels(16, "summmer");
            car = new BMW("320d", engine, wheels);
        } else if (model.equals("740d")) {
            Engine engine = new Engine(385, 3000, "diesel");
            Wheels wheels = new Wheels(21, "summmer");
            car = new BMW("740d", engine, wheels);
        }
        return car;


    }
}
