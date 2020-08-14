package com.qa.day5;

import java.util.ArrayList;

public class BrokenKeyBoard {

    //USE DYNAMIC PROGRAMMING
    //GRID
    //Recursive solution???
    //SIMPLE METHOD - O()
    //input = {lines to read, keysThatWorkLineOne, keysThatWorkLineTwo, keysThatWorkLineThree}
    //input = {3, "abcd","qwer","hjk"}
    //input = {dictionary.txt}
    //Function
    //Example
    //search a -> aa(full match Len: 2) -> aaa -> X -> aab -> X-> aac -> X-> aad -> X ->
    //       ab -> X -> aba -> X -> abb(full match Len:3) -> abba(full match Len:4) -> abbaa ->X -> abbab - > X->
    //       abbac -> abbad -> X -> abbb ->  X -> abbc -> X ->
    //       abbd -> X -> ba(full match Len:2) -> baa (full match Len:3) -> baaa -> X ->
    //       baab -> X -> baac -> X -> baad -> X -> bab -> baba(full match Len:4)
    //Daood method
    // a
    /*
        a
        aa
        ...
        aaaaaaaaaaaaaaaaaaaaaaaaaa....a
        ab
        aba
        ...
        abaaaaaaaaaaaaaaaaaaaaaaaaaaa...a
        abb
        abbaaaaaaaaaaaaaaaaaaaaaaaaaaa...a
        ...
        abba
        check for char[0] in dictionary
        if success
            check for char[0] + char[0]
               if success
                    check for char[0] + char[0] + char[0]
               ...
     */
    //What am I doing?
    //Take the first char = firstWorkingKey from the keysThatWorkLineOne string
    //Compare firstWorkingKey to dictionary
    //String[] justKeysThatWork = input[1..N] REMOVING input[0]
    //for(String s : justKeysThatWork){
    // char[] workingKeys = turnWorkingKeysToCharArray(s)
    //  for(char c: workingKeys){
    //      currentMatchString<Char> = []
    //      currentMatchString.add(c)
    //      for(char c1: workingKeys){
    //
    //
    //      if match currentMatchString = firstWorkingKey
    //           if(matchToDictionary(currentMatchString) and currentMatchString.length > currentLongestWord){
    //              currentLongestString = currentMatchString;
    //            }
    //      }
    //      currMatchString.add(c1);
    //
    // }
    //return currentLongestWord;

    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        input.add("3");
        input.add("ab");
        //input.add("hjklo");
        //input.add("qwer");
        ArrayList<String> dictionary = new ArrayList<>();
        dictionary.add("aaaa");
        dictionary.add("aaaab");
        helpMeMyKeyBoardsBroken(input, dictionary);
    }

    public static void helpMeMyKeyBoardsBroken(ArrayList<String> inputArray, ArrayList<String> dictionary) {
        //formatInput()
        ArrayList<String> justKeysThatWork = new ArrayList<>();
        ArrayList<Character> currentMatchString = new ArrayList<>();
        //System.out.println(justKeysThatWork.length);
        for (int i = 1; i < inputArray.size(); i++) {
            justKeysThatWork.add(inputArray.get(i));
        }
        char[] workingKeys = new char[4]; //Insert a library
        for (String s : justKeysThatWork) {

            workingKeys = s.toCharArray();
            //System.out.println(workingKeys);
            String currentWorkingSolution = "";
            for (int i = 0; i < workingKeys.length; i++) {
                currentWorkingSolution += workingKeys[i];
                System.out.println(currentWorkingSolution);
                while (possibleWordInDictionary(currentWorkingSolution)) {
                    currentWorkingSolution += workingKeys[i];
                    //System.out.println(currentWorkingSolution);
                }
                if(currentWorkingSolution.length() > 1) {
                    System.out.println("I want to change i to one: " + i);
                    if(i >= 2) {
                        System.out.println("I want to change i to one: " + i);
                        i = i - (i - 1);
                    }
                    currentWorkingSolution = currentWorkingSolution.substring(0, currentWorkingSolution.length() - 2);

                }
            }
        }
    }

    public static boolean possibleWordInDictionary(String possibleMatch){
        System.out.println("Posible Word to test: " + possibleMatch);
        return possibleMatch.equals("aaaa") || possibleMatch.equals("aaa")
                || possibleMatch.equals("aa") || possibleMatch.equals("a") || possibleMatch.equals("aaab");
    }

            /*for (char c : workingKeys) {
                currentMatchString = new ArrayList<>();
                currentMatchString.add(c);
                for(char c1: workingKeys) {
                    //System.out.print(c1);
                    while(currentMatchString.size() < 5){
                        System.out.print("Functionality");
                        //keep adding a till I say stop
                        System.out.println(" Word Searching: " + currentMatchString.toString());
                        currentMatchString.add(c1);
                    }
                }
            }
        }*/
            //      currentMatchString<Char> = []
            //      currentMatchString.add(c)
            //      for(char c1: workingKeys){
            //
            //
            //      if match currentMatchString = firstWorkingKey
            //           if(matchToDictionary(currentMatchString) and currentMatchString.length > currentLongestWord){
            //              currentLongestString = currentMatchString;
            //            }
            //      }
            //      currMatchString.add(c1);
            //
            // }
            //return currentLongestWord;
            //codeay
}


