package com.qa.day10;

public abstract class Vegtable {
    protected int length;
    protected String name;
    protected double calories;
    protected float weight;
    protected String colour;
    protected String nativeContry;

    public Vegtable(int length, String name, double calories, float weight) {
        this.length = length;
        this.name = name;
        this.calories = calories;
        this.weight = weight;
    }

    public Vegtable(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public Vegtable(int length, String name, float weight) {
        this.length = length;
        this.name = name;
        this.weight = weight;
    }

    public Vegtable(String name) {
        this.name = name;
    }

    public static void beEaten(){
        System.out.println("chop chomp");
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getNativeContry() {
        return nativeContry;
    }

    public void setNativeContry(String nativeContry) {
        this.nativeContry = nativeContry;
    }

    @Override
    public String toString() {
        return "Vegtable{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                ", nativeContry='" + nativeContry + '\'' +
                '}';
    }
}
