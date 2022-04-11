package com.collection;

import java.util.HashSet;

public class Hashseclone {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<>();
        h.add("thennavai");
        h.add("sports");
        h.add("11");
        h.add("hi");
        for (Object s:h){
            System.out.println(s);
        }
        HashSet<String>hc=new HashSet<>();
        hc=(HashSet) h.clone();
        for (Object s:hc){
            System.out.println(s);
        }

    }
}
