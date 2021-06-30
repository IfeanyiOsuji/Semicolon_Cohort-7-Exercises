package africa.semicolon.deitelExercises.tddTest;

import java.util.Arrays;
import java.util.Scanner;

public class MyersBriggsPersonalityTest {

    public static char [][] getExtrovertIntrovert = new char[5][2];
    public static char [][] getSensingIntuition = new char[5][2];
    public static char [][] getThinkingFeeling = new char[5][2];
    public static char [][] getJudgingPerceiving = new char[5][2];
    public static int extrovert =0; public static int introvert=0;

    public static int sensing =0; public static int iNtuitive =0; public static int thinking =0;
    public static int feeling =0;  public static int judging =0; public static int perceiving =0;
    public static void main(String[] args) {
        String [][] questions = {{"expend energy, enjoy groups","conserve energy, enjoy one-on-one"},
                {"interpret literally", "look for meaning and possibilities"},
                {"logical, thinking, questioning","empathetic, feeling, accommodating."},
                {"organized, orderly","flexible, adaptable."},
                {"more outgoing, think out loud","more reserved, think to yourself."},
                {"practical, realistic, experiential","imaginative, innovative, theoretical."},
                {"candid, straight forward, frank","tactful, kind, encouraging."},
                {"plan, schedule","unplanned, spontaneous."},
                {"seek many tasks, public activities, interaction with others","seek private, solitary activities with quiet to concentrate."},
                {"standard, usual, conventional","different, novel, unique."},
                {"firm, tend to criticize, hold the line","gentle, tend to appreciate, conciliate."},
                {"regulated, structured","easygoing, “live” and “let live”."},
                {"external, communicative, express yourself","internal, reticent, keep to yourself."},
                {"focus on here-and-now","look to the future, global perspective, “big picture”."},
                {"tough-minded, just","tender-hearted, merciful."},
                {"preparation, plan ahead","go with the flow, adapt as you go."},
                {"active, initiate","reflective, deliberate."},
                {"facts, things, “what is”", "reflective, deliberate."},
                {"matter of fact, issue-oriented","sensitive, people-oriented, compassionate."},
                {"control, govern","latitude, freedom"}};

        System.out.println("Answer A or B in the questions below");
        Scanner input = new Scanner(System.in);
        for(int i=0; i<questions.length; i++){
            System.out.println("A. "+questions[i][0]);
            System.out.println("B. "+questions[i][1]);
            try {
            char ans = input.next().charAt(0);
            if(ans == 'A'||ans=='a'||ans=='B'||ans=='b'){
                determineIntroVertExtrovert(i, ans);
                determineSensingIntuition(i, ans);
                determineThinkingFeeling(i, ans);
                determineJudgingPerceiving(i, ans);
            }
            }catch (IllegalArgumentException ex){
                System.out.println("You must print either A or B");
            }

        }
        System.out.println(Arrays.deepToString(getExtrovertIntrovert));
        System.out.println("Extro = "+ extrovert +" Inttro = "+introvert);
        System.out.println(Arrays.deepToString(getSensingIntuition));
        System.out.println("Sens = "+ sensing +" Int = "+introvert);
        System.out.println(Arrays.deepToString(getThinkingFeeling));
        System.out.println("Think = "+ thinking +" Feel = "+ feeling);
        System.out.println(Arrays.deepToString(getJudgingPerceiving));
        System.out.println("Judg = "+ judging +" Perceiv = "+ perceiving);
        printTables();

    }

    private static void determineJudgingPerceiving(int index, char answer) {
        int count =index % 5;
        int currentIndex = index+1;
        if(currentIndex == 4 || currentIndex ==8 || currentIndex ==12||currentIndex==16||currentIndex==20) {
            if (answer == 'a' || answer == 'A') {
                getJudgingPerceiving[count][0] = '\u2713';
                getJudgingPerceiving[count][1] = ' ';
                judging++;
            } else if (answer == 'b' || answer == 'B') {
                getJudgingPerceiving[count][1] = '\u2713';
                getJudgingPerceiving[count][0] = ' ';
                perceiving++;
            }
        }

    }

    private static void determineThinkingFeeling(int index, char answer) {
        int count =index % 5;
        int currentIndex = index+1;
        if(currentIndex == 3 || currentIndex ==7 || currentIndex ==11||currentIndex==15||currentIndex==19) {
            if (answer == 'a' || answer == 'A') {
                getThinkingFeeling[count][0] = '\u2713';
                getThinkingFeeling[count][1] = ' ';
                thinking++;
            }
            else if (answer == 'b' || answer == 'B') {
                getThinkingFeeling[count][1] = '\u2713';
                getThinkingFeeling[count][0] = ' ';
                feeling++;
            }
        }
    }

