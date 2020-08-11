package com.qa.day3;
import java.util.ArrayList;

public class ArrayListOne {
    public static void main(String[] args) {
        function1();
    }

    public static void function1(){
        ArrayList<Integer> firstArrayList = new ArrayList<>();
        for(Integer i = 0; i < 100; i++){
            firstArrayList.add(i);
        }
        for(int i = 0; i < firstArrayList.size(); i++){
            System.out.println(firstArrayList.get(i));
        }
        for(Integer a: firstArrayList){
            System.out.println(a);
        }
        System.out.println(firstArrayList.get(1));
        System.out.println(firstArrayList.get(99));

        firstArrayList.set(50, 500);
        System.out.println(firstArrayList.get(50));
        firstArrayList.set(20, 200);
        System.out.println(firstArrayList.get(20));

        firstArrayList.remove(30);
        System.out.println(firstArrayList.get(30));

        //firstArrayList.sort();

        //firstArrayList.reverse();

        //firstArrayList.swap();

        ArrayList<Integer> arrayListTwo = (ArrayList<Integer>) firstArrayList.clone();
        for(Integer a: arrayListTwo){
            System.out.println(a);
        }
    }
}
