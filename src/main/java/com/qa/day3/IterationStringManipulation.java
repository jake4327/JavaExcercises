package com.qa.day3;

public class IterationStringManipulation {

    public static void main(String[] args) {
        /**System.out.println(countWords("This is a sentence where all of the words are counted there are fiftheen words"));
        System.out.println(countWords(" space at front word count six"));
        System.out.println(countWords("space at back word count six "));
        System.out.println(countWords("   double  space at front and double space at back word count tweleve   "));
        System.out.println();
        printVertical("hello World");
        System.out.println();
        printReverseVertical("hello World");
        System.out.println();
        **/
        insideMessage("hello World", "hello");
        insideMessage("0000", "000");
        insideMessage("11 1 1 1", "1");
        insideMessage("hello", "goodbye");
        insideMessage("small match", "all");
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
            try {
                //System.out.println(message.substring(i, doesMessageContain.length()+i));
                //System.out.println(doesMessageContain);
                //System.out.println();
                if (doesMessageContain.equals(message.substring(i, doesMessageContain.length()+i))) {
                    System.out.println("match found");
                    return true;
                }
            }catch(Exception e){
                //System.out.println("Patch fails");
                break;
            }
        }
        System.out.println("match not found");
        return false;
    }

}
