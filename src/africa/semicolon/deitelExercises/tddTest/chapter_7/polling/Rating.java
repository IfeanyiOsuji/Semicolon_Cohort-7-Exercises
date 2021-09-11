package africa.semicolon.deitelExercises.tddTest.chapter_7.polling;

public class Rating {
     private int [] points = new int[10];
     private int [][] responses = new int[5][10];
    public void recordPoint(int point) {

        points[point-1]+=point;
    }

    public int[] getPoints() {
        return points;
    }

    public int[][] getResponses(){
        return responses;
    }
    public void insertResponseForTheTopicOn(PollingTopic topic, int position){
        responses[position] = points;
    }













}
