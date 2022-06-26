package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char Operator;
        double x;
        x = 0;
        System.out.println(0);
        System.out.print("Enter the number");
        x=input.nextDouble();
        System.out.println(x);
        double y;
        y = input.nextDouble();
        System.out.println(y);
        System.out.println("Enter operator: + , -,*, /,#,√,^,%,_");
        Operator = input.next().charAt(0);
        double n;
//        Check operatiion
        switch (Operator){
            case '+':
                n = x + y;
            System.out.println(n);
            break;
            case '-':
                n = x - y;
            System.out.println(n);
            break;
            case '*':
                n = x * y;
                System.out.println(n);
                break;
            case '/':
                if (y != 0) {
                    n = x / y;
                System.out.println(n);
            } else {
                System.out.println("Error");
            } break;
            case '#':
                n = Math.pow(x, 2);
                System.out.println(n);
                break;
            case '√':
                n = Math.sqrt(x);
                System.out.println(n);
                break;
            case '^':
                n = Math.pow(x, y);
                System.out.println(n);
                break;
            case '_':
                n = -1 * x;
                System.out.println(n);
                break;


            default:
                System.out.println("Invalid operator");

            }




        }


    }








