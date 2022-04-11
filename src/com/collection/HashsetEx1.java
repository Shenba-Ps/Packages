package com.collection;
import java.util.*;

import java.util.Collections;
import java.util.HashSet;

import static java.util.Collections.*;

public class HashsetEx1 {
    public static void main(String[] args) {
        HashSet<Zoo> set=new HashSet<Zoo>();
        Zoo a1=new Zoo("camel",10,55);
        set.add(a1);
        Zoo a2=new Zoo("giraffe",2,4);
        set.add(a2);
        Zoo a3=new Zoo("horse",11,20);
        set.add(a3);

        for (Zoo z:set){

            System.out.println(z.getAnimalName()+ ":" +z.getAge());

        }



    }


}
