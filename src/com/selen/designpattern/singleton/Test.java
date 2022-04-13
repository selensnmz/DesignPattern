package com.selen.designpattern.singleton;

public class Test {



    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
    }


}
