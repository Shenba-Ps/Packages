package com.collection;
import java.util.*;
import java.util.HashSet;
import java.util.Spliterator;

public class Hashsetspliterator {
    public static void main(String[] args) {
//        HashSet<Integer> s=new HashSet<>();
//        s.add(22);
//        s.add(33);
//        s.add(44);
//        Spliterator<Integer> i = s.spliterator();
////       itr.forEachRemaining(System.out::println);
//        System.out.println(i);
        List<String>l=Arrays.asList("apple","orange","lemone","grapes");
        Spliterator<String>s=l.spliterator();

        s.tryAdvance(System.out::println);
        System.out.println("print remain");
        s.forEachRemaining(System.out::println);
        boolean b=s.tryAdvance(System.out::println);
        System.out.println(b);



        }
}
