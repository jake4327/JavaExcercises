package com.qa.day5;

import java.awt.*;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

    }

    public int addition(int a, int b){
        return a + b;
    }

    public int subtraction(int a, int b){
        return a -b;
    }

    public double multiplication(double a, double b){
        return a / b;
    }

    public void answer(String equationType, int a, int b){
        if(equationType.equals("+")){

        }else if(equationType.equals("-")){

        }else if(equationType.equals("/")){

        }else if(equationType.equals("*")){

        }else {
            System.out.println("Please enter just * or / or + or -");
        }

    }

    public void askForEquationType(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter [+, -, *, /]: ");
        String input = scanner.next();

    }

}
