package com.qa.day5;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest{

    @Test
    void divisionTest() {
        double ans = 20.0 / 5.0;
        //ans should be 4
        assertEquals(Calculator.division(20.0, 5.0), 4.0, 0.6);
    }
}