package africa.semicolon.deitelExercises.tddTest.chapter_7.polling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RatingTest {
   // PollingCenter center;
    @Test
    @BeforeEach
    void setUp(){
      //  center = new PollingCenter();
       // assertNotNull(center);
    }
    @Test
    void testThatRatingCanRecordPointsBasedOnResponse(){
        Rating rating = new Rating();
       rating.recordPoint(2);
       int getPoint = rating.getPoints()[1];
       assertEquals(2, getPoint);

    }

    @Test
    void testThatATopicHasItsOwnRating(){
        PollingTopic topic = new PollingTopic("Gender Inequality");
        topic.rateIssue(2);
        topic.rateIssue(10);
        topic.rateIssue(5);
        topic.rateIssue(5);
        topic.rateIssue(1);

        assertEquals(2, topic.getTotalPointAtPosition(2));
        assertEquals(10, topic.getTotalPointAtPosition(10));
        assertEquals(10, topic.getTotalPointAtPosition(5));
        assertEquals(1, topic.getTotalPointAtPosition(1));
    }
    @Test
    void testThatRespondentAtPollingCenterCanRateTopic(){
        PollingCenter center = PollingCenter.getInstance();
        center.getRespondent().rateIssue(center.getTopics()[3], 2);
        center.getRespondent().rateIssue(center.getTopics()[3], 2);
        center.getRespondent().rateIssue(center.getTopics()[4], 10);
        center.getRespondent().rateIssue(center.getTopics()[0], 5);
        assertEquals(4, center.getTopics()[3].getTotalPointAtPosition(2));
        assertEquals(10, center.getTopics()[4].getTotalPointAtPosition(10));
        assertEquals(5, center.getTopics()[0].getTotalPointAtPosition(5));
        for (int j=0; j<5; j++){
            for(int i =0; i<center.getTopics()[j].getRating().getPoints().length;  i++){
                center.getTopics()[j].getRating().getPoints()[i] = 0;
            }
        }

    }
    @Test
    void testThatTheSumOfResponsesForEachTopicCanBeCalculated(){
        PollingCenter center = PollingCenter.getInstance();
        center.getRespondent().rateIssue(center.getTopics()[3], 2);
        center.getRespondent().rateIssue(center.getTopics()[3], 2);
        center.getRespondent().rateIssue(center.getTopics()[4], 10);
        center.getRespondent().rateIssue(center.getTopics()[0], 5);

        center.getRespondent().rateIssue(center.getTopics()[3], 10);
        center.getRespondent().rateIssue(center.getTopics()[3], 7);
        center.getRespondent().rateIssue(center.getTopics()[4], 9);
        center.getRespondent().rateIssue(center.getTopics()[0], 8);
        assertEquals(21, ResponseCollator.getSumOfRatingsFor(center.getTopics()[3]));
        assertEquals(19, ResponseCollator.getSumOfRatingsFor(center.getTopics()[4]));
        for (int j=0; j<5; j++){
            for(int i =0; i<center.getTopics()[j].getRating().getPoints().length;  i++){
                center.getTopics()[j].getRating().getPoints()[i] = 0;
            }
        }
        center.respondentNumber = 0;
    }
    @Test
    void testThatAverageResponsesForEachTopicCanBeCalculated(){
        PollingCenter center = PollingCenter.getInstance();

        assertEquals(2.625, ResponseCollator.getAverageRatingsFor(center.getTopics()[3]));
        assertEquals(2.375, ResponseCollator.getAverageRatingsFor(center.getTopics()[4]));

    }
    @Test
    void determineTheMaximumRatingForThePoll(){
        PollingCenter center = PollingCenter.getInstance();
        center.getRespondent().rateIssue(center.getTopics()[3], 2);
        center.getRespondent().rateIssue(center.getTopics()[3], 2);
        center.getRespondent().rateIssue(center.getTopics()[4], 10);
        center.getRespondent().rateIssue(center.getTopics()[0], 5);

        center.getRespondent().rateIssue(center.getTopics()[3], 10);
        center.getRespondent().rateIssue(center.getTopics()[3], 7);
        center.getRespondent().rateIssue(center.getTopics()[4], 9);
        center.getRespondent().rateIssue(center.getTopics()[0], 8);
        assertEquals(21,ResponseCollator.findMaximumPoll(center.getTopics()));

    }
    @Test
    void determineTheMinimumRatingForThePoll(){
        PollingCenter center = PollingCenter.getInstance();
        center.getRespondent().rateIssue(center.getTopics()[3], 2);
        center.getRespondent().rateIssue(center.getTopics()[3], 2);
        center.getRespondent().rateIssue(center.getTopics()[4], 10);
        center.getRespondent().rateIssue(center.getTopics()[0], 5);
        center.getRespondent().rateIssue(center.getTopics()[1], 7);
        center.getRespondent().rateIssue(center.getTopics()[2], 5);

        center.getRespondent().rateIssue(center.getTopics()[3], 10);
        center.getRespondent().rateIssue(center.getTopics()[3], 7);
        center.getRespondent().rateIssue(center.getTopics()[4], 9);
        center.getRespondent().rateIssue(center.getTopics()[0], 8);
        assertEquals(5,ResponseCollator.findMinimumPoll(center.getTopics()));
        ResponseCollator.displayPollingResult();
        ResponseCollator.displayMaximumPoll();
        ResponseCollator.displayMinimumPoll();

    }


}
