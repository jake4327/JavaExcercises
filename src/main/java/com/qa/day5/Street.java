package com.qa.day5;

public class Street {

    public static void main(String[] args) {
        House house1 = new House(4,4, "547534");
        House house2 = new House(4,4, "938472");

        System.out.println(house1.getWindows());
        System.out.println(house1.getWindows());
        System.out.println(house1.findWindow());
        //System.out.println(house1.setWindows(5));

    }
}
