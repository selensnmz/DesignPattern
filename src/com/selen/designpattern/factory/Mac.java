package com.selen.designpattern.factory;

public class Mac implements Computer{
    @Override
    public void name() {
        System.out.println("Bilgisayar markasý Mac");
    }

    @Override
    public void since(int year) {
        System.out.println(year+"senesinde alýnmýþ");
    }
}
