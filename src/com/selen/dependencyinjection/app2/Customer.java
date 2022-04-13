package com.selen.dependencyinjection.app2;

public class Customer {
    private AndroidDeveloper developer;

    public Customer(AndroidDeveloper developer) {

        this.developer =developer;
    }

    public void createApp() {

        developer.shouldDoAnApplication();
    }
}
