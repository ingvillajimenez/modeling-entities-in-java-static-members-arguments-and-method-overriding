package com.skillsoft.classesandobjects;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n**** Static functions always invoked on a class");
        System.out.println("Initial value of cookie type: " + Cookie.getCookieType());

        Cookie.setCookieType("LOGGED_OUT_USER_COOKIE");

        System.out.println("Updated value of cookie type: " + Cookie.getCookieType());
    }
}