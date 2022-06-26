package com.zipcodewilmington.scientificcalculator;

public class Calculator1 {
    public double addition(double x, double y) {
        double n;
        n = x + y;
        return n;
    }

    public double substraction(double x, double y) {
        double n;
        n = x - y;
        return n;
    }

    public double multiplication(double x, double y) {
        double n;
        n = x * y;
        return n;
    }
    public double division(double x, double y) {
        double n;
        if (y != 0) {
            n = x / y;
        } else {
            System.out.println("Not a valid number");
            n= 0;
        }

        return n;
    }

    public double square(double x) {
        double n;
        n = Math.pow(x, 2);
        return n;
    }

    public double squareRoot(double x, double y) {
        double n;
        n = Math.sqrt(x);
        return n;
    }
    public double toPower(double x, double y) {
        double n;
        n = Math.pow(x, y);
        return n;
    }
    public double switchSign(double x) {
        double n;
        n = -1 * x;
        return n;
    }

    public double inverse(double x) {
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