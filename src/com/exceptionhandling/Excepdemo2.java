package com.exceptionhandling;

public class Excepdemo2 {
    public static void main(String[] args) {
        try {
            String a = "shenba";
            int b = 22;
            String c = a+b;
            String d = c;
            System.out.println(d);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
