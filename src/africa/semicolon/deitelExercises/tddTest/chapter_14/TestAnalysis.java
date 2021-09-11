package africa.semicolon.deitelExercises.tddTest.chapter_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class TestAnalysis {
    public static HashMap<Character, Integer> getFrequencyOfEachLetter(String a) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i =0; i<a.length(); i++){
            char letter = a.charAt(i);
            if(Character.isLetter(letter)){
                char lowerCaseCharacter = Character.toLowerCase(letter);
                if(map.containsKey(lowerCaseCharacter)){
                    map.replace(lowerCaseCharacter,map.get(lowerCaseCharacter)+1 );
                }
                else {
                    map.put(lowerCaseCharacter, 1);
                }
            }
        }
        return map;
    }
    public static HashMap<Integer, Integer> countNumberOfLetterWordsInString(String a) {
        String [] wordList = a.split(" ");
        HashMap<Integer, Integer>map = new HashMap<>();
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0, j=0; i<wordList.length; i++, j++){
            list.add(wordList[i].length());
            map.put(i+1, Collections.frequency(list, i+1));
        }
        for(int i=0, j=0; i<list.size(); i++, j++){
            map.put(i+1, Collections.frequency(list, i+1));
        }
        //System.out.println(map.toString());

        return map;
    }

    public static String countNumberOfUniqueWordsInAString(String a) {
        String [] words = a.replaceAll("[^\\sa-zA-z]+","").split(" ");
        HashMap<String, Integer>map = new HashMap<>();
        for(String word : words){
            String formatWord = word.toLowerCase();
            if(formatWord != null){
               if(map.containsKey(formatWord)){
                   map.replace(formatWord, map.get(formatWord)+1);
               }
               else
                   map.put(formatWord, 1);
            }
        }
       return map.toString();
    }

}
