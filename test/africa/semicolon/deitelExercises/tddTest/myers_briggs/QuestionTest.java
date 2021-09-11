package africa.semicolon.deitelExercises.tddTest.myers_briggs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {
    @Test
    void setUp(){

        Question question = new Question("expend energy, enjoy groups","conserve energy, enjoy one-on-one");

        assertNotNull(question);
    }
    @Test
    void showThatQuestionACanBeSelected(){
        Question question = new Question("expend energy, enjoy groups","conserve energy, enjoy one-on-one");
       assertEquals("expend energy, enjoy groups", question.getQuestiionA());
    }
    @Test
    void testThatQuestionACanBeSet(){
        Question question = new Question();
        question.setQuestiionA("expend energy, enjoy groups");
        assertEquals("expend energy, enjoy groups", question.getQuestiionA());
    }
    @Test
    void testThatQuestionBCanBeSelected(){
        Question question = new Question("expend energy, enjoy groups","conserve energy, enjoy one-on-one");
        assertEquals("conserve energy, enjoy one-on-one", question.getQuestionB());
    }
    @Test
    void testThatQuestionBCanBeSet(){
        Question question = new Question();
        question.setQuestionB("conserve energy, enjoy one-on-one");
        assertEquals("conserve energy, enjoy one-on-one", question.getQuestionB());
    }

}