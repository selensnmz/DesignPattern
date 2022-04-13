package com.selen.dependencyinjection.app3;

public class Main {
    public static void main(String[] args){
        AndroidDeveloper androidDeveloper =new AndroidDeveloper();
        IOSDeveloper iosDeveloper=new IOSDeveloper();
        Customer customer = new Customer(androidDeveloper);
        customer.createApp();
        Customer customer1 = new Customer(iosDeveloper);
        customer1.createApp();

    }
}
