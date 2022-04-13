package com.selen.designpattern.composite;


public class Test {

    public static void main(String[] args) {

        Product domates = new Product("Domates", 10);
        Product patates = new Product("Patates",20);
        Product sogan = new Product("Soğan", 30);

        Package sebzePaketi = new Package("Sebze Paketi");
        sebzePaketi.getProductList().add(domates);
        sebzePaketi.getProductList().add(patates);
        sebzePaketi.getProductList().add(sogan);

        Product sesSistemi = new Product("Ses Sistemi", 5000);
        Product kulaklik = new Product("Kulaklik", 1000);

        Package teknolojiPaketi = new Package("TeknolojiPaketi");
        teknolojiPaketi.getProductList().add(sesSistemi);
        teknolojiPaketi.getProductList().add(kulaklik);

        Product futbolTopu = new Product("Futbol Topu", 100);

        Product yag = new Product("Yağ", 50);



        Cart sepet = new Cart("Benim Sepetim");
        sepet.getPriceableList().add(sebzePaketi);
        sepet.getPriceableList().add(teknolojiPaketi);
        sepet.getPriceableList().add(futbolTopu);


        int totalPrice = sepet.totalPrice();

        System.out.println("Ödenecek Tutar = " + totalPrice + " TL");
    }
}
