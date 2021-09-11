package africa.semicolon.chapter_15;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFiles {
    public static Scanner input;
    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    private static void openFile() {
        try {
            input = new Scanner(Paths.get("clients.txt"));
        }
        catch (IOException ex){
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
        //catch (){}
    }

    private static void readRecords() {
        String heading = """
            %s           %s          %s           %s
                """.formatted("Account","First Name", "Last Name", "Balance");
        System.out.println(heading);
        try {
            while(input.hasNext()){
             String file = """
             %d             %s              %s              %.2f
                     """.formatted(input.nextInt(), input.next(), input.next(), input.nextDouble());
                System.out.println(file);
            }

        }
        catch (NoSuchElementException ex){
            System.out.println("File improperly formed. Terminating");
        }
        catch (IllegalStateException ex){
            System.out.println("Error reading from file");
        }
    }

    private static void closeFile() {
        if(input != null){
            input.close();
        }
    }
}
