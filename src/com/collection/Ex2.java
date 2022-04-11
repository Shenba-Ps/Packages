package com.collection;
import java.util.*;
public class Ex2 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        System.out.println(al.isEmpty());
        al.add("shenba");
        al.add("rajan");
        System.out.println(al.isEmpty());
        al.removeAll(al);
    }
}
