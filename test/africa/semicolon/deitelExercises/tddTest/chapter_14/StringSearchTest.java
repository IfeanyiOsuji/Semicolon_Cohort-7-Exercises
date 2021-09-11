package africa.semicolon.deitelExercises.tddTest.chapter_14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class StringSearchTest {
    @Test
    void setUp(){
        StringSearch search = new StringSearch();
    }
    @Test
    void testToDetermineTheNumberOfOccurenciesOfWordCharactersInAString(){
        assertEquals(2, StringSearch.determineNumberOfOccurenciesOfCharacters("God is good", 'g'));
    }
    @Test
     void testToDetermineTotalNumberOfEachAlphabetInAText(){
        assertSame("{g:2, o:3, d:2, i:1, s:1}", StringSearch.determineNumberOfEachAlphabet("God is good"));
    }
}
