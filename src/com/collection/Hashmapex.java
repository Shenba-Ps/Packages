package com.collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmapex {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(11,"shenba");
        hm.put(12,"rajan");
        hm.put(14,"suruthi");
        hm.put(15,"shen");
        hm.replace(15,"thivakar");

        for (Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+  ":" +m.getValue());
        }
        hm.putIfAbsent(13,"raj");
        System.out.println(hm);
        HashMap<Integer,String> hm2=new HashMap<>();
        hm2.put(16,"sathish");
        hm2.putAll(hm);
        hm2.remove(15);
        System.out.println(hm2);
    }
}
