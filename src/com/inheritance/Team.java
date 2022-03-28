package com.inheritance;
import java.util.*;

public class Team extends Cricket{

    public String teamName;
    public Team(String name,String type,int runs,double average,String teamName){
        this.name=name;
        this.type=type;
        this.runs=runs;
        this.average=average;
        this.teamName=teamName;
    }
}
