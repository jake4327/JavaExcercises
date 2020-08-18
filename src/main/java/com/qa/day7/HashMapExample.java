package com.qa.day7;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static Map<String, Integer> people = new HashMap<>();

    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        people.put("E", 22);
        people.put("J", 22);
        people.put("A", 24);
        people.put("K", 23);
        for(String s: people.keySet()){
            System.out.println(s);
        }
        for(Integer i: people.values()){
            System.out.println(i);
        }
        if("J".equals(people.get(""))){
            System.out.println(people.values());
        }
        System.out.println(people.size());
    }

}
