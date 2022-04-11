package com.exceptionhandling;

public class Excepdemo {
    public static void main(String[] args) {
        try {
            int[] num = {1, 2, 3, 4};
            System.out.println(num[7]);
            System.out.println(num[2]);
         //   System.out.println(num[8]);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
