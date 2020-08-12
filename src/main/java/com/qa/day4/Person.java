package com.qa.day4;

public class Person {
    public String fname;
    public String lname;
    final boolean HEAD = true;

    public Person(String fname, String lastName){
        this.fname = fname;
        this.lname = lastName;
    }

    public String getName(){
        return fname;
    }

    public void talk(){
        System.out.println("Hello");
    }

}