    private static void determineSensingIntuition(int index, char answer) {
        int count =index % 5;
        int currentIndex = index+1;
        if(currentIndex == 2 || currentIndex ==6 || currentIndex ==10||currentIndex==14||currentIndex==18) {
            if (answer == 'a' || answer == 'A') {
                getSensingIntuition[count][0] = '\u2713';
                getSensingIntuition[count][1] = ' ';
                sensing++;
            }
            else if (answer == 'b' || answer == 'B') {
                getSensingIntuition[count][1] = '\u2713';
                getSensingIntuition[count][0] = ' ';
                iNtuitive++;
            }
        }
    }

    private static void determineIntroVertExtrovert(int index, char answer) {
        int count =index % 5;
        int currentIndex = index+1;
        if(currentIndex == 1 || currentIndex ==5 || currentIndex ==9||currentIndex==13||currentIndex==17) {
            if (answer == 'a' || answer == 'A') {
                getExtrovertIntrovert[count][0] = '\u2713';
                getExtrovertIntrovert[count][1] = ' ';
                extrovert++;
            }
            else if (answer == 'b' || answer == 'B') {
                getExtrovertIntrovert[count][1] = '\u2713';
                getExtrovertIntrovert[count][0] = ' ';
                introvert++;
            }
        }
    }
    public static void printTables(){
        System.out.printf("|%s|\n","-".repeat(71));
        System.out.printf("|%5s|%5s|%5s|%5s|%5s|%5s|%5s|%5s|%5s|%5s|%5s|%5s|\n"," ","A","B",
                " ","A","B"," ","A","B"," ","A","B");
        System.out.printf("|%s|\n","-".repeat(71));
        int d = 1;
        for(int i=1; i<=5; i++){

            System.out.printf("|%5d|%5c|%5c|%5s|%5c|%5c|%5s|%5c|%5c|%5s|%5c|%5s|\n",d,getExtrovertIntrovert[i-1][0],
                   getExtrovertIntrovert[i-1][1]," ", getSensingIntuition[i-1][0],getSensingIntuition[i-1][1],
                    " ",getThinkingFeeling[i-1][0], getThinkingFeeling[i-1][1]," ",getJudgingPerceiving[i-1][0],getJudgingPerceiving[i-1][1]);
            System.out.printf("|%s|\n", "-".repeat(71));
            d+=4;
        }
        System.out.printf("|%5s|%5c|%5c|%5s|%5c|%5c|%5s|%5c|%5c|%5s|%5c|%5c|\n"," ",'E','I'," ",'S','N',
                " ",'T','F'," ",'J','P');
        System.out.printf("|TOTAL|%5d|%5d|%5s|%5d|%5d|%5s|%5d|%5d|%5s|%5d|%5d|\n", extrovert,introvert," ", sensing, iNtuitive,
                " ", thinking, feeling," ", judging, perceiving);
        System.out.printf("|%s|\n", "-".repeat(71));
        System.out.println("Result  =  "+displayPersonalityType());
        System.out.println("See the link below for your personality type");
        System.out.println(getLinkToPersonalityType(displayPersonalityType()));
    }
    public static String displayPersonalityType(){
        String personalityCode = "";
        if(extrovert > introvert)
            personalityCode+='E';
        else
            personalityCode+='I';
        if(sensing > iNtuitive)
            personalityCode+='S';
        else
            personalityCode+='N';
        if(thinking > feeling)
            personalityCode+='T';
        else
            personalityCode+='F';
        if(judging > perceiving)
            personalityCode+='J';
        else
            personalityCode+='P';
        return personalityCode;
    }
    public static String getLinkToPersonalityType(String person){
        String getLink = "";
        switch (person) {
            case "INTJ" -> getLink += "https://www.truity.com/personality-type/INTJ";
            case "INFP" -> getLink += "https://www.truity.com/personality-type/INFP";
            case "INFJ" -> getLink += "https://www.truity.com/personality-type/INFJ";
            case "INTP" -> getLink += "https://www.truity.com/personality-type/INTP";
            case "ENFP" -> getLink += "https://www.truity.com/personality-type/ENFP";
            case "ENTJ" -> getLink += "https://www.truity.com/personality-type/ENTJ";
            case "ENTP" -> getLink += "https://www.truity.com/personality-type/ENTP";
            case "ENFJ" -> getLink += "https://www.truity.com/personality-type/ENFJ";
            case "ISFJ" -> getLink += "https://www.truity.com/personality-type/ISFJ";
            case "ISFP" -> getLink += "https://www.truity.com/personality-type/ISFP";
            case "ISTJ" -> getLink += "https://www.truity.com/personality-type/ISTJ";
            case "ISTP" -> getLink += "https://www.truity.com/personality-type/ISTP";
            case "ESFJ" -> getLink += "https://www.truity.com/personality-type/ESFJ";
            case "ESFP" -> getLink += "https://www.truity.com/personality-type/ESFP";
            case "ESTJ" -> getLink += "https://www.truity.com/personality-type/ESTJ";
            case "ESTP" -> getLink += "https://www.truity.com/personality-type/ESTP";
            default -> getLink += "Invalid result";
        }
        return getLink;

    }
}
