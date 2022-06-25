package com.zipcodewilmington.scientificcalculator;

public class calculator {
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
            calculator.display="Err";
        } else {
            return x / y;
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

}
