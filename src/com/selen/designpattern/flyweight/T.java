package com.selen.designpattern.flyweight;

public class T implements Piece {

    //instensic state
    private String label;

    //exstensic state
    String color;
    int speed;

    public T(){

        label = "T";
    }

    public void create(String color, int speed) {
        this.color=color;
        this.speed=speed;
        System.out.println("Piece is " + this.label + ", color: " +this.color + ", speed: " + this.speed);
    }
}