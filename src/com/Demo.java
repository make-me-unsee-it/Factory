package com;

public class Demo {
    public static void main(String[] args) {
        CarFactory myLuxFactory = new LuxCarFactory();
        CarFactory myBasicFactory = new BasicCarFactory();

        Car myLuxCar = myLuxFactory.createCar();
        Car myBasicCar = myBasicFactory.createCar();

        System.out.println(myLuxCar);
        System.out.println(myBasicCar);
    }
}
