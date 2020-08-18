package com.qa.day4;

public class World {

    public static void main(String[] args) {
        Person adam = new Person("Adam", "unknown");
        System.out.println(adam.getName());

        Person eve = new Person("Eve","unknown" );
        System.out.println(eve.getName());
    }
}
