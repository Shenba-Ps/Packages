package com.interfaceex;

public class Honda implements Car{
    @Override
    public void brand() {
        System.out.println("Brand name is honda");

    }

    @Override
    public void model() {
        System.out.println("Model is city");
    }

    @Override
    public void speed() {
        System.out.println("Speed is 230");
    }
}
