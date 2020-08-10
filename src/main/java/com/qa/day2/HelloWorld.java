package com.qa.day2;

public class HelloWorld {
    //System.out.println("Hello world")

    public static void main(String[] args) {
        printOne("hello world");
        System.out.println(printTwo("Hello world"));
    }

    public static void printOne(String word){
        System.out.println(word);
    }

    public static String printTwo(String word){
        return word;
    }
}