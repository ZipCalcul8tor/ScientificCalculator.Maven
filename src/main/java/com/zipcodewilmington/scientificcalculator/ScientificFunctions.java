package com.zipcodewilmington.scientificcalculator;

public class ScientificFunctions {


//    this is the constructor
    public ScientificFunctions(){

    }

    public double square(double value){
        return value * value;
    }

    public double squareRoot(double value){
        return Math.sqrt(value);

    }

    public double inverse(double value){
        return 0.00;
    }

    public double switchSign(double value){
        return -value;
    }

    public double sine(double value){
        return Math.sin(value);

    }

    public double cosine(double value){
        return  Math.cos(value);
    }

    public double tangent(double value){
        return Math.tan(value);
    }

    public double inverseSine(double value){
        return Math.asin(value) ;
    }

    public double inverseCosine(double value){
        return Math.acos(value);
    }

    public double inverseTangent(double value){
        return Math.atan(value);
    }

    public double factorial(double value){
        double newValue = value;
        for (int i = (int)value -1; i > 0; i--) {
            newValue *= i;
        }
        return newValue;
    }


}
