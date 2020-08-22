package com.qa.day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class BrokenKeyBoard {

    public static ArrayList<Character> alphabet = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(example("src/main/java/com/qa/day5/input.txt", "src/main/java/com/qa/day5/dictionary.txt"));
        //example();
    }

    public static String example(String fileLocationOfInput, String fileLocationOfDictionary) throws FileNotFoundException {
        ArrayList<String> keyBoards = getWorkingKeys(fileLocationOfInput);
        ArrayList<String> answer = new ArrayList<>();
        keyBoards.remove(0);
        for (String s : keyBoards) {
            Scanner scannerObjInDictionary = getDictionary(fileLocationOfDictionary);

            ArrayList<Character> brokenKeysOnKeyBoard = getBrokenKeys(s);

            //ArrayList<String> possibleWords = filterWords(scannerObjInDictionary, brokenKeysOnKeyBoard);
            ArrayList<String> possibleWords = filterWords(scannerObjInDictionary, brokenKeysOnKeyBoard);
            String ans = longestWord(possibleWords);
            answer.add(ans);
        }
        return formatAnswer(answer, keyBoards);
    }

    private static String formatAnswer(ArrayList<String> answer, ArrayList<String> keyBoards) {
        String output = "";
        for (int i = 0; i < answer.size(); i++) {
            output += keyBoards.get(i) + " = " + answer.get(i) + "\n";
        }
        return output;
    }

    private static ArrayList<String> filterWords(Scanner dictionaryScanner, ArrayList<Character> brokenKeys) {
        ArrayList<String> possibleWords = new ArrayList<>();
        while (dictionaryScanner.hasNext()) {
            String s = dictionaryScanner.nextLine();
            boolean canSubmit = true;
            //if s contains any letters c in broken keys don't record
            for (Character c : brokenKeys) {
                if (s.contains(c.toString())) {
                    canSubmit = false;
                    break;
                }
            }
            if (canSubmit) {
                possibleWords.add(s);
            }
        }
        return possibleWords;
    }

    private static ArrayList<String> filterWordsAdditional(Scanner dictionaryScanner, String workingKeys, ArrayList<Character> brokenKeys, int numberOfTimesTheLetterCanAppear){
        ArrayList<String> possibleWords = filterWords(dictionaryScanner, brokenKeys);
        //for each possible word count the occurences of
        char[] workingKeysAsCharArray = workingKeys.toCharArray();
        int count = 0;
        ArrayList<String> possibleWordsWithExraRestriction = (ArrayList<String>) possibleWords.clone();
       /* for(String s: possibleWords){
            System.out.println(s);
            if(s.length() <= brokenKeys.size() * numberOfTimesTheLetterCanAppear ){
                System.out.println("Is this string of appropriate size: " + s);
                possibleWordsWithExraRestriction.add(s);
            }
        }*/

        for(String words: possibleWordsWithExraRestriction){
            char[] wordsAsCharArray = words.toCharArray();
            for(Character key: wordsAsCharArray){
                // [lolliop ---> [l,o,l,l,i,o,p] ----> ]
                count = 0;
                for(char letter: wordsAsCharArray){
                    if(letter == key){
                        count++;
                    }
                }
                if(!(count <= numberOfTimesTheLetterCanAppear)){
                    possibleWordsWithExraRestriction.remove(words);
                }
            }
        }
        return possibleWordsWithExraRestriction;

    }

    private static ArrayList<Character> getBrokenKeys(String keysThatWork) {
        ArrayList<Character> brokenLetters = (ArrayList<Character>) alphabet.clone();
        char[] keyThatWorkCharArray = keysThatWork.toCharArray();
        for (char c : keyThatWorkCharArray) {
            brokenLetters.removeIf(Predicate.isEqual(c));
        }
        return brokenLetters;
    }

    private static String longestWord(ArrayList<String> possibleWords) {
        int longestWord = 0;
        String output = "";
        for (String s : possibleWords) {
            if (s.length() > longestWord) {
                longestWord = s.length();
                output = s;
            }
        }
        return output;
    }

    public static Scanner getDictionary(String fileName) throws FileNotFoundException {
        File dictionary = new File(fileName);
        Scanner scan = new Scanner(dictionary);

        return scan;
    }

    public static ArrayList<String> getWorkingKeys(String fileName) throws FileNotFoundException {
        File dictionary = new File(fileName);
        Scanner scan = new Scanner(dictionary);

        int numberOfKeyboards = scan.nextInt();
        ArrayList<String> brokenKeyBoards = new ArrayList<>();

        for (int i = 0; i < numberOfKeyboards + 1; i++) {
            brokenKeyBoards.add(scan.nextLine());
        }
        return brokenKeyBoards;
    }

}
