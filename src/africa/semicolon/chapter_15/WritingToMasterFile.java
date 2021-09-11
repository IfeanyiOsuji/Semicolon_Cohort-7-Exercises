package africa.semicolon.chapter_15;

import africa.semicolon.deitel_example_practice.SerializableAccount;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WritingToMasterFile {
    private static Formatter masterOutput;
    public static void main(String[] args) {
        openMasterFile();
        writeRecordsToMasterFile();
        closeMasterFile();

    }
    public static void openMasterFile(){
        try {
            masterOutput = new Formatter("oldmast.txt");
        }
        catch (SecurityException securityException){
            System.out.println("Writing permission denied. Terminating");
            System.exit(1);
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("Error opening file. Terminating");
            System.exit(1);
        }
    }
    public static void writeRecordsToMasterFile(){
        Scanner input = new Scanner(System.in);
        SerializableAccount account =new SerializableAccount();
        System.out.print("? ");
        while (input.hasNext()) {

            try {
                masterOutput.format("""
                        %10d              %12s                  %12s                   %12.2f
                                    """.formatted(input.nextInt(), input.next(), input.next(), input.nextDouble()));

            }
            catch (FormatterClosedException ex){
                System.err.println("Error writing to file. Terminating.");
                break;
            }
            catch (NoSuchElementException ex){
                System.err.println("Invalid input. Please try again.");
                input.nextLine();
            }
            System.out.print("? ");

        }

    }
    public static void closeMasterFile(){
        if(masterOutput != null){
            masterOutput.close();
        }
    }
}
