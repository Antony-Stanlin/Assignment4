package com.inheritance.vehicle;
public class VehicleHierarchy {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla");
        Vehicle motorcycle = new MotorCycle("Harley-Davidson", "Sportster");

        car.start();
        car.stop();
        System.out.println();

        motorcycle.start();
        motorcycle.stop();
    }
}
