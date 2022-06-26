package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class Calculator1Test {

//    @BeforeAll //Runs before any test
//
//    public void calcReset() {
//        Calculator1 testCalc = new Calculator1();
//    }
//  @Test
//    public void calculatorIsInitialized() {
//        Assertions.assertTrue(calculator.getStatus()); //This may need to be changed to assertEquals depending on initialization state.
//    }

    //Basic Functions Tests
    @Test
    public void additionTest() {
        Assertions.assertEquals(7, Calculator1.addition(3, 4));
    }

    @Test
    public void subtractionTest() {
        Assertions.assertEquals(3, Calculator1.subtraction(7, 4));
    }

    @Test
    public void multiplicationTest() {
        Assertions.assertEquals(21, Calculator1.multiplication(7, 3));
    }

    @Test               //Test that divide by 0 throws an 'Err'
    public void divisionTest() {
        Assertions.assertEquals(7, Calculator1.division(21, 3));
//        Assertions.assertEquals("Err", calculator.division(5, 0));
    }

    @Test  //passes, but how to best integrate?
    public void divideByZeroTest() {
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculator1.division(5, 0);
        });
        Assertions.assertEquals("Err", exception.getMessage());
    }

    @Test
    public void squareTest() {
        Assertions.assertEquals(121, Calculator1.square(11));
    }

    @Test
    public void squareRootTest() {
        Assertions.assertEquals(11, Calculator1.squareRoot(121, 1));
    }

    @Test
    public void variableExponentTest() {
        Assertions.assertEquals(16807, Calculator1.toPower(7, 5));
    }

    @Test
    public void inverseTest() { //this test runs fine, results may be different depending on how many decimal points we return.
        Assertions.assertEquals(0.2, Calculator1.inverse(5));
    }

}