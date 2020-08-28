package com.qa.day12;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void sumOfTwoNumbersTest() {
        Assert.assertEquals(10, Calculator.sumOfTwoNumbers(6,4 ));
        Assert.assertEquals(20, Calculator.sumOfTwoNumbers(10,10 ));
        Assert.assertEquals(15, Calculator.sumOfTwoNumbers(7,8 ));
        Assert.assertEquals(14, Calculator.sumOfTwoNumbers(6,8 ));
    }

    @Test
    public void method2() {
    }

    @Test
    public void method3() {
    }

    @Test
    public void method4() {
    }

    @Test
    public void method5() {
    }

    @Test
    public void method6() {
    }
}