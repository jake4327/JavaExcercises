package com.qa.day5;

public class House {

    public int walls;
    public int windows;
    private String bankDeets;

    public House(int walls){
        this.walls = walls;
    }

    public House(int walls, int windows1, String bankDeets){
        this.walls = walls;
        this.windows = windows1;
        this.bankDeets = bankDeets;
    }

    public int getWindows(){
        return windows;
    }

    public String getBankDeets(){
        return bankDeets;
    }

    public int findWindow(){
        return windows;
    }

    public void changeWindows(int newWindows){
        this.windows = newWindows;
    }




    /*
    public void setWindows(int windows){
        this.windows = windows;
    }
    */

}
