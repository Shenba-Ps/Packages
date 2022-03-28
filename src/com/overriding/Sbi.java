package com.overriding;

public class Sbi extends Bank{
    @Override
    void rate_of_interest() {
        System.out.println("4 percent");
    }
}
