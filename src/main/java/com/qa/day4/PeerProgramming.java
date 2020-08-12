package com.qa.day4;
import java.util.ArrayList;

public class PeerProgramming {

    public static void main(String[] args) {
        /**System.out.println(reverseFactorial(120));
        System.out.println(reverseFactorial(1));
        System.out.println(reverseFactorial(1*2));
        System.out.println(reverseFactorial( 1*2*3*4));
        System.out.println(reverseFactorial( 1*2*3*4*5*6));
        printFromOneTwenty();*/
        doggoCompetition(5);
    }

    public static int reverseFactorial(int num){
        int divideNumber = 1;
        while(num != 1){

            //divde by one should be 120 -> 60 -> 20 -> 5 -> 1
            //System.out.println("Divide number: " + num);
            //divide by two
            //divdie by threee
            num = num/divideNumber;
            //System.out.println("Divide number 2: " + num);
            /**System.out.println("Number: " + num);
            System.out.println("Divide number: " + divideNumber);
            System.out.println("120 factorial 1: " + num%divideNumber);**/
            //System.out.println();

            /**if(num % divideNumber!=0){
                System.out.println("This number is not a factorial");
                break;
            } else{**/
            if(num == 1){break;}
                divideNumber++;
            }
        //}
        return divideNumber;
    }

    public static void printFromOneTwenty(){
        System.out.println(120/5);
        System.out.println((120/(5))/4);

    }

    public static void doggoCompetition(int yourDogsPosition) {
        //ArrayList<Integer> position = new ArrayList<>();
        int lastDigit;
        for(int i = 1; i <= 100; i++){
            if(i == yourDogsPosition){
                continue;
            } else {
                    //find the last digit in the number i.e 99 -> 9 -> th
                    // 92 - > nd
                    // to find last digit
                    // 92 % 10 = 2
                    // i % 10 = last digit
                    lastDigit = i % 10;
                    if(lastDigit < 4 || (i > 10 && i < 20) ) {
                        if((i > 10 && i < 20)){
                            System.out.println(i+"th");
                        }else {
                            if (lastDigit == 0){
                                System.out.println(i+"th");
                            }
                            if (lastDigit == 1) {
                                System.out.println(i + "st");
                            } else if (lastDigit == 2) {
                                System.out.println(i + "nd");
                            } else if (lastDigit == 3) {
                                System.out.println(i + "rd");
                            }
                        }

                    }else{
                        System.out.println(i+"th");
                    }
                //System.out.println("100th");
                }
            }
        }
        //loop through  0-100 with for loop with array list
        //if(
        //!!!!last th, nd, st
        //simple for loop -> if(int i is smaller than 3 print i and nd) else if(
        //
    }



