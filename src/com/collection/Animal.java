package com.collection;

import java.util.*;

public class Animal {
    public static void main(String[] args) {
        List<Zoo> ls = new ArrayList<Zoo>();
        Zoo a1 = new Zoo("lion", 12, 5);
        ls.add(a1);
        Zoo a2 = new Zoo("tiger", 101, 50);
        ls.add(a2);
        Zoo a3 = new Zoo("cheeta", 99, 60);
//        ls.add(a3);
        a3.setAnimalName("dog");
        a3.getAnimalName();
        ls.add(a3);



        Iterator itr = ls.iterator();
        while (itr.hasNext()) {
          Zoo a = (Zoo) itr.next();
            System.out.println(a.getAnimalName() + ":" + a.getAge() + ":" + a.getCount());



        }
//        Zoo max= (Zoo) Collections.max(ls);
        System.out.println();
        int sum = 0;
        double ave = 0;
        for (Zoo i : ls) {
            sum += i.getAge();
            ave = sum / ls.size();

            }
        for (Zoo i:ls){
            Zoo z = ls.stream()
                    .max(Comparator.comparingInt(Zoo::getAge))
                    .get();
            System.out.println(z.getAge());
            break;
        }



//        System.out.println(ave);
    }
}
