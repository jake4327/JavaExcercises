package com.qa.day2;

public class ConditionalsTaxes {

    //THIS IS NOT HOW TAXES WORK PLEASE FIX
    public static void main(String[] args) {
        System.out.println(govermentMoney(16000));
        System.out.println(govermentMoney(10000));
        System.out.println(govermentMoney(25000));
        System.out.println(govermentMoney(35000));
        System.out.println(govermentMoney(50000));

    }

    public static double taxAmount(double salary){
        if(salary > 0 && salary < 14999){
            return 0;
        } else if (salary > 14999 && salary < 19999){
            return 10;
        } else if (salary > 19999 && salary < 29999){
            return 15;
        } else if (salary > 30000 && salary < 44999){
            return 20;
        } else{
            return 25;
        }
    }

    public static double govermentMoney(double salary){
        return (salary/100 * taxAmount(salary));
    }
}
