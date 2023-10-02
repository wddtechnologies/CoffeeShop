package com.example.coffeeshopfinal;

public class Drinks {


    private String name;
    private String size;
    private String extras; // milk, cream, sugar, whipped cream
    private int quantity;
    private double price; // Price per drink



    // Constructor, getters, and setters
    public Drinks() {
    }

    public Drinks(String name, String size, String extras) {
        this.name = name;
        this.size = size;
        this.extras = extras;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }
}


