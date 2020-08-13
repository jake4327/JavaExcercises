package com.qa.day2;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class OperatorsTest{

    @Test
    public void testAddition(){
        assertEquals(5, Operators.addition(3,2));
        assertEquals(18, Operators.subtraction(20, 2));
        assertEquals(50, Operators.multiplication(10, 5));
        assertEquals(Operators.division(100,10), 10.0, 0);
    }
}