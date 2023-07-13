package com.skillsoft.classesandobjects;

public class Main {
    public static void main(String[] args) {
        Product phone = new Product(12345, "iPhone 6s",
                500, "Mobiles and Accessories");

        Product phoneCopy = phone;

        Product anotherPhone = new Product(12345, "iPhone 6s",
                500, "Mobiles and Accessories");

        Product anotherPhoneCopy = anotherPhone;

        System.out.println();

        System.out.println("\n****phone.equals(phoneCopy) is true so hashcodes equal");
        System.out.println("phone.hascode(): " + phone.hashCode());
        System.out.println("phoneCopy.hashcode(): " + phoneCopy.hashCode());

        System.out.println("\n****anotherPhone.equals(anotherPhoneCopy) is true so hashcodes equal");
        System.out.println("anotherPhone.hascode(): " + anotherPhone.hashCode());
        System.out.println("anotherPhoneCopy.hashcode(): " + anotherPhoneCopy.hashCode());

        System.out.println();

        Product watch = new Product(23452, "Rolex",
                800, "Mobiles and Accessories");

        Product watchCopy = watch;

        Product anotherWatch = new Product(23452, "Rolex",
                800, "Mobiles and Accessories");

        Product anotherWatchCopy = anotherWatch;

        System.out.println();

        System.out.println("\n****watch.equals(watchCopy) is true so hashcodes equal");
        System.out.println("watch.hascode(): " + watch.hashCode());
        System.out.println("watchCopy.hashcode(): " + watchCopy.hashCode());

        System.out.println("\n****anotherWatch.equals(anotherWatchCopy) is true so hashcodes equal");
        System.out.println("anotherWatch.hascode(): " + anotherWatch.hashCode());
        System.out.println("anotherWatchCopy.hashcode(): " + anotherWatchCopy.hashCode());

        System.out.println();

//        Product tv = new Product(84736, "Samsung",
//                1500, "Electronics");
//
//        Product anotherTv = new Product(84736, "Samsung",
//                1500, "Electronics");
//
//        System.out.println("TV: " + tv);
//        System.out.println("Another TV: " + anotherTv);
//
//        System.out.println();
//
//        System.out.println("tv == anotherTv: " + (tv == anotherTv));
//        System.out.println("tv.equals(anotherTv): " + (tv.equals(anotherTv)));
//
//        System.out.println();
    }
}
