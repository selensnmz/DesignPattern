package com.selen.dependencyinjection.app3;

public class Customer {
    private IDeveloper developer;

    public Customer(IDeveloper developer) {

        this.developer =developer;
    }

    public void createApp() {

        developer.shouldDoAnApplication();
    }
}
