package com.selen.dependencyinjection.app2;

public class Main {
    public static void main(String[] args){
        AndroidDeveloper dev =new AndroidDeveloper();
        Customer customer = new Customer(dev);
        customer.createApp();
    }
}
