package africa.semicolon.deitelExercises.tddTest.myers_briggs;

public class Questionaire {

    Question [] questions = {new Question("expend energy, enjoy groups","conserve energy, enjoy one-on-one"),
    new Question("interpret literally", "look for meaning and possibilities"),
    new Question("logical, thinking, questioning","empathetic, feeling, accommodating."),
    new Question("organized, orderly","flexible, adaptable."),
    new Question("more outgoing, think out loud","more reserved, think to yourself."),
    new Question("practical, realistic, experiential","imaginative, innovative, theoretical."),
    new Question("candid, straight forward, frank","tactful, kind, encouraging."),
    new Question("plan, schedule","unplanned, spontaneous."),
    new Question("seek many tasks, public activities, interaction with others","seek private, solitary activities with quiet to concentrate."),
    new Question("standard, usual, conventional","different, novel, unique."),
    new Question("firm, tend to criticize, hold the line","gentle, tend to appreciate, conciliate."),
    new Question("regulated, structured","easygoing, “live” and “let live”."),
    new Question("external, communicative, express yourself","internal, reticent, keep to yourself."),
    new Question("focus on here-and-now","look to the future, global perspective, “big picture”."),
    new Question("tough-minded, just","tender-hearted, merciful."),
    new Question("preparation, plan ahead","go with the flow, adapt as you go."),
    new Question("active, initiate","reflective, deliberate."),
    new Question("facts, things, “what is”", "reflective, deliberate."),
    new Question("matter of fact, issue-oriented","sensitive, people-oriented, compassionate."),
    new Question("control, govern","latitude, freedom")};
    private Response[] responses = new Response[20];

    public Question getQuestion(int number) {
        return questions[number];
    }

    public void addResponse(Response response, int position) {

        this.responses[position] = response;
    }

    public Response[] getRespnses() {
        return responses;
    }

    public void setResponse(Response[] responses) {
        this.responses = responses;
    }
}
