package com.qa.day3;
import com.qa.day2.ConditionalsNumbers;

public class IterationFlowCharts {

    public static void main(String[] args) {
        /** flowchartOneForLoop();
        flowchartOneWhileLoop();
        flowchartTwoWhileLoop();
        flowchartTwoForLoop();
        numberRevisited(); **/
        //printNumbers();
        //numberRevisited();
        coins(10, 4.58);
        coins(100, 4.58);
    }

    public static void flowchartOneWhileLoop() {
        int A = 100;
        while (A < 200) {
            System.out.print(" A ");
            System.out.println(A);
            A += 1;
        }
    }

    public static void flowchartOneForLoop() {
        for (int A = 100; A < 200; A++) {
            System.out.println(" A ");
        }
    }

    public static void flowchartTwoWhileLoop() {
        int A = 100;
        while (A <= 200) {
            if (A % 2 == 0) {
                System.out.println("-");
            } else {
                System.out.println("*");
            }
            A++;
        }
    }

    public static void flowchartTwoForLoop() {
        for (int A = 100; A <= 200; A++) {
            if (A % 2 == 0) {
                System.out.println("-");
            } else {
                System.out.println("*");
            }
        }
    }

    public static void numberRevisited() {
        for (int i = 0; i < 100; i++) {
            System.out.println(ConditionalsNumbers.numbersToDigits(i));
        }
        System.out.println("one hundred");
    }

    public static void coins(double payment, double cost) {
        int fifthtyNote = 0;
        int twentyNote = 0;
        int tenNote = 0;
        int fiveNote = 0;
        int twoPound = 0;
        int onePound = 0;
        int fifthtyPence = 0;
        int twentyPence = 0;
        int tenPence = 0;
        int fivePence = 0;
        int twoPence = 0;
        int onePence = 0;
        if (cost > payment) {
            System.out.println("Sorry, you don't have enough money.");
        } else {
            Double change = (payment - cost);
            System.out.println("Total change: " + change);
            while (change >= 50) {
                fifthtyNote += 1;
                change -= 50.0;
            }
            while (change >= 20) {
                twentyNote += 1;
                change -= 20.0;
            }
            while (change >= 10) {
                tenNote += 1;
                change -= 10.0;
            }
            while (change >= 5) {
                fiveNote += 1;
                change -= 5.00;
            }
            while (change >= 2) {
                twoPound += 1;
                change -= 2.0;
            }
            while (change >= 1) {
                onePound += 1;
                change -= 1.0;
            }
            while (change >= 0.5) {
                fifthtyPence += 1;
                change -= 0.5;
            }
            while (change >= 0.2) {
                twentyPence += 1;
                change -= 0.2;
            }
            while (change >= 0.1) {
                tenPence += 1;
                change -= 0.1;
            }
            while (change >= 0.05) {
                fivePence += 1;
                change -= 0.05;
            }
            while (change >= 0.02) {
                twoPence += 1;
                change -= 0.02;
            }
            while (change >= 0.01) {
                onePence += 1;
                change -= 0.01;
            }
            if(change > 0){
                while(Math.round(change) == 0.01) {
                    onePence += 1;
                    change -= 0.01;
                }
            }
            if (fifthtyNote >= 1) {
                System.out.println("£50: " + fifthtyNote);
            }
            if (twentyNote >= 1) {
                System.out.println("£20: " + twentyNote);
            }
            if (tenNote >= 1) {
                System.out.println("£10: " + tenNote);
            }
            if (fiveNote >= 1) {
                System.out.println("£5: " + fiveNote);
            }
            if (twoPound >= 1) {
                System.out.println("£2: " + twoPound);
            }
            if (onePound >= 1) {
                System.out.println("£1: " + onePound);
            }
            if (fifthtyPence >= 1) {
                System.out.println("£0.50: " + fifthtyPence);
            }
            if (twentyPence >= 1) {
                System.out.println("£0.20: " + twentyPence);
            }
            if (tenPence >= 1) {
                System.out.println("£0.10: " + tenPence);
            }
            if (fivePence >= 1) {
                System.out.println("£0.05: " + fivePence);
            }
            if (twoPence >= 1) {
                System.out.println("£0.02: " + twoPence);
            }
            if (onePence >= 1) {
                System.out.println("£0.01: " + onePence);
            }
        }
    }

    public static void printNumbers(){
        for(int A = 100; A < 200; A++) {
            if (A > 200) {
                break;
            } else {
                System.out.println(A);
                A = A + 1;
            }
        }
    }

}

