package com.qa.day5;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        String equType = askForEquationType();
        int a = askForNumber("a");
        int b = askForNumber("b");
        int answer = answer(equType, a, b);
        System.out.println(answer);
    }

    public int addition(int a, int b){
        return a + b;
    }

    public int subtraction(int a, int b){
        return a -b;
    }

    public static double division(double a, double b){
        return a / b;
    }

    public static int answer(String equationType, int a, int b){
        if(equationType.equals("+")){
                return a + b;
        }else if(equationType.equals("-")){
                return a - b;
        }else if(equationType.equals("/")){
                return (int)((double) a /  (double)b);
        }else if(equationType.equals("*")){
                return a * b;
        }else {
            System.out.println("Please enter just * or / or + or -");
            String newEquationType = askForEquationType();
            System.out.println("Choose Integers: ");
            a = askForNumber("a");
            b = askForNumber("b");
            return answer(newEquationType, a, b);
        }

    }

    private static int askForNumber(String a) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Integer " + a + ":");
        return scan.nextInt();
    }

    public static String askForEquationType(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter [+, -, *, /]: ");
        String input = scanner.next();
        return input;
    }

}
