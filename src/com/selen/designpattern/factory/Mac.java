package com.selen.designpattern.factory;

public class Mac implements Computer{
    @Override
    public void name() {
        System.out.println("Bilgisayar markas� Mac");
    }

    @Override
    public void since(int year) {
        System.out.println(year+"senesinde al�nm��");
    }
}
