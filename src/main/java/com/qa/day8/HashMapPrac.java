package com.qa.day8;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrac {

    public static Map<String, String> densityOfLeaf = new HashMap<>();

    public static void main(String[] args) {
        fillHashMap();
        printsHashMap();
    }

    private static void fillHashMap(){
        for(int j = 0; j < 4; j++) {
            if(j == 3){
                densityOfLeaf.put("Leaf key" +j , "leaf density: " + j*7);
            }else {
                densityOfLeaf.put("Leaf key" + j, "leaf density: " + j * 0.5);
            }
        }
    }

    private static void printsHashMap(){
        System.out.println(densityOfLeaf);
    }
}
