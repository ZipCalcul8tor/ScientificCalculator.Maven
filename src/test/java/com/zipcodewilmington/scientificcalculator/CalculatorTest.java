package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    public void calcReset() {
        Calculator testCalc = new Calculator();
    }


}