package com.inheritance;
import com.inheritance.Programmer;
import java.util.*;

public class Run {
    public static void main(String[] args) {
       // System.out.println("enter the salary");
        Programmer pro = new Programmer("shenba",2000,22,"rajan");
        System.out.println(pro.name);
        System.out.println(pro.salary);
        System.out.println(pro.employeeId);
        System.out.println(pro.project);
    }
}
