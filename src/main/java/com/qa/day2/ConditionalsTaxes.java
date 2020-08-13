package com.qa.day2;

public class ConditionalsTaxes {

    public static double taxAmount(double salary) {
        double totalTax;
        if (salary < 14999) {
            return 0;
        } else if (salary < 19999) {
            totalTax = (salary - 14999) * 0.1;
        } else if (salary < 29999) {
            totalTax = (salary - 14999) * 0.1;
            totalTax += (salary - 19999) * 0.15;
        } else if (salary < 44999) {
            totalTax = (salary - 14999) * 0.1;
            totalTax += (salary - 19999) * 0.15;
            totalTax += (salary - 29999) * 0.20;
        } else {
            totalTax = (salary - 14999) * 0.1;
            totalTax += (salary - 19999) * 0.15;
            totalTax += (salary - 29999) * 0.20;
            totalTax += (salary - 49999) * 0.25;
        }
        return totalTax;
    }
}