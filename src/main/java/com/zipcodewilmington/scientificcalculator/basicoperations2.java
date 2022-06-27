//package com.zipcodewilmington.scientificcalculator;
//
//import java.util.Scanner;
//
//public class basicoperations2{
//
//public static void main(String args[]){
//
//        Scanner scan = new Scanner (System.in);
//
//        System.out.println("Choose your operation");
//
//        System.out.println("1 for addition");
//        System.out.println("2 for subtraction");
//        System.out.println("3 for multiplication");
//        System.out.println("4 for division");
//
//        double choose = scan.nextInt();
//
//        System.out.println("enter two numbers");
//        double x = scan.nextInt();
//        double y = scan.nextInt();
//
//        if(choose == 1){
//            System.out.println(add(double val1, double val2));
//        }
//        else if(choose == 2){
//            System.out.println(subtract(double val1, double val2));
//        }
//        else if(choose == 3){
//            System.out.println(multiply(double val1, double val2));
//        }
//        else if(choose == 4){
//            System.out.println(divide(double val1, double val2));
//        }
//        else{
//            System.out.println("Not a valid operation!");
//        }
//
//        }
//
//    public static double add(double val1, double val2){
//        return val1 + val2;
//    }
//
//    public static double subtract(double val1, double val2){
//        return val1 - val2;
//    }
//
//    public static double multiply(double val1, double val2){
//        return val1 * val2;
//    }
//
//    public static double divide(double val1, double val2){
//        return val1 / val2;
//    }
//
//    public static double modulus(double val1, double val2){
//        return val1 % val2;
//    }
//
//
//
//    /*
//    *
//    * Top of main function
//    * print some greeting
//    * print Top Menu (1: Basic Math    2:Scientific:    3:Exit)
//    * change some local boolean called isRunning to true
//    * ///Above is start of program (opening)
//    * Enter while(isRunning){
//    * //In here is the 'program' as you think of it, running the calc, doing math
//    * }
//    * ///Below is some closing, probably just saying some closing message
//    * */
//
//    printGreeting();
//    initialize(); //<--- Here I would display 0, I would set isRunning to true, and any other prep stuff, menuLevel = 0
//    while(isRunning){
//        printMenu();
//        getInput();
//    }
//
//
//
//}
