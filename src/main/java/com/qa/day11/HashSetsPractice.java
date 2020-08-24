package com.qa.day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetsPractice {

    private static Set<String> firstHashSet= new HashSet<>();
    private static Set<String> secondHashSet= new HashSet<>();

    public static void main(String[] args) {
        method1();
        System.out.println(firstHashSet);
        System.out.println(secondHashSet.isEmpty());
        System.out.println(firstHashSet.size());
        firstHashSet.remove("e");
        System.out.println(firstHashSet);
        Iterator setIterator = firstHashSet.iterator();
        while (setIterator.hasNext()){
            String obj = (String) setIterator.next();
            setIterator.remove();
        }
        method1();
        firstHashSet.clear();
        System.out.println(firstHashSet);
    }


    static void method1(){
        firstHashSet.add("h");
        firstHashSet.add("e");
        firstHashSet.add("f");
    }

}
