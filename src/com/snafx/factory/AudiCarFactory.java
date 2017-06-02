package com.snafx.factory;

public class AudiCarFactory implements CarFactory {

    @Override
    public Car buildCar(String model) {
        Car car = null;
        if (model.equals("A4")) {
            Engine engine = new Engine (200, 3000, "diesel");
            Wheels wheels = new Wheels(18, "summer");
            car = new Audi ("A4", engine, wheels);
        } else if (model.equals("tt")) {
            Engine engine = new Engine (160, 1800, "diesel");
            Wheels wheels = new Wheels(17, "summer");
            car = new Audi ("TT", engine, wheels);
        } else if (model.equals("Q7")) {
            Engine engine = new Engine (365, 3000, "diesel");
            Wheels wheels = new Wheels(21, "summer");
            car = new Audi ("Q7", engine, wheels);
        }
        return car;
    }
}
