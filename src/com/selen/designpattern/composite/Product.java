package com.selen.designpattern.composite;

public class Product implements Priceable {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {

        return this.price;
    }

    public String getName() {
        return name;
    }

    public void setAdi(String name) {
        this.name = name;
    }

    public void setPrice(int fiyat) {
        this.price = price;
    }
}
