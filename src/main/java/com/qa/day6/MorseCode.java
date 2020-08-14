package com.qa.day6;

public class MorseCode {

    public static void main(String[] args) {
        decodeMorseToEnglish("-");
    }

    public static String encodeEnglishToMorse(String english) {
        String encryptedString = english.toLowerCase();
        String outString = "";
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
        String[] alphabetMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", " / "};
        // a ---> .-, // 'c' this is a char 'fjfj' this is a String //give
        // b ---> -...
        // c ---> -.-.
        char[] encryptedStringAsCharArray = encryptedString.toCharArray(); // message -> ['m','e']
        for (char c : encryptedStringAsCharArray) {
            for (int a = 0; a < alphabet.length; a++) {
                if (c == alphabet[a]) {
                    outString += (alphabetMorse[a]);
                }
            }
        }


        return outString;
    }

    public static String decodeMorseToEnglish(String morse){
        int jumpHop = 0;
        String output = "";
        for(int i =0; i <= morse.length(); i++){
            System.out.println(morse.substring(4,5));
            if(i == morse.length() && !(morse.substring(i-2,i-1).equals(" "))){
                System.out.println("hit");
                output += singleLetterMorseToEnglish(singleLetterMorseToEnglish(morse.substring(i-2, i-1)));
            }else if(morse.charAt(i) == ' '){
                System.out.println("Strings: " + jumpHop + i);
                output  += singleLetterMorseToEnglish(morse.substring(jumpHop, i));
                jumpHop = i+1;
                continue;
            }else if(morse.charAt(i) == '/'){
                output += " ";
            }
        }


        return output;
    }/* {
        String output = "";
        String currentLetter = "";
        int holdI;
        int morseLengthWithoutSpace = IterationStringManipulation.countWords(morse);
        System.out.println("Word Count: " + morseLengthWithoutSpace);
        for (int i = 0; i < morseLengthWithoutSpace; i++) {
            holdI = i;  // . . .
            while (morse.charAt(i) != '/') {
                System.out.println("v" + morse.charAt(i) + "isble");
                if (morse.charAt(i) == ' ') {
                    break;
                }
                currentLetter += morse.substring(i, i + 1);
                if (i == morse.length() - 1) {
                    break;
                }
                i++;
            }
            i = holdI;
            System.out.println(singleLetterMorseToEnglish(currentLetter));
            if (i == morse.length() - 1) {
                output += singleLetterMorseToEnglish(currentLetter);
                break;
            }
            i = holdI;
            if (morse.substring(i, i + 1).equals("/")) {
                output += " ";
                i++;
            }
        }
            System.out.println(currentLetter);//. . . ->
            output += singleLetterMorseToEnglish(currentLetter);



        //System.out.println(Arrays.deepToString(alphabetTwo));
        //.- / -... / -.-. -> ABC
        //. / - / - / . / . / . / - / . / - / . -> ETTEEETETE


        return output;
    }*/

    public static String singleLetterMorseToEnglish(String morse) {
        char[] charMorse = morse.toCharArray();
        String[][] englishToMorseMap = {{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " ", ""}, {
                ".-",
                "-...",
                "-.-.",
                "-..",
                ".",
                "..-.",
                "--.",
                "....",
                "..",
                ".---",
                "-.-",
                ".-..",
                "--",
                "-.",
                "---",
                ".--.",
                "--.-",
                ".-.",
                "...",
                "-",
                "..-",
                "...-",
                ".--",
                "-..-",
                "-.--",
                "--..",
                "/",
                " "
        }};
        String output = "";

        for (int j = 0; j < englishToMorseMap[1].length; j++) {
                /*System.out.println(morse.substring(i, i + 1).equals(englishToMorseMap[1][j]));
                System.out.print("MORSE " + morse.substring(i, i + 1) + "\n");
                System.out.println("MORSE MAP: " + englishToMorseMap[1][j] + "\n\n");
                */
            if (morse.equals(englishToMorseMap[1][j])) {
                    //System.out.print("Hit");
                    output += englishToMorseMap[0][j];
                    break;
                }
            }
        return output.toUpperCase();
    }
}
