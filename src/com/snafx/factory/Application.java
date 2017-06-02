package com.snafx.factory;

public class Application {
    public static void main(String[] args) {
//        AudiCarFactory audiCarFactory = new AudiCarFactory();
//        Car car = audiCarFactory.buildCar("A4");

        AbstractCarFactory abstractCarFactory = new AbstractCarFactory();
        Car car = abstractCarFactory.buildAudiCar("A4");
        Car car2 = abstractCarFactory.buildBMWCar("320d");
        Car car3 = abstractCarFactory.buildMercedesCar("S600");


    }
}
