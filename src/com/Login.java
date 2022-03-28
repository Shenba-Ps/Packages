package com;
abstract class Member{
     String name;
    abstract void welcomeMessage();

}
class Student extends Member{
    String name;
    void welcomeMessage(){
        System.out.println("welcome student");
    }

}

 class Login {
}
