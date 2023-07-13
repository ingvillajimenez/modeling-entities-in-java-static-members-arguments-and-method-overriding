package com.skillsoft.classesandobjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] arrayOfFruits = new String[] {"apple", "banana", "kiwi", "strawberry"};

        System.out.println("Inside main() BEFORE function invocation: " +
                Arrays.toString(arrayOfFruits));

        updateArray(arrayOfFruits, 0, "PAPAYA");

        System.out.println("\nInside main() AFTER function invocation: " +
                Arrays.toString(arrayOfFruits));

        updateArray(arrayOfFruits, 1, "MANGO");

        System.out.println("\nInside main() AFTER second function invocation: " +
                Arrays.toString(arrayOfFruits));

    }

    private static void updateArray(String[] arrayOfFruits, int indexToUpdate, String fruit) {
        System.out.println("\noriginal (inside function): " +
                Arrays.toString(arrayOfFruits));

        arrayOfFruits[indexToUpdate] = fruit;

        System.out.println("array after reassignment (inside function): " +
                Arrays.toString(arrayOfFruits));
    }
}
