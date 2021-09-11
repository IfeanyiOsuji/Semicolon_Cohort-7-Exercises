package africa.semicolon.deitelExercises.tddTest.myers_briggs;

public class ListOfPersonalityTypes {
    private int introvertNumber;
    Questionaire questionaire = new Questionaire();
    private Response [][] introvertExtrovert = new Response[5][2];
    private Response [][] sensingIntuition = new Response[5][2];
    private Response[][] thinkinFeeling = new Response[5][2];
    private Response[][] judgingPercieving = new Response[5][2];

    private  Response [] responses;// ={new Response('A'),new Response('B'),
    private int extrovertNumber;
//            new Response('A'),
//            new Response('B'),new Response('B'),new Response('A'),
//            new Response('A'),
//            new Response('B'),
//            new Response('A'),
//            new Response('A'),
//            new Response('B'),
//            new Response('A'),
//            new Response('B'),
//            new Response('A'),
//            new Response('A'),
//            new Response('A'),
//            new Response('B'),
//            new Response('A'),
//            new Response('B'),
//            new Response('A')};



    public ListOfPersonalityTypes(){
        questionaire.setResponse(responses);
    }
    public void setResponses(Response [] responses){
        this.responses = responses;
    }

    public Response[] getResponses() {
        //this.responses =  questionaire.getRespnses();
        return responses;
    }

    public Response[][]getIntrovertExtrovertResponse(int start){
        return getResponses(introvertExtrovert, start);
    }
    public Response[][] getSensingIntuitionResponse(int start) {
        return getResponses(sensingIntuition,start);
    }

    public Response[][] getThinkingFeelingResponse(int start) {
        return getResponses(thinkinFeeling, start);
    }

    private Response[][] getResponses(Response[][] personalityPairs, int start) {
        for(int i=0, j=0; i< responses.length; i+=4, j++){
            if(responses[i+start].getType() == new Response('A').getType())
                personalityPairs[j][0] = responses[i+start];
            else
                personalityPairs[j][1] = responses[i+start];
        }
        return personalityPairs;
    }

    public Response[][] getJudgingAndPercievingResponse(int start) {
        return getResponses(judgingPercieving,start);
    }

    public int getIntrovertNumber() {
        return introvertNumber;
    }

    public int getExtrovertNumber() {
        return extrovertNumber;
    }
}
