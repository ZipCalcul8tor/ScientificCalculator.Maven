package com.zipcodewilmington.scientificcalculator;

// May have to return current total = specified operation in each method

public class calculator {

    //Instance Variables
    public static double currentTotal = 0;
    public static String display = String.valueOf(currentTotal);

    //Constructors (Basic functionality may not need constructors, Scientific would benefit from knowing display & unit modes)

    //Methods
    public static double addition(double x, double y) {
        return x + y;
    }
    public static double subtraction(double x, double y) {
        return x - y;
    }
    public static double multiplication(double x, double y) {
        return x * y;
    }
    public static double division(double x, double y) {
        if(y == 0) {
            throw new IllegalArgumentException("Err");
        } else {
            return  x / y;
        }
    }

    public static double square(double x) {
        return Math.pow(x, 2);
    }

    public static double squareRoot(double x) throws ArithmeticException {
        return Math.sqrt(x);
    }

    public static double variableExponent(double x, double y) {
        return Math.pow(x, y);
    }

    public static double inverse(double x) {        //needs divide by 0 exception handling
        return 1/x;
    }
    public static double clearButton() {
        return currentTotal = 0;
    }

}
