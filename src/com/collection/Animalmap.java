package com.collection;

import java.util.HashMap;
import java.util.Map;

public class Animalmap {
    public static void main(String[] args) {
        HashMap<Integer,Zoo> map=new HashMap<Integer, Zoo>();
        Zoo a1 = new Zoo("lion", 12, 5);
        map.put(0,a1);
        Zoo a2 = new Zoo("tiger", 10, 50);
        map.put(1,a2);
        Zoo a3 = new Zoo("cheeta", 9, 60);
        map.put(2,a3);
//        Set set=map.entrySet();


        for (Map.Entry<Integer, Zoo> m: map.entrySet()){
//            Zoo z=m.getValue();
//            System.out.println(z);


            System.out.println(m.getKey()+   "  "+ m.getValue().getAge()+ " " +m.getValue().getAnimalName());
        }
    }
}
