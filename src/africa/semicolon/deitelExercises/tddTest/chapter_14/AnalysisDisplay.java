package africa.semicolon.deitelExercises.tddTest.chapter_14;

import java.util.HashMap;
import java.util.Map;

import static africa.semicolon.deitelExercises.tddTest.chapter_14.TestAnalysis.*;

public class AnalysisDisplay {
    public static void main(String[] args) {
        String sentence = "To be, or not to be: that is the question:";
        String header = """
                Character       Frequency
                """;
        String format = """
                  %c--------------->%d
                  """;
        HashMap<Character, Integer>storage = getFrequencyOfEachLetter(sentence);
        System.out.println(displayFrequencyOfEachLetter(storage,header,format));

        String sentence2 = "Whether 'tis nobler in the mind to suffer";
        String header2 = """
                Word        Frequency
                """;
        String format2 = """
                  %d--------------->%d
                  """;
        HashMap<Integer, Integer>storage2 = countNumberOfLetterWordsInString(sentence2);


        System.out.println(displayNumberOfLetterWordsInAString(storage2, header2, format2));
    }

    private static String displayNumberOfLetterWordsInAString(HashMap storage,String header, String name) {
        return displayFrequencyOfEachLetter(storage, header, name);
    }

    private static String displayFrequencyOfEachLetter(HashMap storage,String header, String name) {
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer>map = storage;
        System.out.println(header);
        for(Map.Entry<Character, Integer>entry :map.entrySet()){
            result.append(name.formatted(entry.getKey(), entry.getValue()));
        }
        return result.toString();
    }

}

