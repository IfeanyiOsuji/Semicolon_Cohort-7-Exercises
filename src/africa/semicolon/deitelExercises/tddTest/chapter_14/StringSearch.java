package africa.semicolon.deitelExercises.tddTest.chapter_14;

import java.sql.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSearch {

    public static int determineNumberOfOccurenciesOfCharacters(String sentence, char character) {
            int count = 0;
//       Pattern pattern = Pattern.compile(Character.toString(character).toLowerCase());
//       Matcher matcher = pattern.matcher(sentence.toLowerCase());
//       while (matcher.find())
//           count++;
//        return count;
            int index = 0;

            while(true){
                index = sentence.toLowerCase().indexOf(Character.toLowerCase(character), index);
                if(index != -1) {
                    count++;
                }
                if(index == -1)
                    break;
                index++;
            }
        return count;
    }

    public static void main(String[] args) {
        //System.out.println(determineNumberOfOccurenciesOfCharacters("God is good", 'o'));
        System.out.println(determineNumberOfEachAlphabet("God is good"));
        System.out.println(frequencyOfAlphabetInAString("God is good"));
    }
    private static ArrayList <Character> letters;
    public static Integer [] determineNumberOfEachAlphabet(String sentence) {
        Map<Character , Integer> map = new LinkedHashMap<>();
        ArrayList<Character>list = new ArrayList<>();
            int index =0;

            for(int i=0; i<sentence.length(); i++){
                int count = 0;
                char letter = Character.toLowerCase(sentence.charAt(i));
                if(Character.isLetter(letter) && !list.contains(letter)) {
                    while (true) {
                        index = sentence.substring(i).toLowerCase().indexOf(letter, index);
                        if (index != -1) {
                            count++;
                            if (map.containsKey(letter)) {
                                map.replace(letter, map.get(letter) + 1);
                                //list.add(Character.toLowerCase(letter));
                            } else {
                                map.put(letter, count);
                                list.add(letter);
                            }
                        }
                        if (index == -1)
                            break;
                        index++;
                    }

                }

            }
        letters = list;
        Integer [] frequency = map.values().toArray(new Integer[map.size()]);
        return frequency;
    }
    public static String frequencyOfAlphabetInAString(String sentence){
        StringBuilder builder = new StringBuilder();
        Integer [] frequency = determineNumberOfEachAlphabet(sentence);
        String heading = """
                Alphabet        Frequency
                """;
        System.out.println(heading);
        for(int i=0; i<frequency.length; i++){
            builder.append("""
                %c              %d
                """.formatted(letters.get(i), frequency[i]));
        }
        return builder.toString();
    }
}
