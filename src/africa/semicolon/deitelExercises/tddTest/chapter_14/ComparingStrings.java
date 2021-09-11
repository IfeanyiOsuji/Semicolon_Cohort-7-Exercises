package africa.semicolon.deitelExercises.tddTest.chapter_14;

import java.security.SecureRandom;
import java.util.Arrays;

public class ComparingStrings {
    public static String printLatinWord(String [] words) {
        String [] latinWords = new String[words.length];
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<words.length; i++){

            String latinWord = words[i].substring(1)+words[i].substring(0,1)+"ay";
            builder.append(latinWord).append(" ");
            latinWords[i] = builder.toString();
            System.out.println(builder);
        }
        return  builder.toString();
    }

    public static void main(String[] args) {
        //String [] article = {"the", "a", "one", "some", "any"};
        //String [] noun = {"boy","girl", "dog", "town", "car"};
        // String [] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        //String [] preposition ={"to", "from", "over", "under", "on"};
        //printLatinWord(new String[]{"How","are", "you"});
        //tokenizePhoneNumber("(555) 555-5555");
//        generateRandomSentences(new String[]{"the", "a", "one", "some", "any"},
//                new String[]{"boy","girl", "dog", "town", "car"},
//                new String[]{"drove", "jumped", "ran", "walked", "skipped"},
//                new String[]{"to", "from", "over", "under", "on"});
        char a = 'a';
        System.out.println(Character.forDigit(16, 17));
    }

    public static String tokenizePhoneNumber( String phoneAndAreaCode) {
        String [] parts = phoneAndAreaCode.split("[\\s\\-]");

        System.out.println(Arrays.toString(parts));
        System.out.print(parts[0].substring(1, 4));
        String phoneNumber = " "+parts[1] + parts[2];
        System.out.println(phoneNumber);


        return  phoneNumber;
    }

    public static String printReversedWords(String sentence) {
        StringBuilder builder = new StringBuilder();
        String [] sentenceParts = sentence.split(" ");
        for(int i=sentenceParts.length-1; i>=0; i--){
            builder.append(sentenceParts[i]).append(" ");
        }
        return builder.toString();

    }

    public static String printWordCases(String sentence) {
        return sentence.toUpperCase()+"\n"+sentence.toLowerCase();
    }

    public static void generateRandomSentences(String[] article, String[] noun, String[] verb, String[] preposition) {
        StringBuilder builder = new StringBuilder();
        SecureRandom random = new SecureRandom();
        for(int i=0; i<20; i++) {
            String firstWord = article[random.nextInt(5)];
            String firstLetterOfFirstWord = firstWord.substring(0, 1).toUpperCase();
            String remainingLettersOfFirstWord = firstWord.substring(1);
            String combinedLetters = firstLetterOfFirstWord + remainingLettersOfFirstWord;
            builder.append(combinedLetters).append(" ")
                    .append(noun[random.nextInt(5)]).append(" ")
                    .append(verb[random.nextInt(5)]).append(" ")
                    .append(preposition[random.nextInt(5)]).append(" ")
                    .append(article[random.nextInt(5)]).append(" ")
                    .append(noun[random.nextInt(5)]).append(".\n");
        }
        System.out.println(builder);
        System.out.println();
    }
}

