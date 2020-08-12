package com.qa.day4;

public class Table {

    int temperature;
    int weight;
    int luminosity;

    public Table(int weight, int temperature){
        this.temperature = temperature;
        this.weight = weight;
    }

    public Table(int weight, int temperature, int luminosity){
        this.temperature = temperature;
        this.weight = weight;
        this.luminosity = luminosity;
    }

    public int getTemperature(){
        return temperature;
    }

    public int getWeight(){
        return weight;
    }

    public int getLuminosity(){
        return luminosity;
    }
}
