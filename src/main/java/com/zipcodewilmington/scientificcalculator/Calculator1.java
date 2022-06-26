package com.zipcodewilmington.scientificcalculator;

public class Calculator1 {
    public static double addition(double x, double y) {
        double n;
        n = x + y;
        return n;
    }

    public static double subtraction(double x, double y) {
        double n;
        n = x - y;
        return n;
    }

    public static double multiplication(double x, double y) {
        double n;
        n = x * y;
        return n;
    }
    public static double division(double x, double y) {
        double n;
        if (y != 0) {
            n = x / y;
        } else {
            System.out.println("Not a valid number");
            n= 0;
        }

        return n;
    }

    public static double square(double x) {
        double n;
        n = Math.pow(x, 2);
        return n;
    }

    public static double squareRoot(double x, double y) {
        double n;
        n = Math.sqrt(x);
        return n;
    }
    public static double toPower(double x, double y) {
        double n;
        n = Math.pow(x, y);
        return n;
    }
    public static double switchSign(double x) {
        double n;
        n = -1 * x;
        return n;
    }

    public static double inverse(double x) {
        double n;
        if (x != 0) {
            n = 1/ x;
        } else {
            System.out.println("Not a valid number");
            n= 0;
        }
        return n;
    }
}