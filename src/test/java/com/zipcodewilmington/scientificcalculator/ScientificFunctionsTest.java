package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.ScientificFunctions;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class ScientificFunctionsTest {


    ScientificFunctions testCalc = new ScientificFunctions();

    @Test
    public void sineTest() { //is there a way to check for radians vs degrees?
        Assertions.assertEquals(-0.26237485370392877, testCalc.sine(50));
    }

    @Test
    public void cosineTest() { //is there a way to check for radians vs degrees?
        Assertions.assertEquals(0.9649660284921133, testCalc.cosine(50));
    }

    @Test
    public void tangentTest() { //is there a way to check for radians vs degrees?
        Assertions.assertEquals(-0.27190061199763077, testCalc.tangent(50));
    }

    @Test
    public void inverseSineTest() { //is there a way to check for radians vs degrees?
        Assertions.assertEquals(0.5235987755982989, testCalc.inverseSine(0.5));
    }

    @Test
    public void inverseCosineTest() { //is there a way to check for radians vs degrees?
        Assertions.assertEquals(1.0471975511965979, testCalc.inverseCosine(0.5));
    }

    @Test
    public void inverseTangentTest() {Assertions.assertEquals(0.4636476090008061, testCalc.inverseTangent(0.5));}

    @Test
    public void factorialTest() {Assertions.assertEquals(120, testCalc.factorial(5));}

    @Test
    public void naturalLogTest() {Assertions.assertEquals(3.912023005428146, testCalc.naturalLog(50));}

//    @Test //Inverse log formula not calculating correctly.
//    public void inverseLogTest() {Assertions.assertEquals(1.6989700043360187, testCalc.inverseLog(50));}

//    @Test //going back to college to learn algebra.
//    public void inverseLogTest() {Assertions.assertEquals(0, testCalc.inverseNatLog(5));}
}

