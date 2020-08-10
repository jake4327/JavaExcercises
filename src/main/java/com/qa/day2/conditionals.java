package com.qa.day2;

public class conditionals {

    public static void main(String[] args) {

    }

    public int problemOne(int intergerOne, int integerTwo, boolean booleanOne){
        if(booleanOne){
            return operators.addition(intergerOne, integerTwo);
        } else {
            return operators.multiplication(intergerOne, integerTwo);
        }
    }

    public void flowChart(int A) {
        if (A > 2000) {
            System.out.println(A);
            if (A > 6000) {
                System.out.println("C");
            } else {
                System.out.println("B");
                if (A > 4000) {
                    System.out.println("D");
                } else {
                    System.out.println("E");
                }
            }
        } else {
            System.out.println("1");
            if (A > 100) {
                System.out.println("3");
                if (A > 600) {
                    System.out.println("5");
                } else {
                    System.out.println("4");
                    if (A > 500) {
                        System.out.println("6");
                    } else {
                        System.out.println("7");
                    }
                }
            }
        }
    }

}
