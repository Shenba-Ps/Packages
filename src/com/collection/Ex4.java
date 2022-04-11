package com.collection;
import java.util.*;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("shenba");
        name.add("rajan");
        name.add("pradeep");
        name.add("suriya");
        name.add("karthick");
        Collections.sort(name);
        for(String names:name){
            System.out.println(names);
        }
        Collections.sort(name,Collections.reverseOrder());
        System.out.println("after reverse");
        for (String names:name){
            System.out.println(names);
        }
        System.out.println(name.clone());
    }

}
