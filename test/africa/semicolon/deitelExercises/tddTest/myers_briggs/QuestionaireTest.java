package africa.semicolon.deitelExercises.tddTest.myers_briggs;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;


public class QuestionaireTest {
    void setUp(){
        Questionaire questionaire = new Questionaire();
    }
    @Test
    void testThatQuestion1CanBePickedFromQuestionaire(){
        Questionaire questionaire = new Questionaire();
        Question question = questionaire.questions[0];
        assertSame(question, questionaire.getQuestion(0));
    }
    @Test
    void testThatQuestion2CanBePickedFromQuestionaire(){
        Questionaire questionaire = new Questionaire();
        Question question = questionaire.questions[1];
        assertSame(question, questionaire.getQuestion(1));
    }
    @Test
    void testThatQuestion10CanBePickedFromQuestionaire(){
        Questionaire questionaire = new Questionaire();
        Question question = questionaire.questions[9];
        assertSame(question, questionaire.getQuestion(9));
    }
    @Test
    void testThatQuestion20CanBePickedFromQuestionaire(){
        Questionaire questionaire = new Questionaire();
        Question question = questionaire.questions[19];
        assertSame(question, questionaire.getQuestion(19));
    }
    @Test
    void testThatQuestionaireHasListOfResponses(){
        Questionaire questionaire = new Questionaire();
        Response response = new Response('A');
        questionaire.addResponse(response, 0);
        questionaire.addResponse(response, 10);
        questionaire.addResponse(response, 19);
        System.out.println(Arrays.toString(questionaire.getRespnses()));
    }

}
