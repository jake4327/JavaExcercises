package com.qa.day11;

public class Laptop {

    private int weight;
    private String brandName;
    private static int serialNumber = 0;
    private int laptopsSerialNumber;
    private String keyboardType;

    public Laptop(String brandName) {
        this.brandName = brandName;
        this.laptopsSerialNumber = setLaptopsSerialNumber();
    }

    private static int setLaptopsSerialNumber() {
        serialNumber++;
        return serialNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getLaptopsSerialNumber() {
        return laptopsSerialNumber;
    }

    public static int getSerialNumber() {
        return serialNumber;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }
}
