package com.selen.designpattern.composite;

import java.util.ArrayList;
import java.util.List;


public class Package implements Priceable {

    private String name;
    private List<Product> productList;

    public Package(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
    }

    @Override
    public int getPrice() {

        return PriceCalculateUtil.getTotalProductPrice(productList);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
