package com.collection;
import java.util.*;
import java.util.ArrayList;
public class School {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        ArrayList<String> n=new ArrayList<>();
        System.out.println("enter the student s1 name");
        s1.setName1();
        System.out.println("enter the student s2 name");
        s2.setName1();
        System.out.println("enter the student s3 name");
        s3.setName1();
        n.add(s1.getName1());
        n.add(s2.getName1());
        n.add(s3.getName1());
        System.out.println(n);
        ArrayList<Integer> age=new ArrayList<>();
        s1.setAge1();
        s2.setAge2();
        s3.setAge3();
        age.add(s1.getAge1() );
        age.add(s2.getAge2());
        age.add(s3.getAge3());
        System.out.println(age);
        double sum=0;
        double average=0;

        for (int i : age){
           sum += i;
           double ave= sum / age.size();
            average=ave;
        }
        System.out.println("average of age is" +average);
    }
}
