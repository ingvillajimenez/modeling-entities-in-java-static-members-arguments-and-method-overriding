package com.skillsoft.classesandobjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Audi A5", "Sedan", 41800);

        System.out.println("Inside main() BEFORE function invocation: " + car);

        updateCar(car);

        System.out.println("\nInside main() AFTER function invocation: " + car);
    }

    private static void updateCar(Car car) {
        System.out.println("\noriginal (inside function): " + car);

        car.setName("Honda Accord");
        car.setPrice(24500);

        System.out.println("car after reassignment (inside function): " + car);
    }
}
