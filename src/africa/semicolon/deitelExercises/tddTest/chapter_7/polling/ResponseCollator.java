package africa.semicolon.deitelExercises.tddTest.chapter_7.polling;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ResponseCollator {
    private static PollingCenter pollingCenter = PollingCenter.getInstance();
    public static long getSumOfRatingsFor(PollingTopic topic) {
//        for(int i=0; i< pollingCenter.getTopics().length; i++){
//            if(pollingCenter.getTopics()[i].getIssue().equals(topic.getIssue())){
//                return  Arrays.stream(pollingCenter.getTopics()[i].getRating().getPoints()).sum();
//            }
//        }
//        throw new NullPointerException("Topic not in the list");
        return Arrays.stream(pollingCenter.getTopics()).filter(x->x.getIssue().equals(topic.getIssue()))
                .mapToLong(a-> Arrays.stream(a.getRating().getPoints()).sum()).sum();
    }

    public static Double getAverageRatingsFor(PollingTopic topic) {
        return getSumOfRatingsFor(topic)*1.0/pollingCenter.getRespondentNumber();
    }

    public static int findMaximumPoll(PollingTopic[] topics) {
       return Arrays.stream(topics)
        .map(x-> Arrays.stream(x.getRating().getPoints()).sum())
        .max(Comparator.naturalOrder()).get();
    }
    public static int findMinimumPoll(PollingTopic[] topics) {
        return Arrays.stream(topics)
                .map(x -> Arrays.stream(x.getRating().getPoints()).sum())
                .min(Comparator.naturalOrder()).get();
    }
    public static void displayPollingResult(){
        System.out.printf("|%-45s|%-2s|%-2s|%-2s|%-2s|%-2s|%-2s|%-2s|%-2s|%-2s|%-2s|%-5s|%-5s|%n",
                "Topics","1","2","3","4","5","6","7","8","9","10","Total","Average");

       Arrays.stream(pollingCenter.getTopics()).forEach(x->{
         System.out.printf("|%-45s|%-2d|%-2d|%-2d|%-2d|%-2d|%-2d|%-2d|%-2d|%-2d|%-2d|%5d|%7.2f|%n",
           x.toString(),x.getTotalPointAtPosition(1),
                 x.getTotalPointAtPosition(2)/2,
                 x.getTotalPointAtPosition(3)/3,
                 x.getTotalPointAtPosition(4)/4,
                 x.getTotalPointAtPosition(5)/5,
                 x.getTotalPointAtPosition(6)/6,
                 x.getTotalPointAtPosition(7)/7,
                 x.getTotalPointAtPosition(8)/8,
                 x.getTotalPointAtPosition(9)/9,
                 x.getTotalPointAtPosition(10)/10,
                 getSumOfRatingsFor(x),
                 getAverageRatingsFor(x)
                 );
       });
    }
    public static void displayMaximumPoll(){
        System.out.println("Issue with maximum poll");
        //System.out.printf("%-45s%d%n"

        System.out.printf("%-35s%d%n",Arrays.stream(pollingCenter.getTopics()).reduce((a1, a2)-> Arrays.stream(a1.getRating()
                .getPoints()).sum()> Arrays.stream(a2.getRating().getPoints()).sum()? a1:a2).get(),
                findMaximumPoll(pollingCenter.getTopics()));
    }
    public static void displayMinimumPoll(){
        System.out.println("Issue with maximum poll");
        //System.out.printf("%-45s%d"

        System.out.printf("%-35s%d",Arrays.stream(pollingCenter.getTopics()).reduce((a1, a2)-> Arrays.stream(a1.getRating()
                        .getPoints()).sum()< Arrays.stream(a2.getRating().getPoints()).sum()? a1:a2).get(),
                findMinimumPoll(pollingCenter.getTopics()));
    }
    }


