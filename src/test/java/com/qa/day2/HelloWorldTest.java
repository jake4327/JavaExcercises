package com.qa.day2;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void testPrintTwo(){
        assertEquals("same return", HelloWorld.printTwo("same return"));
    }

}
