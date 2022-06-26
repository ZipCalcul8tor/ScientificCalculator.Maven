package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number");
        double x = input.nextDouble();
        System.out.print("Enter the number");
        double y = input.nextDouble();
        double result=0.0;
        Calculator1 calculator1=new Calculator1();
//        TODO add if else or switch case to call method
        System.out.println("Enter operation: Addition,Subtraction,Multiplication,Division,Square,SquareRoot,exponential,switchSign");
        String operator;
        operator = input.next();
        if(operator.equals("Addition")){
            result=calculator1.addition(x, y);
            System.out.println(result);
        } else if (operator.equals("Subtraction")){
            result=calculator1.substraction(x,y);
            System.out.println(result);
        } else if (operator.equals("Multiplication")) {
            result = calculator1.multiplication(x, y);
            System.out.println(result);
        } else if (operator.equals("Division")){
            if (y != 0) {
            result = calculator1.division(x,y);
            System.out.println(result);}
            else {System.out.println("Error");};
        }else if (operator.equals("Square")) {
            result = calculator1.square(x);
            System.out.println(result);
        }else if (operator.equals("SquareRoot")) {
            result = calculator1.squareRoot(x,y);
            System.out.println(result);
        }else if (operator.equals("exponential")) {
            result = calculator1.toPower(x,y);
            System.out.println(result);
        }else if (operator.equals("switchSign")) {
            result = calculator1.switchSign(x);
            System.out.println(result);
        }else if (operator.equals("Inverse")) {
            result = calculator1.inverse(x);
            System.out.println(result);
        }

        else {
            System.out.println("Please select correct opention");
        }


        }


    }

