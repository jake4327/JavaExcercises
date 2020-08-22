package com.qa.day9;

public class GenericsPractice<T> {

    private T object;

    public void add(T object){
        this.object = object;
    }

    public T get(){
        return object;
    }

}
