package com.zipcodewilmington.scientificcalculator;
import com.zipcodewilmington.scientificcalculator.Calculator;
/**
 * Created by leon on 2/9/18.
 */
import java.util.Scanner;
import java.util.ArrayList;
public class MainApplication {

    public static Calculator calc = new Calculator();
    public static ScientificFunctions sci = new ScientificFunctions();
    public static double x, y;
    public static String result = "";
    public static String operator = "";
    public static String[] options = {"+", "-", "*", "/", "^", "s", "c", "t", "is", "ic", "it", "!", "log", "ilog", "off"};
    public static Boolean onOff = true;

    public static void main(String[] args) {
        System.out.println("Welcome To ZipCalcul8tor");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number");
        if (onOff = true) {
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
                System.out.println("'+' for Addition| '-' for Subtraction| '*' for Multiplication'| '/' for Division'");
                System.out.println("'^' for Exponent'| 's' for Sine| 'c' for Cosine| 't' for Tangent");
                System.out.println("'is' for Inverse Sine| 'ic' for Inverse Cosine| 'it' for Inverse Tangent");
                System.out.println("'!' for Factorial| 'log' for Natural Log| 'ilog' for Inverse Log");
                System.out.println("'off' to power off");
                System.out.println("Please Enter an Operation");
                Scanner operatorInput = new Scanner(System.in);
                System.out.print(result + " ");
                operator = userInput.next();

//                for (int count = 0; count < options.length; count++) {
//
//
//
//                    if (userInput.equals(options[count])) {
//                        operator = userInput.next();
//                    }
//                }


//        result = sci.square(input);
//        System.out.println(result);

//        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
            }
        }
    }
}
