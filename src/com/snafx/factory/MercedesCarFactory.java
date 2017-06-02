package com.snafx.factory;

public class MercedesCarFactory implements CarFactory {
    @Override
    public Car buildCar(String model) {
        Car car = null;
        if (model.equals("S600")) {
            Engine engine = new Engine(300, 3000, "petrol");
            Wheels wheels = new Wheels(19, "summmer");
            car = new Mercedes("S600", engine, wheels);
        } else if (model.equals("E220d")) {
            Engine engine = new Engine(189, 1999, "diesel");
            Wheels wheels = new Wheels(17, "winter");
            car = new Mercedes("E220d", engine, wheels);
        } else if (model.equals("G65 AMG")) {
            Engine engine = new Engine(545, 4200, "petrol");
            Wheels wheels = new Wheels(22, "summmer");
            car = new Mercedes("G65 AMG", engine, wheels);
        }
        return car;
    }
}
