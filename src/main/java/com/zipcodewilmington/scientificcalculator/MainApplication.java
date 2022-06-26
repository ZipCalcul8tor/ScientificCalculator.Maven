package com.zipcodewilmington.scientificcalculator;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {
        Console.println("Welcome to ZipCalcul8tor!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
        boolean powerState = true;


            Scanner input = new Scanner(System.in);

            while (powerState = true) {
            System.out.println("Enter a number");
            double x = input.nextDouble();
            System.out.println("First number = " + x);
            System.out.println("Enter the next number");
            double y = input.nextDouble();
            double result = 0.0;
            Calculator1 calculator1 = new Calculator1();

//        TODO add if else or switch case to call method
            System.out.println("First Number = " + x + " Second Number = " + y);
            System.out.println("Enter operation: Addition,Subtraction,Multiplication,Division,Square,SquareRoot,exponential,switchSign, inverse");
            System.out.println("Please note, the following commands will only utilize the first number: Square, SquareRoot, Exponent, Switch Sign, Inverse");
            System.out.println("'off' to turn off.");
            String operator;
            operator = input.next();
            operator = operator.toLowerCase();
            if (operator.equals("addition")) {
                result = calculator1.addition(x, y);
                System.out.println(result);
            } else if (operator.equals("subtraction")) {
                result = calculator1.subtraction(x, y);
                System.out.println(result);
            } else if (operator.equals("multiplication")) {
                result = calculator1.multiplication(x, y);
                System.out.println(result);
            } else if (operator.equals("division")) {
                if (y != 0) {
                    result = calculator1.division(x, y);
                    System.out.println(result);
                } else {
                    System.out.println("Error");
                }
            } else if (operator.equals("square")) {
                result = calculator1.square(x);
                System.out.println(result);
            } else if (operator.equals("squareroot")) {
                result = calculator1.squareRoot(x, y);
                System.out.println(result);
            } else if (operator.equals("exponential")) {
                result = calculator1.toPower(x, y);
                System.out.println(result);
            } else if (operator.equals("switchsign")) {
                result = calculator1.switchSign(x);
                System.out.println(result);
            } else if (operator.equals("inverse")) {
                result = calculator1.inverse(x);
                System.out.println(result);
            } else if (operator.equals("off")) {
                System.out.println("Goodbye");
                powerState = false;
                break;
            }
//            else if (operator.equals("???")) { //mama mac wouldn't give me permission :( .
//                ProcessBuilder macCalc = new ProcessBuilder("/System/Applications/Calculator.app");
//                macCalc.start();}
             else {
                System.out.println("Please select correct option");
            }

        }

    }

    }


