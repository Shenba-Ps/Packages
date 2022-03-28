package com.overriding;

public class Icic extends Bank{
    @Override
    void rate_of_interest() {
//        super.rate_of_interest();
        System.out.println("10 percent");
    }
}
