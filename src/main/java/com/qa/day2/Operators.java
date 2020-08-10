package com.qa.day2;

public class Operators {

    public static void main(String[] args) {
        System.out.println(addition(1,2));
        System.out.println(multiplication(1,2));
        System.out.println(division(50, 5));
    }

    public static int addition(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    public static int multiplication(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }

    public static double division(int numberOne, int numberTwo){
        double one = numberOne;
        double two = numberTwo;
        return one / two;
    }


}
