package com.zipcodewilmington.scientificcalculator;
import com.zipcodewilmington.scientificcalculator.Calculator;
/**
 * Created by leon on 2/9/18.
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class altIncompleteMainApplication {

    public static Calculator calc = new Calculator();
    public static ScientificFunctions sci = new ScientificFunctions();
    public static double x, y;

    public static String yInit = "";
    public static String result = "";
    public static String operator = "";
    public static String[] options = {"+", "-", "*", "/", "^", "s", "c", "t", "is", "ic", "it", "!", "log", "ilog", "off"};

    public static Boolean onOff = true;
    public String mode = "";

    public static void main(String[] args) {
        System.out.println("Welcome To ZipCalcul8tor");
        while (onOff = true) {
//            System.out.println("Please Enter a Mode");
//            Scanner modeSelect = new Scanner(System.in);

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number");

            while (result.equals("")) {
                if (!userInput.hasNextDouble()) {
                    result = "";
                } else {
                    x = userInput.nextDouble();
                    result = Double.toString(x);
                    System.out.println(result);
                }
            }

            while (operator.equals("")) {

                //Display Instructions
                System.out.println("'+' for Addition| '-' for Subtraction| '*' for Multiplication'| '/' for Division'");
                System.out.println("'^' for Exponent'| 's' for Sine| 'c' for Cosine| 't' for Tangent");
                System.out.println("'is' for Inverse Sine| 'ic' for Inverse Cosine| 'it' for Inverse Tangent");
                System.out.println("'!' for Factorial| 'log' for Natural Log| 'ilog' for Inverse Log");
                System.out.println("'off' to power off");
                System.out.println("Please Enter an Operation");

                //To Get Operation
                Scanner operatorInput = new Scanner(System.in);
                System.out.print(result + " ");
                operator = userInput.next();

                //Check Against Available Options
                if(!Arrays.asList(options).contains(operator)) {
                    operator = "";
                    System.out.println("Please enter a valid command");
                }
            }


            while (yInit.equals("")) {
                Scanner yInput = new Scanner(System.in);
                System.out.print(result + " " + operator + " Please enter a number");
                if (!yInput.hasNextDouble()) {
                    yInit = "";
                } else {
                    y = yInput.nextDouble();
                    yInit = Double.toString(x);
                }
            }

            System.out.println(x + " " + operator + " " + y);




//        result = sci.square(input);
//        System.out.println(result);

            }
        }
    }

