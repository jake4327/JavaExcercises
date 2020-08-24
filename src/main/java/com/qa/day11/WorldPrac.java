package com.qa.day11;

import java.util.ArrayList;

public class WorldPrac {

    public static int five = 5;
    private int six = 6;
    protected static int seven = 7;
    static int eight = 8;
    static ArrayList<PersonPrac> groupOfPeople = new ArrayList<>();

    public static void main(String[] args) {
        /*PersonPrac adam = new PersonPrac(27);
        adam.walk();
        System.out.println(adam.getAge());
        PersonPrac eve = new PersonPrac(28);
        System.out.println(eve.getAge());*/
        makePeople();
        System.out.println(groupOfPeople);
    }

    public static void makePeople(){
        for(int i = 0; i < 1000; i ++){
            PersonPrac personOne = new PersonPrac(40);
            groupOfPeople.add(personOne);
        }
        PersonPrac randomGary = groupOfPeople.get(1);
        randomGary.setAge(5);
        System.out.println(randomGary.getAge());
        System.out.println(groupOfPeople.get(1).getAge());
    }


}
