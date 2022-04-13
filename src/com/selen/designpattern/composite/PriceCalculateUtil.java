package com.selen.designpattern.composite;

import java.util.List;


public class PriceCalculateUtil {

    public static int getTotalProductPrice(List<Product> productList){

        int total = 0;

        for (Product product : productList) {
            total = total+(product.getPrice());
        }

        return total;
    }

    public static int getTotalPackagePrice(List<Package> packageList){

        int total = 0;

        for (Package package1 : packageList) {
            total = total+(package1.getPrice());
        }

        return total;
    }
}
