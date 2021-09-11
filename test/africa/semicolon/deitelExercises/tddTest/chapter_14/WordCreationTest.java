package africa.semicolon.deitelExercises.tddTest.chapter_14;

public class WordCreationTest {
    public static void createLetterWords(String word) {
        for (int i = 0; i < word.length(); i++) {             // pos. of 1st letter
            for (int j = 0; j < word.length(); j++) {         // pos. of 2nd letter
                for (int k = 0; k < word.length(); k++) {     // pos. of 3rd letter
                    if (i == j || i == k || j == k) continue;  // any letter taken twice? -> skip
                    System.out.printf("%c%c%c\n", word.charAt(i), word.charAt(j), word.charAt(k));
                }

            }
        }
    }

    public static void main(String[] args) {
        createLetterWords("bathe");
    }
}
