package com.qa.day3;

public class IterationStringManipulation {

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

    public static String printVertical(String input){
        String s = "";
        for(int i = 0; i < input.length(); i++){
            //System.out.println(input.substring(i, i+1));
            s += input.substring(i, i+1) + "\n";
        }
        return s;
    }

    public static String printReverseVertical(String input){
        String s = "";
        for(int i = input.length(); i > 0; i--){
            //System.out.println(input.substring(i-1, i));
            s += input.substring(i-1, i) + "\n";
        }
        return s;
    }

    public static boolean insideMessage(String message, String doesMessageContain){
        for(int i = 0; i < message.length(); i++){
            try {
                //System.out.println(message.substring(i, doesMessageContain.length()+i));
                //System.out.println(doesMessageContain);
                //System.out.println();
                if (doesMessageContain.equals(message.substring(i, doesMessageContain.length()+i))) {
                    //System.out.println("match found");
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
