package com.inheritance.vehicle;

public class MotorCycle extends Vehicle {
    public MotorCycle(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle " + getDetails() + " is starting with a vroom!");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle " + getDetails() + " is stopping.");
    }
}