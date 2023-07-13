package com.skillsoft.classesandobjects;

public class Main {
    public static void main(String[] args) {
        Product phone = new Product(12345, "iPhone 6s",
                500, "Mobiles and Accessories");

        Product phoneCopy = phone;

        Product anotherPhone = new Product(12345, "iPhone 6s",
                500, "Mobiles and Accessories");

        System.out.println();

        System.out.println("***All three phone hashcodes should be the same");
        System.out.println("phone.hashcode(): " + phone.hashCode());
        System.out.println("phoneCopy.hashcode(): " + phoneCopy.hashCode());
        System.out.println("anotherPhone.hashcode(): " + anotherPhone.hashCode());

        System.out.println();

        Product watch = new Product(23452, "Rolex",
                800, "Mobiles and Accessories");

        Product watchCopy = watch;

        Product anotherWatch = new Product(23452, "Rolex",
                800, "Mobiles and Accessories");

        System.out.println();

        System.out.println("***All three watch hashcodes should be the same");
        System.out.println("watch.hashcode(): " + watch.hashCode());
        System.out.println("watchCopy.hashcode(): " + watchCopy.hashCode());
        System.out.println("anotherWatch.hashcode(): " + anotherWatch.hashCode());

        System.out.println();
    }
}
