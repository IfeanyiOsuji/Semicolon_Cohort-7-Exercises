package africa.semicolon.deitelExercises.tddTest.chapter_7.polling;

import java.util.Arrays;
import java.util.Scanner;

public class PollingCenter {
    public int respondentNumber;
    Respondent respondent;
    private static PollingCenter pollingCenter = new PollingCenter();
    private PollingCenter(){}

    public static PollingCenter getInstance(){
        return pollingCenter;
    }

    private PollingTopic [] topics = { new PollingTopic("Climate Change"),new PollingTopic("OverPopulation"),
    new PollingTopic("Poor LeaderShip"),new PollingTopic("Gender IneQuality"),
    new PollingTopic("HealthCare Availability")};
    public Respondent getRespondent() {
        respondent = new Respondent();
        respondentNumber+=1;
        return respondent;
    }
    public int getRespondentNumber(){
        return respondentNumber;
        //return 0;
    }
    public PollingTopic[] getTopics(){
    return topics;}

    public void conductPoll(){
        int count =0;
        Scanner input = new Scanner(System.in);
        int available = 1;
        while(available == 1) {
            int repondentNumber = getRespondent().getRespondentNumber();
            Arrays.stream(topics).forEach(x -> {
                System.out.println("Respondent " + repondentNumber);
                System.out.println("What is your rating for " + x.getIssue());
                //int rating = input.nextInt();
                x.rateIssue();
            });
            System.out.println("Any other respondent ? enter 1 for yes and 0 for no");
             available = input.nextInt();
            if (available == 0){break;}
            while(available != 1){
                count++;
                System.out.println("Any other respondent ? enter 1 for yes and 0 for no");
                 available = input.nextInt();
                 if (count==3){
                     available =0;
                     break;
                 }
            }
        }
    }
}


