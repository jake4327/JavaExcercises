package com.qa.day10;

public class Carrot extends Vegtable {

    private static String name = "Carrot";

    public Carrot(int length, String name, double calories, float weight) {
        super(length, name, calories, weight);
    }

    public Carrot(String name, float weight) {
        super(name, weight);
    }

    public Carrot(int length, String name, float weight) {
        super(length, name, weight);
    }

    public Carrot() {
        super(name);
    }

    public static void beEaten(){
        System.out.println("chew chew chew");
    }

    @Override
    public Object clone() throws
            CloneNotSupportedException
    {
        return super.clone();
    }
}
