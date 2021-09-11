package africa.semicolon.deitelExercises.tddTest.myers_briggs;

public class Question {
    private String questiionA;
    private String questionB;

    public Question(String questiionA, String questionB) {
        this.questiionA = questiionA;
        this.questionB = questionB;
    }

    public Question() {

    }

    public String getQuestiionA() {
        return questiionA;
    }

    public void setQuestiionA(String questiionA) {
        this.questiionA = questiionA;
    }

    public String getQuestionB() {
        return questionB;
    }

    public void setQuestionB(String questionB) {
        this.questionB = questionB;
    }
}
