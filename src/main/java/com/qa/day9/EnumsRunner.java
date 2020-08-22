package com.qa.day9;

public class EnumsRunner  {

    public static void main(String[] args) {
        double earthWeight = Double.parseDouble("175");
        double mass = earthWeight/ EnumsPractice.Planet.EARTH.surfaceGravity();
        for(EnumsPractice.Planet p : EnumsPractice.Planet.values()) {
            System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));
        }
    }
}
