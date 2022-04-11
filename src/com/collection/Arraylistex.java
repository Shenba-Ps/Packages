package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.*;

public class Arraylistex {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(22);
        l.add(33);
        l.add(23);
        l.add(22);
        l.add(32);
        l.add(22);
        Integer max=Collections.max(l);
        System.out.println("maximum value is"+  "; " +max);

        System.out.println( l.lastIndexOf(22));
        System.out.println(l.subList(0,5));
        l.set(1,55);
        System.out.println(l);
        List<String> ls=new ArrayList<>();
        ls.add("shenba");
        ls.add("rajan");
        ls.add("smt");
        ls.replaceAll(e->e.toUpperCase(Locale.ROOT));
        System.out.println(ls);
    }
}
