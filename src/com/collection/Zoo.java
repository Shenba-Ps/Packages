package com.collection;
import java.util.*;

import java.util.Collection;
 public class Zoo implements Collection {
    private String animalName;
    private int age;
    private int count;
    public Zoo(String animalName, int age, int count) {
        this.animalName = animalName;
        this.age = age;
        this.count = count;
    }



    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

     @Override
     public int size() {
         return 0;
     }

     @Override
     public boolean isEmpty() {
         return false;
     }

     @Override
     public boolean contains(Object o) {
         return false;
     }

     @Override
     public Iterator iterator() {
         return null;
     }

     @Override
     public Object[] toArray() {
         return new Object[0];
     }

     @Override
     public boolean add(Object o) {
         return false;
     }

     @Override
     public boolean remove(Object o) {
         return false;
     }

     @Override
     public boolean addAll(Collection c) {
         return false;
     }

     @Override
     public void clear() {

     }

     @Override
     public boolean retainAll(Collection c) {
         return false;
     }

     @Override
     public boolean removeAll(Collection c) {
         return false;
     }

     @Override
     public boolean containsAll(Collection c) {
         return false;
     }

     @Override
     public Object[] toArray(Object[] a) {
         return new Object[0];
     }
 }




