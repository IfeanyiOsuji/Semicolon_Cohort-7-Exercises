package africa.semicolon.deitelExercises.tddTest.chapter_7.polling;

public class PollingTopic {

    private final String issue;
    private Rating rating;

    public PollingTopic(String socialIssue) {
        this.issue = socialIssue;
        rating = new Rating();
    }

    public void rateIssue(int point) {
        rating.recordPoint(point);
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
        return
                "Topic :" + issue;
    }
}
