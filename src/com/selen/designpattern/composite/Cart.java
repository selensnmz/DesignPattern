package com.selen.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private String name;
    private List<Priceable> priceableList;

    public Cart(String name) {
        this.name = name;
        this.priceableList = new ArrayList<>();
    }

    public int totalPrice(){

        int total =0;

        for (Priceable priceable : priceableList) {
            total = total+(priceable.getPrice());
        }

        return total;
    }

    public String getName() {
        return name;
    }

    public void setAdi(String name) {
        this.name = name;
    }

    public List<Priceable> getPriceableList() {
        return priceableList;
    }

    public void setPriceableList(List<Priceable> priceableList) {
        this.priceableList = priceableList;
    }
}
