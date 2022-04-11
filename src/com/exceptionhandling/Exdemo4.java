package com.exceptionhandling;

public class Exdemo4 {
    public static void main(String[] args) throws Exception {
        try {
            Exdemo4 x = new Exdemo4();
            System.out.println(x.size("rajan"));
            System.out.println(x.size("shenba"));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

     public String size(String n) throws Exception{
        if(n == "shenba"){
            throw new Exception ("input is shenba");
        }
        return n;
    }

}

