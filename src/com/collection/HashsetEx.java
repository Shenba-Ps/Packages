package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class HashsetEx {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<>();
        l.add("kayal");
        l.add("ramya");
        l.add("kayalvizhi");
        System.out.println(l.get(0));
        HashSet<String> hs=new HashSet<>(l);
        hs.add("shenba");
        hs.add("rajan");
        hs.add("thiva");
        hs.add("sathish");
        System.out.println();


     //hashset ignore duplicates
//        System.out.println(hs.isEmpty());
////        hs.remove("shenba");
//        System.out.println(hs);
////        Iterator<String> itr=hs.iterator();
////        while (itr.hasNext()){
////            System.out.println(itr.next());
//        HashSet<String> hs2=new HashSet<String>();
//        hs2.add("seetha");
//        hs2.add("suriya");
//        hs.addAll(hs2);
//        System.out.println(hs2);
//        //remove all new element
//        hs.removeAll(hs2);
//        System.out.println("after removing new elements :"+ "   " +hs);
//        hs.removeIf(s -> s.contains("shenba"));
//        System.out.println(hs);
//        hs.clear();
//        System.out.println("after clear :"+ "  " +hs);
        Iterator<String> itr= hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(hs.contains("rajan"));

        }

    }

