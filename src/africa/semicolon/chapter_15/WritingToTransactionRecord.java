package africa.semicolon.chapter_15;

import africa.semicolon.deitel_example_practice.SerializableAccount;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WritingToTransactionRecord {
    private static Formatter transactionOutput;
    private static Formatter masterOutput;
    public static void main(String[] args) {
        openTransactionRecord();
        writeRecordsToTransactionRecord();
        closeTransactionFile();

        //System.out.println("Write to transaction record");

    }
    public static void openTransactionRecord(){
        try {
            transactionOutput = new Formatter("trans.txt");
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

    public static void writeRecordsToTransactionRecord(){
       Scanner input = new Scanner(System.in);
        System.out.print("? ");
       while(input.hasNext()){
           try {
               transactionOutput.format("""
           %10d                   %12.2f
                       """.formatted(input.nextInt(), input.nextDouble()));
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
    public static void closeTransactionFile(){
        if(transactionOutput != null){
            transactionOutput.close();
        }
    }


}
