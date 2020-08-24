package com.qa.day11;

import java.util.ArrayList;
import java.util.HashMap;

public class LambdaExpressionsPractice {

    private static ArrayList<Integer> arrayList = new ArrayList<>();
    private static HashMap<Integer, Integer>  hashMap = new HashMap<>();

    public static void main(String[] args) {
        addOneToFourArray();
        arrayList.forEach(System.out::println);
        addOneToFourHash();
        //hashMap.forEach((n,m) -> System.out.println(n, m) );
    }

    static void addOneToFourArray(){
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
    }

    static void addOneToFourHash(){
        hashMap.put(1,1);
        hashMap.put(2,2);
        hashMap.put(3,3);
        hashMap.put(4,4);
    }
}
