package com.collection;

import java.util.HashSet;
import java.util.*;

public class Hashsetex2 {
    private static HashSet init(){
        HashSet<String> student=new HashSet<>();
        student.add("shenba");
        student.add("rajan");
        return student;
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        HashSet student=init();
        System.out.println("enter the name");
        String name=scan.nextLine();
        if (student.contains(name)){
            System.out.println("the name found"+ " " +name);
        }
        else {
            System.out.println("name not found");
        }
    }
}
