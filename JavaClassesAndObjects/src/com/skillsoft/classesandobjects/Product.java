package com.skillsoft.classesandobjects;

public class Product {

    private int id;
    private String name;
    private double price;
    private String category;

    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("Product name: %s, price: %.1f, category: %s", name, price, category);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (this == other) {
            return true;
        }

        if (!(other instanceof Product)) {
            return false;
        }

        Product product = (Product) other;

        // NOTE: Compare every field which makes sense for equality
        // Primitive types are compared using ==, Objects are compared using .equals()
        if (this.id == product.id &&
                this.name.equals(product.name) &&
                this.price == product.price &&
                this.category.equals(product.category)) {

            return true;
        }

        return false;
    }

}
