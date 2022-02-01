package com;

class BasicCarFactory implements CarFactory {
    public Car createCar() {
        return new BasicCar();
    }
}
