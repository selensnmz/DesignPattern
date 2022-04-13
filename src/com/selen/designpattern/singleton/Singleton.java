package com.selen.designpattern.singleton;

public class Singleton {

    private static Singleton instance;
    private Singleton(){
        System.out.println("nesne oluþturuldu.");

    }
    public static Singleton getInstance(){
        if(instance==null){
           instance=new Singleton();
            return instance;
        }else{
            System.out.println("nesne var");
            return instance;
        }


    }

}
