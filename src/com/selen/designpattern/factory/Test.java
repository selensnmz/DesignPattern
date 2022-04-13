package com.selen.designpattern.factory;

public class Test {

    public static void main(String[] args) {
        try {
            Asus asus = (Asus) ComputerFactory.createComputer(Asus.class);
            asus.name();
            asus.since(123);

            Mac mac = (Mac) ComputerFactory.createComputer(Mac.class);
            mac.name();

        }catch (Exception e){

             e.printStackTrace();

        }


    }
}
