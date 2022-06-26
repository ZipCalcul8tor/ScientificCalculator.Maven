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

}