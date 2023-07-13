package com.skillsoft.classesandobjects;

public class Main {
    public static void main(String[] args) {

        Cookie c1 = new Cookie("abc12", "Alice22", "ali@22", 2);
        System.out.println("\n(c1): " + c1);
        System.out.println("Cookie Type (c1): " + c1.cookieType);

        Cookie c2 = new Cookie("abc22", "Bob667", "B#t12", 0);
        System.out.println("\n(c2): " + c2);
        System.out.println("Cookie Type (c2): " + c2.cookieType);

        Cookie c3 = new Cookie("abc34", "Charles", "C223", 4);
        System.out.println("\n(c3): " + c3);
        System.out.println("Cookie Type (c3): " + c3.cookieType);

        Cookie.cookieType = "LOGGED_OUT_USER_COOKIE";

        System.out.println("\n*********");
        System.out.println("Updated Static Variable: " + Cookie.cookieType);
        System.out.println("*********");

        System.out.println("\nCookie Type (c1): " + c1.cookieType);
        System.out.println("\nCookie Type (c2): " + c2.cookieType);
        System.out.println("\nCookie Type (c3): " + c3.cookieType);
    }
}