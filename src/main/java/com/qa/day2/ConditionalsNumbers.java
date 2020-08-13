package com.qa.day2;

public class ConditionalsNumbers {

    public static void main(String[] args) {
        digitAdditionFourNumbers(9999);
    }

    public static int digitAdditionTenToOneHundered(int num){
        int digitOne;
        int digitTwo;
        if(num == 100) {
            return 1;
        }
        if(num > 100 || num < 10){
            //System.out.println("A number between 10 and 100");
            return 0;
        }
        else{
            digitOne = num % 10;
            digitTwo = (num - digitOne) / 10;
            return digitOne + digitTwo;
        }
    }

    public static String numbersToDigitsOneToNineNine(int num){
        int digitOne;
        int digitTwo;
        if(num > 99 || num < 1){
            return "Not in range";
        }
        digitOne = num % 10;
        digitTwo = (num%100 - digitOne)/10;
        if (num > 19){
            String string1; String string2;
            string1 = printNumberAboveTwenty(digitTwo);
            if (digitOne == 0) {
                string2 = printNumberBelowTen(digitOne, false);
            }else {
                string2 = printNumberBelowTen(digitOne, true);
            }
            return string1 + string2;
        }else{
            if(num < 10){
                String belowten;
                belowten = printNumberBelowTen(num, false);
                return belowten;
            } else {
                String teens;
                teens = printTeens(num);
                return teens;
            }
            }
    }

    public static String printNumberAboveTwenty(int digit){
        if(digit == 2){
            return "twenty";
        }else if (digit == 3){
            return "thirty";
        }else if (digit == 4){
            return "forty";
        }else if (digit == 5){
            return "fifty";
        }else if(digit == 6){
            return "sixty";
        }else if(digit == 7){
            return "seventy";
        }else if(digit == 8){
            return "eighty";
        }else if(digit == 9){
            return "ninety";
        }else{
            return "ERROR";
        }
    }

    public static String printNumberBelowTen(int digit, boolean dash){
        String start;
        if(dash){
            start = "-";
        }else {
            start = "";
        }
        if(digit == 0){
            start += "";
        }else if (digit == 1){
            start += "one";
        }else if ( digit == 2){
            start += "two";
        }else if(digit == 3){
            start += "three";
        }else if(digit == 4){
            start += "four";
        }else if(digit == 5){
            start += "five";
        }else if( digit == 6){
            start += "six";
        }else if(digit == 7){
            start += "seven";
        }else if(digit == 8){
            start += "eight";
        }else if(digit == 9){
            start += "nine";
        }else{
            start += "ERROR";
        }
        return start;

    }

    public static String printTeens(int num) {
        if (num == 10) {
            return "ten";
        } else if (num == 11) {
            return "eleven";
        } else if (num == 12) {
            return "twelve";
        } else if (num == 13) {
            return "thirteen";
        } else if (num == 14){
            return "fourteen";
        } else if(num == 15){
            return "fifteen";
        }else if(num == 16){
            return "sixteen";
        }else if(num == 17){
            return "seventeen";
        }else if(num == 18){
            return "eighteen";
        }else if(num == 19){
            return "nineteen";
        }
        return "ERROR";
    }

    public static int digitAdditionThreeNumbers(int num) {
        int digitOne;
        int digitTwo;
        int digitThree;

        digitOne = num % 10;
        digitTwo = (num % 100 - digitOne)/10;
        digitThree = ((num % 1000) - (digitTwo*10 + digitOne))/100;
        if (num < 10) {
            return digitOne;
        } else if (num < 100) {
            return digitOne + digitTwo;
        } else if (num < 1000) {
            return digitOne + digitTwo + digitThree;
        }
        return 0;
    }

    public static int digitAdditionFourNumbers(int num) {
        int digitOne;
        int digitTwo;
        int digitThree;
        int digitFour;

        digitOne = num % 10;
        digitTwo = (num % 100 - digitOne)/10;
        digitThree = ((num % 1000) - (digitTwo*10 + digitOne))/100;
        digitFour = ( (num %10000) - (digitThree*100 + digitTwo*10 + digitOne))/1000;
        if (num < 10) {
            return digitOne;
        } else if (num < 100) {
            return digitOne + digitTwo;
        } else if (num < 1000) {
            return digitOne + digitTwo + digitThree;
        } else if(num < 10000){
            return digitOne + digitTwo + digitThree + digitFour;
        }
        return 0;
    }
}
