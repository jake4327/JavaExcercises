package com.qa.day13;

public class TableOne {

    int tableLegsObj;
    static String materialObj;
    String plantpot = "good plant pot";


    public TableOne(int tableLegsInput, String materialInput) {
        this.tableLegsObj = tableLegsInput;
        this.materialObj = materialInput;
    }


    public int getTableLegs() {
        return tableLegsObj;
    }

    public void setTableLegs(int tableLegs) {
        this.tableLegsObj = tableLegs;
    }

    public String getMaterial() {
        return materialObj;
    }

    public void setMaterial(String material) {
        this.materialObj = material;
    }
}
