package africa.semicolon.deitelExercises.tddTest.chapter_5;

import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static String day;
    public static void displaySong(){
        Scanner numberInsert = new Scanner(System.in);
            defineUserManual();
        System.out.println("Select a day of Christmas");
        int dayOfChristmas = numberInsert.nextInt();
        do{
            selectDayOfChristmas(dayOfChristmas);
            String lyric = """
                   On the %s day of Christmas my true love sent to me
                    """.formatted(day);
            System.out.println(lyric);
            readCarolVerses(dayOfChristmas);
            System.out.println("Select a day of Christmas");
             dayOfChristmas = numberInsert.nextInt();
        }
        while (dayOfChristmas <=12);
    }

    private static void readCarolVerses(int dayOfChristmas) {
        switch (dayOfChristmas){
            case 12 : System.out.println("twelve ladies dancing");
            case 11 : System.out.println("eleven lords a-leaping");
            case 10 : System.out.println("ten Drummers drumming");
            case 9 : System.out.println("nine Pipers piping");
            case 8 : System.out.println("eight Maids a-milking");
            case 7 : System.out.println("seven Swans a-swimming");
            case 6 : System.out.println("six Geese a-lying");
            case 5 : System.out.println("five Golden rings");
            case 4 : System.out.println("four Collie birds");
            case 3 : System.out.println("three French hens");
            case 2 : System.out.println("two turtle doves");
            case 1 : System.out.println("A Patrigde in a pear tree\n");
        }
    }

    private static void selectDayOfChristmas(int dayOfChristmas) {
        switch (dayOfChristmas) {
            case 1 -> {
                day = "first";
                break;
            }
            case 2 -> {
                day = "second";
                break;
            }
            case 3 -> {
                day = "third";
                break;
            }
            case 4 -> {
                day = "fourth";
                break;
            }
            case 5 -> {
                day = "fifth";
                break;
            }
            case 6 -> {
                day = "sixth";
                break;
            }
            case 7 -> {
                day = "seventh";
                break;
            }
            case 8 -> {
                day = "eight";
                break;
            }
            case 9 -> {
                day = "ninth";
                break;
            }
            case 10 -> {
                day = "tenth";
                break;
            }
            case 11 -> {
                day = "eleventh";
                break;
            }
            case 12 -> {
                day = "twelfth";
                break;
            }
            default -> System.out.println("please input a valid day");
        }
    }

    private static void defineUserManual() {
        String userOptions = """
                Twelve days of Christmas    
               -> Press 1 to begin from Ist day
               -> Press 2 to begin from 2nd day
               -> Press 3 to begin from third day
               -> Press 4 to begin from fourth day
               -> Press 5 to begin from fifth day
               -> Press 6 to begin from sixth day
               -> Press 7 to begin from seventh day
               -> Press 8 to begin from eight day
               -> Press 9 to begin from ninth day
               -> Press 10 to begin from tenth day
               -> Press 11 to begin from eleventh day
               -> Press 12 to begin from twelfth day
                """;
        System.out.println(userOptions);
    }

    public static void main(String[] args) {
        displaySong();
    }
}
