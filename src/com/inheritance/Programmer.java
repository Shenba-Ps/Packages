package com.inheritance;
import java.util.*;


public class Programmer extends Employee {
  //  Scanner scan = new Scanner(System.in);
    public String project;
    Programmer(String name,double salary,int employeeId,String project){
        this.name=name;
        this.salary=salary;
        this.employeeId=employeeId;
        this.project=project;



    }
}
