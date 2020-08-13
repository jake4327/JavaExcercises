package com.qa.day3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterationStringManipulationTest {

    @Test
    public void countWords() {
        Assert.assertEquals(15, IterationStringManipulation.countWords("This is a sentence where all of the words are counted there are fifteen words"));
        Assert.assertEquals(6,IterationStringManipulation.countWords(" space at front word count six"));
        Assert.assertEquals(6,IterationStringManipulation.countWords("space at back word count six "));
        //Three spaces break the code
        Assert.assertEquals(12,IterationStringManipulation.countWords("   double  space at front and double space at back word count tweleve  "));
    }

    @Test
    public void printVertical() {
        Assert.assertEquals("h\n" +
                "e\n" +
                "l\n" +
                "l\n" +
                "o\n" +
                " \n" +
                "W\n" +
                "o\n" +
                "r\n" +
                "l\n" +
                "d\n", IterationStringManipulation.printVertical("hello World"));
    }

    @Test
    public void printReverseVertical() {
        Assert.assertEquals("d\n" +
                "l\n" +
                "r\n" +
                "o\n" +
                "W\n" +
                " \n" +
                "o\n" +
                "l\n" +
                "l\n" +
                "e\n" +
                "h\n", IterationStringManipulation.printReverseVertical("hello World"));

    }

    @Test
    public void insideMessage() {
        assertTrue(IterationStringManipulation.insideMessage("hello World", "hello"));
        assertTrue(IterationStringManipulation.insideMessage("0000", "000"));
        assertTrue(IterationStringManipulation.insideMessage("11 1 1 1", "1"));
        assertFalse(IterationStringManipulation.insideMessage("hello", "goodbye"));
        assertTrue(IterationStringManipulation.insideMessage("small match", "all"));
    }
}