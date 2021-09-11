package africa.semicolon.deitelExercises.tddTest.chapter_7.polling;

public class Respondent {
    private int respondentNumber;

    public Respondent() {
        this.respondentNumber +=1;
    }

    public void rateIssue(PollingTopic topic, int rating) {
         topic.rateIssue(rating);
    }
    public int getRespondentNumber(){
        return respondentNumber;
    }
}
