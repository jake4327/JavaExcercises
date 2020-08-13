package com.qa.day5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class AtBashTest{

    @Test
    void testAtBashEncode(){
        assertEquals("draziw", AtBash.encode("wizard"));
        assertEquals("wizard", AtBash.encode("draziw"));
        assertEquals("wiz ard", AtBash.encode("dra ziw"));
        assertEquals("svool hri", AtBash.encode("hello sir"));
        assertEquals("hello sir", AtBash.encode("svool hri"));
    }

    @Test
    void testAtBashReverseCharArray(){
        char[] alphabetReverse = {'z','y','x','w','v','u','t','s','r','q','p',
                'o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
        assertEquals(Arrays.toString(alphabetReverse), Arrays.toString(AtBash.reverse()));
    }

}
