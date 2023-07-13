package com.skillsoft.classesandobjects;

public class Main {
    public static void main(String[] args) {
        Product phone = new Product(12345, "iPhone 6s",
                500, "Mobiles and Accessories");

        Product tv = new Product(84736, "Samsung",
                1500, "Electronics");

        Product shoes = new Product(28986, "Nike",
                300, "Footwear");

        Product watch = new Product(23452, "Rolex",
                800, "Mobiles and Accessories");

        System.out.println("Phone: " + phone);
        System.out.println("TV: " + tv);
        System.out.println("Shoes: " + shoes);
        System.out.println("Watch: " + watch);

        System.out.println();

        System.out.println("phone.equals(tv): " + (phone.equals(tv)));
        System.out.println("shoes.equals(watch): " + (shoes.equals(watch)));
        System.out.println("watch.equals(phone): " + (watch.equals(phone)));

        System.out.println();

        Product phoneCopy = phone;
        Product shoesCopy = shoes;

        System.out.println("phone.equals(phoneCopy): " + (phone.equals(phoneCopy)));
        System.out.println("shoes.equals(shoesCopy): " + (shoes.equals(shoesCopy)));
    }
}
