package africa.semicolon.deitelExercises.tddTest.chapter_14;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestAnalysisTest {
    @Test
    void setUp(){
        TestAnalysis analysis = new TestAnalysis();
        assertNotNull(analysis);
    }

    @Test
    void testThatNumberOfUniqueAlphabetsInAStringCanBeReturned(){
        String a = "Here I come";
        assertEquals("{r=1, c=1, e=3, H=1, I=1, m=1, o=1}", TestAnalysis.getFrequencyOfEachLetter(a).toString());
    }
    @Test
    void testToCountNumberOfLetterOfWordsInString(){
        String a = "Whether 'tis nobler in the mind to suffer";
        //HashMap<Integer, Integer>map = new HashMap<>();
        assertEquals("{1=0, 2=2, 3=1, 4=2, 5=0, 6=2, 7=1, 8=0}", TestAnalysis.countNumberOfLetterWordsInString(a));

    }
    @Test
    void testToPrintNumberOfOccurrenciesOfWordsInAString(){
       String a = "To be, or not to be: that is the question: Whether 'tis nobler in the mind to suffer";
      assertEquals("{To=3, be=2, or=1, not=1, that=1, is=1, the=2, question=1, whether=1, tis=1, nobler=1, in=1, mind=1, suffer=1}",
              TestAnalysis.countNumberOfUniqueWordsInAString(a));
    }

}
