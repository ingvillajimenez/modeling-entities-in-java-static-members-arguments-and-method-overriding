package com.skillsoft.classesandobjects;

import java.util.Random;

public class Cookie {

    private static final Random uniqueIdGenerator = new Random();
    private static String cookieType = "SESSION_COOKIE";

    private String id;
    private String userName;
    private String sessionKey;
    private int itemsInCart;

    public Cookie(String userName, String sessionKey, int itemsInCart) {

        this.id = "cookieId-" + uniqueIdGenerator.nextInt();

        this.userName = userName;
        this.sessionKey = sessionKey;
        this.itemsInCart = itemsInCart;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public int getItemsInCart() {
        return itemsInCart;
    }

    public void setItemsInCart(int itemsInCart) {
        this.itemsInCart = itemsInCart;
    }

    public static String getCookieType() {
        return cookieType;
    }

    public static void setCookieType(String cookieType) {
        Cookie.cookieType = cookieType;
    }

    @Override
    public String toString() {

        return String.format("Cookie id: %s, userName: %s, sessionKey: %s, itemsInCart: %d",
                id, userName, sessionKey, itemsInCart);
    }

    public static void main(String[] args) {

        System.out.println("\nExecuting code in the Cookies class main() method");

        Cookie c = new Cookie("Alice22", "ali@22", 2);
        c.instanceMethodOne();
        c.instanceMethodTwo();
        c.instanceMethodThree();
    }

    private void instanceMethodOne() {
        System.out.println("\nInstance method one");

        staticMethodOne();
    }

    private void instanceMethodTwo() {
        System.out.println("\nInstance method two");

        staticMethodTwo();
    }

    private void instanceMethodThree() {
        System.out.println("\nInstance method three");

        staticMethodThree();
    }

    private static void staticMethodOne() {
        System.out.println("\nStatic method one");
    }

    private static void staticMethodTwo() {
        System.out.println("\nStatic method two");
    }

    private static void staticMethodThree() {
        System.out.println("\nStatic method three");
    }
}
