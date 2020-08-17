package com.qa.day6;

public class Encapsulation {

    public static int five = 5;
    int six = 6;
    static int timesFive = method1();

    public static void main(String[] args) {
        System.out.println(method2());
    }

    public static int method1(){
        return five * 5;
    }

    public static int method2(){
        int ans = timesFive;
        return ans;
    }





}
