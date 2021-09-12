package africa.semicolon.deitelExercises.tddTest.chapter_7.polling;

import java.util.Scanner;

public class PollingTopic {

    private final String issue;
    private Rating rating;

    public PollingTopic(String socialIssue) {
        this.issue = socialIssue;
        rating = new Rating();
    }

    public void rateIssue(int point) {
        if(point >=1 && point<=10)
        rating.recordPoint(point);
        else {
        }
    }
    public void rateIssue() {
        Scanner input =new Scanner(System.in);
        String getInput = input.nextLine();
        if(getInput.matches("(1[0]|[1-9])")) {
            rating.recordPoint(Integer.parseInt(getInput));
        }
        else {
            System.out.println("Please rate between 1 and 10");
            rateIssue();
        }
        //input.nextLine();
    }
    public String getIssue(){
        return issue;
    }

    public int getTotalPointAtPosition(int position) {
        return rating.getPoints()[position-1];
    }
    public Rating getRating(){
        return rating;
    }

    @Override
    public String toString() {
        return issue;
    }
}
