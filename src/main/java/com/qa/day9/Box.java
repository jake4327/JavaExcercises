package com.qa.day9;

public class Box {

    private final int length;
    private final int width;
    private final int height;

    public Box(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
