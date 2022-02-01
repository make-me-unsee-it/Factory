package com;

class LuxCarFactory implements CarFactory {
    public Car createCar() {
        return new LuxCar();
    }
}
