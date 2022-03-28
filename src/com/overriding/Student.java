package com.overriding;

public class Student extends Library{
     Student(String name,int idNo){
        this.name=name;
        this.idNo=idNo;
    }
    public void print(){
        System.out.println(this.name);
        System.out.println(this.idNo);
    }
}
