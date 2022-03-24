package com.inheritance;
import com.inheritance.Programmer;

public class Run {
    public static void main(String[] args) {
        Programmer pro = new Programmer("shenba",20000,22,"rajan");
        System.out.println(pro.name);
        System.out.println(pro.salary);
        System.out.println(pro.employeeId);
        System.out.println(pro.project);
    }
}
