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

    //Basic Functions Tests
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
//        Assertions.assertEquals("Err", calculator.division(5, 0));
    }

    @Test  //passes, but how to best integrate?
    public void divideByZeroTest() {
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.division(5, 0);
        });
        Assertions.assertEquals("Err", exception.getMessage());
    }

    @Test
    public void squareTest() {
        Assertions.assertEquals(121, calculator.square(11));
    }

    @Test
    public void squareRootTest() {
        Assertions.assertEquals(11, calculator.squareRoot(121));
    }

    @Test
    public void variableExponentTest() {
        Assertions.assertEquals(16807, calculator.variableExponent(7, 5));
    }

    @Test
    public void inverseTest() { //this test runs fine, results may be different depending on how many decimal points we return.
        Assertions.assertEquals(0.2, calculator.inverse(5));
    }

//   @Test                                         //Read & practice error & exception testing.
//    public void errorTesting() {
//
//    }

    //Clear Button & Unit Type Tests
    @Test
    public void clearButtonTest() {
        Assertions.assertTrue(calculator.currentTotal == 0);
    }

    //Tests below here require updating "calculator2" with scientific calculator name class, once provided.

    //How should these conversions be tested? Will user still enter decimal values or values in stated type?
    @Test
    public void binaryNumberTest() {
        Assertions.assertEquals(100111001, calculator2.binary(313));
    }

    @Test
    public void octalNumberTest() {
        Assertions.assertEquals(471, calculator2.octal(313));
    }

    @Test
    public void decimalNumberTest() {
        Assertions.assertEquals(313, calculator2.decimal(313));
    }

    @Test
    public void hexadecimalTest() {
        Assertions.assertEquals(139, calculator2.hexadecimal(313));
    }

//    @Test  //See how this is programmed on JD's end.
//    public void switchDisplayTest() {
//
//    }

    //Memory Tests

    @Test        //Check this against SciCalc code, is this best way to test this value is stored?
    public void memoryTest() {
        Assertions.assertEquals(12, calculator2.memStore(12));
    }

    @Test  //WILL NEED A TEST FOR WHEN MEM IS CALLED BUT IS NULL TO RETURN 'Err'
    //to make this work, rather than null, set initial memory to 0, but have a corresponding boolean to see if the user has
    //store a value. If so set value to true. If false, memory cannot be called (if else statement in memory call).
    public void memClearTest() {
        memory = 12;
        calculator2.callClearMem();
        Assertions.assertEquals(null, calculator2.memStore(null)); //doubles cannot be nulls, find workaround.
//        Assertions.assertFalse(calculator2.numStored); //see above note.
    }

    //For trig functions, find out how code is handling the numbers. Test cases may need to be updated to reflect radians.
    //Math.toRadians(variable);
    @Test
    public void sineTest() { //is there a way to check for radians vs degrees?
        Assertions.assertEquals(0.76604444, calculator2.sine(50));
    }

    @Test
    public void cosineTest() {
        Assertions.assertEquals(0.96496602849, calculator2.cosine(50));
    }

    @Test
    public void tangentTest() {
        Assertions.assertEquals(-0.27190061199, calculator2.tanget(50));
    }

    //The Inverse Operations Tests


    //Switching Units


}


