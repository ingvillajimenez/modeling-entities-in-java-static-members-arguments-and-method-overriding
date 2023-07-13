package com.skillsoft.classesandobjects;

public class Main {
    public static void main(String[] args) {
        Product phone = new Product(12345, "iPhone 6s",
                500, "Mobiles and Accessories");

        Product anotherPhone = new Product(12345, "iPhone 6s",
                500, "Mobiles and Accessories");

        System.out.println("Phone: " + phone);
        System.out.println("Another phone: " + anotherPhone);

        System.out.println();

        System.out.println("phone == anotherPhone: " + (phone == anotherPhone));
        System.out.println("phone.equals(anotherPhone): " + (phone.equals(anotherPhone)));

        System.out.println();
    }
}
