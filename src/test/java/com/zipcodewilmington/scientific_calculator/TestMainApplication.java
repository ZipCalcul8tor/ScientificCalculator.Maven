//check name of basic & scientific classes, 'calculator' in calculator.method will need to be updated per test.
package com.zipcodewilmington.scientific_calculator;


/**
 * Created by leon on 2/9/18.
 */

import com.zipcodewilmington.scientificcalculator.calculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class TestMainApplication {

    @BeforeAll //Runs before any test

    public void calcReset() {
        calculator testCalc = new calculator();
    }
//  @Test
//    public void calculatorIsInitialized() {
//        Assertions.assertTrue(calculator.getStatus()); //This may need to be changed to assertEquals depending on initialization state.
//    }

    @Test
    public void additionTest() {
        Assertions.assertEquals(7, calculator.addition(3, 4));
    }

    @Test
    public void subtractionTest() {
        Assertions.assertEquals(3, calculator.subtraction(7, 4));
    }

    @Test
    public void multiplicationTest() {
        Assertions.assertEquals(21, calculator.multiplication(7, 3));
    }

    @Test               //Test that divide by 0 throws an 'Err'
    public void divisionTest() {
        Assertions.assertEquals(7, calculator.division(21, 3));
    }

    @Test
    public void squareTest() {
        Assertions.assertEquals(121, calculator.square(11));
    }


}


