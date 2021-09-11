package africa.semicolon.deitel_example_practice;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;

//import static africa.semicolon.deitel_example_practice.CreateSequencialFile.closeFile;

public class ReadSequencialFiles {
    private static ObjectInputStream inputStream;
    public static void main(String[] args) {
        openFile();
        readFromFile();
        closeFile();
    }

    public static void openFile() {
        try{
            inputStream = new ObjectInputStream(Files.newInputStream(Paths.get("clients.ser")));
        }
        catch (IOException ex){
            System.out.println("Error opening file");
            System.exit(1);
        }
    }
    public static void readFromFile(){
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
                "First Name", "Last Name", "Balance");
        try{
            while (true){
                SerializableAccount account = (SerializableAccount) inputStream.readObject();
                System.out.printf("%-10d%-12s%-12s%10.2f%n", account.getAccount(),
                        account.getFirstName(), account.getLastName(), account.getBalance());
            }
        }
        catch (EOFException ex){
            System.out.printf("%nNo more records%n");
            System.exit(1);
        }
        catch (ClassNotFoundException ex){
            System.out.println("Invalid object type. Terminating..");
        }
        catch (IOException ex){
            System.out.println("Error reading from file. terminating");
        }
    }
    private static void closeFile(){
        try{
            if(inputStream != null)
                inputStream.close();
        }
        catch (IOException ex){
            System.out.println("Error closing file. terminating");
            System.exit(1);
        }
    }
}
