package com.qa.day3;
import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {
        array1();
        integerArrayPopulation();
    }

    public static void array1(){
        int[] firstArray = {1,2,3,4,5,6,7,8,9,10};
        for(int i =0; i < firstArray.length; i++){
            System.out.println(firstArray[i]);
        }
    }

    public static void integerArrayPopulation(){
        ArrayList<Integer> integersArray = new ArrayList<Integer>();
        for(Integer i = 0; i < 100; i++){
            integersArray.add(i);
            System.out.println(integersArray.get(i));
        }
        for(Integer a: integersArray){
            a *= 10;
            System.out.println(a);
        }
    }
}
