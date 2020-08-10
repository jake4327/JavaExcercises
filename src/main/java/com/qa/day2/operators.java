package com.qa.day2;

public class operators {

    public static void main(String[] args) {
        System.out.println(addition(1,2));
        System.out.println(multiplication(1,2));
        System.out.println(division(50, 5));
        operatorsResults op = new operatorsResults(50, 50, 50);
        op.printResults();
        System.out.println(op.getGradeAsPercentage());
        System.out.println(op.gradeBreakDown());
    }

    public static int addition(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    public static int multiplication(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    public static double division(int numberOne, int numberTwo){
        return numberOne / numberTwo;
    }


}
