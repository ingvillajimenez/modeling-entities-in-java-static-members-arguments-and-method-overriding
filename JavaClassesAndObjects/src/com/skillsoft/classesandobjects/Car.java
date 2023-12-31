package com.skillsoft.classesandobjects;

public class Car {
    private String name;
    private String type;
    private float mpg;
    private int price;

    public Car() {

    }

    public Car(String name) {

        this.name = name;
    }

    public Car(String name, String type) {
        this(name);

        this.type = type;
    }

    public Car(String name, String type, float mpg) {
        this(name, type);

        this.mpg = mpg;
    }

    public Car(String name, String type, float mpg, int price) {
        this(name, type, mpg);

        this.price = price;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public float getMpg() {
        return mpg;
    }

    public void setMpg(float mpg) {

        this.mpg = mpg;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    @Override
    public String toString() {

        return String.format("Name: %s, Type: %s, MPG: %.1f, Price: %d\n",
                name, type, mpg, price);
    }
}
