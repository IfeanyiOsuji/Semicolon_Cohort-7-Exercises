package africa.semicolon.chapter_15;

import africa.semicolon.deitel_example_practice.SerializableAccount;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class FileMatch {
    private static Formatter newMaster;
    private static Formatter log;
   public static Scanner input;
   public  static Scanner input2;
   private static ArrayList<TransactionRecord>transactionRecords = new ArrayList<>();
   private static ArrayList<SerializableAccount>accounts = new ArrayList<>();
    public static void main(String[] args) {
        openTransactionFile();
        openMasterFile();
        readTransactionFile();
        readMasterFile();
        closeTransactionFile();
        closeMasterFile();

        openNewMasterFile();
        writeToNewMasterFile();
        closeNewMasterFile();

        openLogFile();
        writeToLogFile();
        closeLogFile();
        //System.out.println(transactionRecords);
       // System.out.println(accounts);
        for (SerializableAccount account : accounts){
            System.out.println(account.getAccount()+" "+account.getFirstName()+" "+account.getLastName()+" "+account.getBalance());
        }


    }
    public static void openTransactionFile(){
        try{
             input = new Scanner(Paths.get("trans.txt"));
        }
        catch (IOException ex){
            System.out.println("File not found");
            System.exit(1);
        }
    }
    public static void openMasterFile(){
        try{
            input2 = new Scanner(Paths.get("oldmast.txt"));
        }
        catch (IOException ex){
            System.out.println("File not found");
            System.exit(1);
        }

    }
    public static void openNewMasterFile(){
        try {
            newMaster = new Formatter("newmast.txt");
        }
        catch (IOException ex){
            System.out.println("FIle not found;");
        }

    }
    public static void openLogFile(){
        try{
            log = new Formatter("log.txt");
        }
        catch (IOException ex){
            System.out.println("FIle not found;");
        }
    }
    public static void readTransactionFile(){

        try {

        while (input.hasNext()){
            TransactionRecord record = new TransactionRecord();
            record.setAccountNumber(input.nextInt());
            record.setAmount(input.nextDouble());
            transactionRecords.add(record);

            }
        }
        catch (NoSuchElementException ex){
            System.out.println("Value not found");
        }
        catch (IllegalStateException ex){
            System.out.println("Error reading from file");
        }

    }
    public static void readMasterFile(){

        try {

            while (input2.hasNext()){
                SerializableAccount account = new SerializableAccount();
                account.setAccount(input2.nextInt());
                account.setFirstName(input2.next());
                account.setLastName(input2.next());
                account.setBalance(input2.nextDouble());
                accounts.add(account);

            }
        }
        catch (NoSuchElementException ex){
            System.out.println("Value not found");
        }
        catch (IllegalStateException ex){
            System.out.println("Error reading from file");
        }

    }
    public static void writeToNewMasterFile(){
        for(int i=0; i< accounts.size(); i++){
                newMaster.format("""
                        %10d    %10s    %10s    %12.2f
                        """.formatted(accounts.get(i).getAccount(), accounts.get(i).getFirstName(),
                        accounts.get(i).getLastName(), accounts.get(i).combine(transactionRecords.get(i))));
        }
    }
    public static boolean isRecordNotInMasterFile(int number) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccount() == number) {
                return false;
            }
        }
        return true;
    }
    public static void writeToLogFile(){
        for(TransactionRecord account :transactionRecords){
            if(isRecordNotInMasterFile(account.getAccountNumber())){
                log.format("""
                        unmatched transaction with account for account number %d
                        """.formatted(account.getAccountNumber()));
            }
        }
    }


    private static void closeTransactionFile(){
        if(input != null)
            input.close();
    }
    private static void closeMasterFile(){
        if(input2 != null)
            input2.close();
    }
    private static void closeNewMasterFile(){
        if(newMaster != null)
            newMaster.close();
    }
    private static void closeLogFile(){
        if(log != null)
            log.close();
    }

}
