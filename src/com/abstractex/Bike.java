package com.abstractex;

public abstract class Bike {
    Bike(){
        System.out.println("New bike");
    }
    public abstract void run();
    public void setGear(){
        System.out.println("third gear");
    }
}
