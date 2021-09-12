package africa.semicolon.deitelExercises.tddTest.chapter_7.polling;

public class PollingApplication {
    public static void main(String[] args) {
        PollingCenter center= PollingCenter.getInstance();
        center.conductPoll();
        ResponseCollator.displayPollingResult();
        ResponseCollator.displayMaximumPoll();
        ResponseCollator.displayMinimumPoll();
    }
}
