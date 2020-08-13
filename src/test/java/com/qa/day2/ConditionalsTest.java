package com.qa.day2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConditionalsTest {

    @Test
    public void testProblemOne(){
        assertEquals(5, Conditionals.problemOne(2,3,true));
        assertEquals(6, Conditionals.problemOne(2,3,false));
    }

    @Test
    public void testFlowChart(){
        assertEquals("ABE" , Conditionals.flowChart(2001));
        assertEquals("135" , Conditionals.flowChart(2000));
        assertEquals("1346" , Conditionals.flowChart(599));
        assertEquals("ABE" , Conditionals.flowChart(3000));
        assertEquals("ABD" , Conditionals.flowChart(4001));
        assertEquals("AC" , Conditionals.flowChart(6001));
    }


    @Test
    public void testBlackJack(){
        assertEquals(0, Conditionals.blackJack(21,1));
        assertEquals(19+2, Conditionals.blackJack(19, 2));
    }
}
