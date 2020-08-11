package com.qa.day3;

public class IterationStringManipulation {

    public static void main(String[] args) {
        System.out.println(countWords("This is a sentence where all of the words are counted there are fiftheen words"));
        System.out.println(countWords(" space at front word count six"));
        System.out.println(countWords("space at back word count six "));
        System.out.println(countWords("  double space at front and double space at back word count tweleve  "));
        System.out.println();
        printVertical("hello World");
        System.out.println();
        printReverseVertical("hello World");
        System.out.println();
        System.out.println(insideMessage("hello World", "hello"));
    }

    public static int countWords(String input){
        int count = 0;
        boolean space = true;
        for(int i =0; i < input.length(); i++){
            if(input.substring(i, i+1).equals(" ")){
                do{
                    try {
                        i++;
                        if (!(input.substring(i, i + 1).equals(" "))) {
                            space = false;
                        }
                    }catch(Exception e){
                        continue;
                    }
                }while(space);
                count++;
            }
        }
        if(!(input.substring(input.length()-1).equals(" "))){
            count++;
        }
        if(input.substring(0,1).equals(" ")){
            count--;
        }
        return count;
    }

    public static void printVertical(String input){
        for(int i = 0; i < input.length(); i++){
            System.out.println(input.substring(i, i+1));
        }
    }

    public static void printReverseVertical(String input){
        for(int i = input.length(); i > 0; i--){
            System.out.println(input.substring(i-1, i));
        }
    }

    public static boolean insideMessage(String message, String doesMessageContain){
        for(int i = 0; i < message.length(); i++){
            if(message.substring(i,doesMessageContain.length()-1).equals(doesMessageContain.substring(0, doesMessageContain.length()-1))){
                    System.out.println("match found");
                    return true;
                }
        }
        return false;
    }
}
