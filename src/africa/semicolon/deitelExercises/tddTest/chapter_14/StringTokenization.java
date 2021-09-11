package africa.semicolon.deitelExercises.tddTest.chapter_14;

public class StringTokenization {
    public static void tokenizeLetters(String sentence, String regex){
        String [] words = sentence.split(" ");
        for(String word : words){
            if(word.matches(regex))
                System.out.println(word);
        }

    }

    public static void main(String[] args) {
        tokenizeLetters("Comb your hair and stop the proverb","([A-z]+[bB])" );
        tokenizeLetters("indebtED Collected insultED from him","([A-z]+(ED))" );
    }
}
