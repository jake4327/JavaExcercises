package com.qa.day2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConditionalsNumbersTest {

    @Test
    public void testDigitAddition(){
        assertEquals(0,ConditionalsNumbers.digitAdditionTenToOneHundered(1));
        assertEquals(0,ConditionalsNumbers.digitAdditionTenToOneHundered(101));
        assertEquals(1,ConditionalsNumbers.digitAdditionTenToOneHundered(10));
        assertEquals(1,ConditionalsNumbers.digitAdditionTenToOneHundered(100));
        assertEquals(18,ConditionalsNumbers.digitAdditionTenToOneHundered(99));
    }

    @Test
    public void testNumbersToDigits(){
        assertEquals("Not in range", ConditionalsNumbers.numbersToDigitsOneToNineNine(0));
        assertEquals("Not in range", ConditionalsNumbers.numbersToDigitsOneToNineNine(100));
        assertEquals("ninety-nine",ConditionalsNumbers.numbersToDigitsOneToNineNine(99));
        assertEquals("one",ConditionalsNumbers.numbersToDigitsOneToNineNine(1));
        assertEquals("fifty",ConditionalsNumbers.numbersToDigitsOneToNineNine(50));
    }

    @Test
    public void testPrintNumberAboveTwenty(){
        assertEquals("twenty",ConditionalsNumbers.printNumberAboveTwenty(2));
        assertEquals("ninety",ConditionalsNumbers.printNumberAboveTwenty(9));
    }

    @Test
    public void testPrintNumberbelowTen(){
        assertEquals("one",ConditionalsNumbers.printNumberBelowTen(1, false));
        assertEquals("-one",ConditionalsNumbers.printNumberBelowTen(1, true));
        assertEquals("nine",ConditionalsNumbers.printNumberBelowTen(9, false));
        assertEquals("-nine",ConditionalsNumbers.printNumberBelowTen(9, true));
    }

    @Test
    public void testPrintTeens(){
        assertEquals("nineteen",ConditionalsNumbers.printTeens(19));
        assertEquals("ten",ConditionalsNumbers.printTeens(10));
        assertEquals("fifteen",ConditionalsNumbers.printTeens(15));
    }

    @Test
    public void testDigitAdditionThreeNumbers(){
        assertEquals(27,ConditionalsNumbers.digitAdditionThreeNumbers(999));
        assertEquals(1,ConditionalsNumbers.digitAdditionThreeNumbers(1));
        assertEquals(1,ConditionalsNumbers.digitAdditionThreeNumbers(1));
        assertEquals(9,ConditionalsNumbers.digitAdditionThreeNumbers(18));
        assertEquals(5,ConditionalsNumbers.digitAdditionThreeNumbers(500));
        assertEquals(6,ConditionalsNumbers.digitAdditionThreeNumbers(501));
    }

    @Test
    public void testDigitAdditionFourNumbers(){
        assertEquals(9,ConditionalsNumbers.digitAdditionFourNumbers(9));
        assertEquals(18,ConditionalsNumbers.digitAdditionFourNumbers(99));
        assertEquals(27,ConditionalsNumbers.digitAdditionFourNumbers(999));
        assertEquals(36,ConditionalsNumbers.digitAdditionFourNumbers(9999));
        assertEquals(6,ConditionalsNumbers.digitAdditionFourNumbers(5001));
        assertEquals(5,ConditionalsNumbers.digitAdditionFourNumbers(5000));

    }

}
