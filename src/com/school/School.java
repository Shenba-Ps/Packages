package com.school;

import com.student.*;

public class School {
    public static void main(String[] args) {
        Student stu = new Student("shenba", 28);
        System.out.println(stu.name);
        System.out.println(stu.age);
    }
}
