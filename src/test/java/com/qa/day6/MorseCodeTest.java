package com.qa.day6;

import org.junit.Assert;
import org.junit.Test;

public class MorseCodeTest {

    @Test
    public void encodeEnglishToMorse() {
        //please
        Assert.assertEquals("---.-- / -..---.", MorseCode.encodeEnglishToMorse("My name"));
        Assert.assertEquals(".- / -...-.-.-.....-.--........----.-.-..---.---.--.--.-.-....-..-...-.---..--.----.. / ",
                MorseCode.encodeEnglishToMorse("a bcdefghijklmnopqrstuvwxyz "));
    }


    @Test
    public void decodeMorseToEnglish() {
        //. . . -> EEE
        // - -> TT
        // . . -> EE
        // .. .. .. / .. .. .. -> III III
        Assert.assertEquals("TT", MorseCode.decodeMorseToEnglish("- -"));
        Assert.assertEquals("EE", MorseCode.decodeMorseToEnglish(". ."));
        Assert.assertEquals("III III", MorseCode.decodeMorseToEnglish(".. .. .. / .. .. .."));
        Assert.assertEquals("", MorseCode.decodeMorseToEnglish(" "));
        Assert.assertEquals(" ", MorseCode.decodeMorseToEnglish("/"));
        Assert.assertEquals("E", MorseCode.decodeMorseToEnglish("."));
        Assert.assertEquals("EEE", MorseCode.decodeMorseToEnglish(". . ."));
    }

    @Test
    public void changeSimpleStringToMorseCode() {
        Assert.assertEquals("E", MorseCode.singleLetterMorseToEnglish("."));
        Assert.assertEquals("I", MorseCode.singleLetterMorseToEnglish(".."));
        Assert.assertEquals("", MorseCode.singleLetterMorseToEnglish(" "));
    }
}
