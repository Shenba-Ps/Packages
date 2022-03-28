package com.inheritance;
import com.inheritance.Team;
import java.util.*;
public class Match {
    public static void main(String[] args) {

        Team p1=new Team("shenba","batsman",200,25,"YTN");
        System.out.println(p1.name);
        System.out.println(p1.type);
        System.out.println(p1.runs);
        System.out.println(p1.average);
        System.out.println(p1.teamName);
    }
}
