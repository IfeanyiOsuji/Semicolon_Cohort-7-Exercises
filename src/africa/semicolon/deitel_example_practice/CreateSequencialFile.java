package africa.semicolon.deitel_example_practice;

import africa.semicolon.deitelExercises.tddTest.Account;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateSequencialFile {
    private static ObjectOutputStream output;
    public static void main(String[] args) {
        openFile();
        writeToFile();
        closeFile();
    }

    private static void openFile() {
        try{
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get("clients.ser")));
        }
        catch (IOException ex){
            System.out.println("Error creating file. terminating..");
            System.exit(1);
        }
    }
    public  static void writeToFile(){
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ",
                "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input.");
        while (input.hasNext()){
            try {
                SerializableAccount record = new SerializableAccount(input.nextInt(), input.next(),
                        input.next(), input.nextDouble());
                output.writeObject(record);
            }
            catch (NoSuchElementException ex){
                System.out.println("Invalid input. Try again..");
                input.nextLine();
            }
            catch (IOException ex){
                //System.out.println("Error writing to file. Terminating..");
                System.out.println(ex.getCause());
                System.out.println(ex.getMessage());
                break;
            }
            System.out.print("? ");
        }


    }
    private static void closeFile(){
        try{
            if (output !=null)
                output.close();
        }
        catch (IOException ex){
            System.out.println("Error closing file. Terminating..");
        }
    }

}
