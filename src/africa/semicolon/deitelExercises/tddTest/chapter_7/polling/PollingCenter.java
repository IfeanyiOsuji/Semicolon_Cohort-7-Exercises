package africa.semicolon.deitelExercises.tddTest.chapter_7.polling;

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
    }
    public PollingTopic[] getTopics(){
    return topics;}
}


