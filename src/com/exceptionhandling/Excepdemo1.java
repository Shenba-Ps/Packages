package com.exceptionhandling;

public class Excepdemo1 {
    public static void main(String[] args) {
        try {
            int a = 100;
            System.out.println(a);
            int b = 100/0;

            System.out.println(b);

        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("this is shenba");
    }
}
