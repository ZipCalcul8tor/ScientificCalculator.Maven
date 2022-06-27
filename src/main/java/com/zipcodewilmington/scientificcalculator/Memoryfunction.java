package com.zipcodewilmington.scientificcalculator;

public class Memoryfunction {


//    constructor?
    public Memoryfunction(){

    }
//    variable
    public Double memory;
    public boolean memStored = false;

    public Double recall() {
        if (memStored = false) {
        System.out.println("Err");
        memStored = false;
        return memory = 0.0;
        } else{
            memStored = false;
            return memory;
        }
    }
//method
    public boolean store() {
       return memStored = true;

    }
//Method
    public void reset(){
        memStored = false;
        memory = null;
    }
}
