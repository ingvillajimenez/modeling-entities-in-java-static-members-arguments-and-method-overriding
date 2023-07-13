package com.skillsoft.classesandobjects;

public class Main {
    public static void main(String[] args) {

        Double num = 10.11;

        System.out.println("Inside main() BEFORE function invocation: " + num);

        incrementNumber(num);

        System.out.println("\nInside main() AFTER function invocation: " + num);
    }

    private static void incrementNumber(Double num) {

        System.out.println("\noriginal num (inside function): " + num);

        num = 5000000.999;

        System.out.println("num after the increment (inside function): " + num);
    }
}
