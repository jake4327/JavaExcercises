package com.qa.day2;

public class Conditionals {

    public static void main(String[] args) {
        System.out.println(problemOne(5,6, false));
        System.out.println(problemOne(5,6,true));
        flowChart(2001);
        flowChart(2000);
        flowChart(6001);
        flowChart(6000);
        flowChart(4001);
        flowChart(4000);
        flowChart(101);
        flowChart(100);
        flowChart(601);
        flowChart(600);
        flowChart(501);
        flowChart(500);

        System.out.println(blackJack(21,1));
        System.out.println(blackJack(5,5));

    }

    public static int problemOne(int integerOne, int integerTwo, boolean booleanOne){
        if(booleanOne){
            return Operators.addition(integerOne, integerTwo);
        } else {
            return Operators.multiplication(integerOne, integerTwo);
        }
    }

    public static void flowChart(int A) {
        if (A > 2000) {
            System.out.println("A");
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

    public static int blackJack(int card1, int card2){
        if(card1 + card2 > 21){
            return 0;
        }else{
            return card1 + card2;
        }
    }


}
