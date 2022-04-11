package com.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Examplelist {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        System.out.println(list.size());
        list.add(11);
        list.add(22);list.add(33);list.add(46);
        System.out.println(list.size());
       // list.clear();
        list.remove(0);
       //  list.isEmpty();
         //Object clone();
//        System.out.println(list);
       // Object clone;
//        list.set(1,44);
//        list.set(0,22);
//        list.set(2,11);
        System.out.println(list);
        List<Integer> list1=new ArrayList<>();
        list1.add(101);
        list1.add(202);
        list.addAll(list1);
        System.out.println(list);
        list.removeAll(list1);
        List<Integer>list2=new ArrayList<>();
        list2.add(404);
        list2.add(405);
        list.addAll(1,list2);
        System.out.println(list);
//        Iterator itr=list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        Collections.sort(list);
//        for (int name:list){
//            System.out.println(name);
        }
    }



