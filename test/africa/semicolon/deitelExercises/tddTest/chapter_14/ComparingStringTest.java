
package africa.semicolon.deitelExercises.tddTest.chapter_14;

import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.*;

public class ComparingStringTest {
    @Test
    void setUp(){
        ComparingStrings comparingStrings = new ComparingStrings();
        assertNotNull(comparingStrings);
    }
    @Test
    void compareTwoStrings(){
        String s1 = "Hello";
        String s2 = "Come";
        assertEquals(5, s1.compareTo(s2));
    }
    @Test
    void comparePortionsOfStrings(){
        String s1 = "Welcome to semicolon";
        String s2 = "How are you doing";
        assertFalse(s1.regionMatches(true,0,s2, 0, 6));
    }
    @Test
    void generateRandomSentences(){
        // article, noun, verb, preposition, article, noun
        String [] article = {"the", "a", "one", "some", "any"};
        String [] noun = {"boy","girl", "dog", "town", "car"};
        String [] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String [] preposition ={"to", "from", "over", "under", "on"};
        ComparingStrings.generateRandomSentences(article, noun, verb, preposition);
    }
    @Test
    void testThatMethodCanPrintLatinWord(){
        String[] words = {"Come"};
        assertEquals("omeCay", ComparingStrings.printLatinWord(words));

    }
    @Test
    void testThatMethodCanTokenizePhoneNumber(){
        assertEquals("5555555", ComparingStrings.tokenizePhoneNumber("(555) 555-5555"));
    }
    @Test
    void testThatTheWordsInASentenceCanBeReversed(){
        String sentence = "Please don't go far away";
        assertEquals("away far go don't Please", ComparingStrings.printReversedWords(sentence));
    }
    @Test
    void testThatMethodCanDisplaySentenceInUpperAndLowerCase(){
        String sentence = "Please don't go far away";
        assertEquals("PLEASE DON'T GO FAR AWAY\nplease don't go far away", ComparingStrings.printWordCases(sentence));
    }


}
