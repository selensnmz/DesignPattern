package com.selen.designpattern.factory;

public class Asus implements Computer{
    @Override
    public void name() {
        System.out.println("Bilgisayar markas� Asus");
    }

    @Override
    public void since(int year) {
        System.out.println(year+"senesinde al�nm��");
    }
}
