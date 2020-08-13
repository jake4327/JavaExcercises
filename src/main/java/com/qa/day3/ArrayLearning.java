package com.qa.day3;
import java.util.ArrayList;

public class ArrayLearning {

    public static String array1(int[] firstArray){
        String s = "";
        //int[] firstArray = {1,2,3,4,5,6,7,8,9,10};
        for (int j: firstArray) {
            s += j + ",";
        }
        s = s.substring(0, s.length()-1);
        return "{" + s+ "}";
    }

    public static ArrayList<Integer> integerArrayListTimesTen(ArrayList<Integer> integersArray){
        ArrayList<Integer> integersArrayTimesTen = new ArrayList<>();
        /*for(int i = 1; i <= 100; i++){
            integersArray.add(i);
            //System.out.println(integersArray.get(i));
        }*/

        for(Integer a: integersArray){
            integersArrayTimesTen.add(a *= 10);
            //System.out.println(a);
        }
        return integersArrayTimesTen;
    }

}
