package com.zipcodewilmington.scientificcalculator;
import com.zipcodewilmington.scientificcalculator.calculator;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
//        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);

        calculator calculator1 = new calculator();
calculator1.division(5,0);
System.out.println(calculator1.display);
    }
}
