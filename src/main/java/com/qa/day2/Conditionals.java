package com.qa.day2;

public class Conditionals {

    public static int problemOne(int integerOne, int integerTwo, boolean booleanOne){
        if(booleanOne){
            return Operators.addition(integerOne, integerTwo);
        } else {
            return Operators.multiplication(integerOne, integerTwo);
        }
    }

    public static String flowChart(int A) {
        String output = "";
        if (A > 2000) {
            output += "A";
            if (A > 6000) {
                output += "C";
            } else {
                output += "B";
                if (A > 4000) {
                    output += "D";
                } else {
                    output += "E";
                }
            }
        } else {
            output += "1";
            if (A > 100) {
                output += "3";
                if (A > 600) {
                    output += "5";
                } else {
                    output += "4";
                    if (A > 500) {
                        output += "6";
                    } else {
                        output += "7";
                    }
                }
            }
        }
        return output;
    }

    public static int blackJack(int card1, int card2){
        if(card1 + card2 > 21){
            return 0;
        }else{
            return card1 + card2;
        }
    }

}
