package com.qa.day13;

public class SeatingArea {

    public static void main(String[] args) {
        TableOne tableOne = new TableOne(5,"wood");
        //...
        TableOne tableOneMillion = new TableOne(100, "gold");

        System.out.println(tableOne.plantpot);
        System.out.println(tableOneMillion.plantpot);
        System.out.println(tableOne.materialObj);

    }
}
