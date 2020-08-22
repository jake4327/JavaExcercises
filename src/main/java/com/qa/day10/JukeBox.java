package com.qa.day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class JukeBox {

    private static ArrayList<String> songs = new ArrayList<>();
    private static  ArrayList<String> artist = new ArrayList<>();
    private static HashMap<String, String> songAndArtist = new HashMap<>();

    public static void main(String[] args) throws FileNotFoundException {
        putSongsIntoArrayList();
        insertIntoHashMap();
        System.out.println(alphabeticalOder(songs));
    }

    public static void putSongsIntoArrayList() throws FileNotFoundException {
        File songlist = new File("src/main/java/com/qa/day10/SongList.txt");
        ArrayList<String> songAndArtist = new ArrayList<>();
        Scanner scanSongList = new Scanner(songlist);
        while(scanSongList.hasNextLine()) {
            songAndArtist.add(scanSongList.nextLine());
        }
        for(String s: songAndArtist){
            int slashIndex = 0;
            char[] sAsChar = s.toCharArray();
            //System.out.print(s.length());
            for(int i = 0; i < s.length(); i++){
                if (sAsChar[i] == '/') {
                    //System.out.print(s.substring(0,i));
                    slashIndex = i;
                    break;
                }
            }
            songs.add(s.substring(0, slashIndex));
            artist.add(s.substring(slashIndex +1));
        }
        System.out.println(songs);
        System.out.println(artist);

    }

    private static void insertIntoHashMap(){
        for(int i = 0; i < songs.size(); i++){
            songAndArtist.put(songs.get(i), artist.get(i));
        }
        System.out.println(songAndArtist);
    }

    private static ArrayList<String> alphabeticalOder(ArrayList<String> input){
        Collections.sort(input);
        return input;
    }

}
