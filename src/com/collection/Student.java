package com.collection;
import java.util.*;

public class Student {
    Scanner scan=new Scanner(System.in);
    private String name;
    private  int age;
    Student(){
//        this.name=n;
//        this.age=a;

    }
    void setName1(){
        this.name=scan.nextLine();
    }
    String getName1(){
        return this.name;
    }
    void setName2() {
        this.name = "raj";
    }
    String getName2(){
        return name;}
    void setName3(){
        this.name="rajan";}
    String getName3(){
        return this.name;
    }
    void setAge1(){
        this.age=12;
    }
    int getAge1(){
        return this.age;
    }
    void setAge2(){
        this.age=15;
    }
    int getAge2(){
        return this.age;
    }
    void setAge3(){
        this.age=17;
    }
    int getAge3(){
        return this.age;
    }
}
