package com.qa.day13;

public class SeatingArea {

    public static void main(String[] args) {
        Table table = new Table(5,"wood");
        //...
        Table tableMillion = new Table(100, "gold");

        System.out.println(table.plantpot);
        System.out.println(tableMillion.plantpot);
        System.out.println(table.materialObj);

    }
}
