package com.exceptionhandling;



public class Exceptiondemo3 {
    public static void main(String[] args) throws Exception {
        try {
            validate(15);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
    public static void validate(int age) throws Exception{
        if(age< 18){
            throw new Exception("Person is not eligible");
        }else{
            System.out.println("person is eligible");
        }

    }
}





