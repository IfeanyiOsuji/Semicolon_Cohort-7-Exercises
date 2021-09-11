package africa.semicolon.deitelExercises.tddTest.myers_briggs;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ListOfPersonalityTypeTest {
    @Test
    void setUp(){
        ListOfPersonalityTypes list = new ListOfPersonalityTypes();
        assertNotNull(list);
    }
    @Test
    void testThatIntrovertAndExtrovertPairsHaveResponsesInTheirRightPositions(){
       ListOfPersonalityTypes list = new ListOfPersonalityTypes();
        //Questionaire questionaire = new Questionaire();
//        Response [] responses ={new Response('A'),new Response('B'),
//                new Response('A'),
//                new Response('B'),new Response('B'),new Response('A'),
//                new Response('A'),
//                new Response('B'),
//                new Response('A'),
//                new Response('A'),
//                new Response('B'),
//                new Response('A'),
//                new Response('B'),
//                new Response('A'),
//                new Response('A'),
//                new Response('A'),
//                new Response('B'),
//                new Response('A'),
//                new Response('B'),
//                new Response('A')};
        //questionaire.setResponse(responses);
        Response [][] introvertExtrovert = list.getIntrovertExtrovertResponse(0);
        System.out.println(Arrays.deepToString(introvertExtrovert));
    }
    @Test
    void testThatSensingAndIntuitionPairsHaveResponsesInTheirRightPosition(){
        ListOfPersonalityTypes list = new ListOfPersonalityTypes();
        Response [][] sensingIntuition = list.getSensingIntuitionResponse(1);
        System.out.println(Arrays.deepToString(sensingIntuition));
        System.out.println("Introvert num = "+list.getIntrovertNumber());
        System.out.println("Extrovert num = "+list.getExtrovertNumber());
    }
    @Test
    void testThatThinkingAndFeelingHaveResponsesInTheirRightPosition(){
        ListOfPersonalityTypes list = new ListOfPersonalityTypes();
        Response [][] thinkingFeeling = list.getThinkingFeelingResponse(2);
        System.out.println(Arrays.deepToString(thinkingFeeling));
    }
    @Test
    void testThatJudgingAndPercievingHaveResponsesInTheirRightPosition(){
        Questionaire questionaire = new Questionaire();
        Response [] responses ={new Response('A'),new Response('B'),
                new Response('A'),
                new Response('A'),new Response('B'),new Response('A'),
                new Response('A'),
                new Response('A'),
                new Response('A'),
                new Response('A'),
                new Response('B'),
                new Response('B'),
                new Response('B'),
                new Response('A'),
                new Response('A'),
                new Response('A'),
                new Response('B'),
                new Response('A'),
                new Response('B'),
                new Response('A')};
        questionaire.setResponse(responses);
        ListOfPersonalityTypes list = new ListOfPersonalityTypes();
        list.setResponses(responses);
        Response [][] judgingAndPercieving = list.getJudgingAndPercievingResponse(3);
        System.out.println(Arrays.deepToString(judgingAndPercieving));
    }
}
