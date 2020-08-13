package com.qa.day2;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ConditionalsTaxesTest {

    @Test
    public void testTaxAmount(){
        assertEquals(ConditionalsTaxes.taxAmount(10000), 0.0, 0);
        assertEquals(ConditionalsTaxes.taxAmount(16000), 100.1, 0.1);
        assertEquals(ConditionalsTaxes.taxAmount(25000), 1750.25, 0);
        assertEquals(ConditionalsTaxes.taxAmount(35000), 5250.45, 0);
        assertEquals(ConditionalsTaxes.taxAmount(50000), 12000.7, 0);
    }
}
