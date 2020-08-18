package com.qa.day5;

public class AtBash {

    public static void main(String[] args) {
        encode("day");
    }

    public static char[] reverse(){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i', 'j','k','l','m','n','o','p','q','r','s','t','u', 'v','w','x','y','z'};
        char[] reverseAlphabet = new char[alphabet.length];
        int count = 0;
        for(int i = alphabet.length-1; i >-1 ; i--){
            reverseAlphabet[count] = alphabet[i];
            count++;
        }
        return reverseAlphabet;
    }
                                        //day - d -> lo
    public static String encode(String beforeCypher){
        String encryedString = beforeCypher.toLowerCase();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i', 'j','k','l','m','n','o','p','q','r','s','t','u', 'v','w','x','y','z', ' '};
        char[] alphabetReverse = {'z','y','x','w','v','u','t','s','r','q','p', 'o','n','m','l','k','j','i','h','g','f','e','d','c','b','a', ' '};
        StringBuilder outString = new StringBuilder();
        char[] encryedStringAsCharArray  = encryedString.toCharArray(); // "day" --> ['d','a','y']
        for(char c: encryedStringAsCharArray){
            for(int a = 0; a < alphabet.length; a++){
                if(c == alphabet[a]){
                    outString.append(alphabetReverse[a]);
                }
             }
        }
        return outString.toString();
    }
}
