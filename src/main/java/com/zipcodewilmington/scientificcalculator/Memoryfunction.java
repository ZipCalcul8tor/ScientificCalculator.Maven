package com.zipcodewilmington.scientificcalculator;

public class Memoryfunction {


//    constructor?
    public Memoryfunction(){

    }
//    variable
    private Double memory;

    public Double recall() {
        return memory;
    }
//method
    public void store(Double memory) {
        this.memory = memory;
    }
//Method
    public void reset(){
        memory = null;
    }
}
