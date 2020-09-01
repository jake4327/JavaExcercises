package com.qa.day13;

public class Table {

    int tableLegsObj;
    String materialObj;
    String plantpot = "good plant pot";


    public Table(int tableLegsInput, String materialInput) {
        this.tableLegsObj = tableLegsInput;
        this.materialObj = materialInput;
    }

    public static void method1() {
    }


    public int getTableLegs() {
        return this.tableLegsObj;
    }

    public void setTableLegs(int tableLegs) {
        this.tableLegsObj = tableLegs;
    }

    public String getMaterial() {
        return this.materialObj;
    }

    public void setMaterial(String material) {
        this.materialObj = material;
    }

    public void method2() {
    }
}
