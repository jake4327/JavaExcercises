package com.qa.day7;

import com.qa.day6.MorseCode;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {

    public static String[] alphabetMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "/"};
    public static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};

    public static Map<String, Character> populateMorseMap() {
        Map<String, Character> letterToMorse = new HashMap<>();
        for(int i = 0; i < alphabet.length; i++){
            letterToMorse.put(alphabetMorse[i], alphabet[i]);
        }
        return letterToMorse;
    }

    public String translate(String s) {
        return MorseCode.decodeMorseToEnglish(s);
    }
}
