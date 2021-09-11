package africa.semicolon.deitel_example_practice;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static africa.semicolon.deitel_example_practice.MenuOption.ZERO_BALANCE;

public class CreditEnquiry {
    private final static MenuOption [] choices= MenuOption.values();
    public static void main(String[] args) {
        MenuOption accountType = getRequest();
        while (accountType != MenuOption.END){
            switch (accountType){
                case ZERO_BALANCE -> System.out.printf("%n accounts with zero balance:%n");
                case CREDIT_BALANCE -> System.out.printf("%n accounts with credit balance%n");
                case DEBIT_BALANCE -> System.out.printf("%n accounts with debit balance");
            }
            readRecords(accountType);
            accountType = getRequest();
        }
    }

    private static void readRecords(MenuOption accountType) {
        try(Scanner input = new Scanner(Paths.get("clients.txt"))){
            while (input.hasNext()){
                int accountNumber = input.nextInt();
                String firstName = input.next();
                String lastName = input.next();
                double balance = input.nextDouble();
                if(shouldDisplay(accountType, balance)){
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber,firstName, lastName, balance);
                }
                else
                    input.nextLine();

            }
        }
        catch (NoSuchElementException | IllegalStateException | IOException e){
            System.err.println("Error processing file. Terminating.");
            System.exit(1);
        }
    }

    private static boolean shouldDisplay(MenuOption accountType, double balance) {
        if(accountType == MenuOption.CREDIT_BALANCE && balance >0)
            return true;
        else if(accountType == MenuOption.DEBIT_BALANCE && balance < 0)
            return true;
        else if(accountType == ZERO_BALANCE && balance ==0)
            return true;

        return false;
    }

    private static MenuOption getRequest() {
        int request = 4;
        String options = """
                Enter Request
          1 -> List accounts with zero balances.
          2 -> List accounts with credit balances.
          3 -> List accounts with debit balances.
          4 -> Terminate program
                """;
        System.out.println(options);
        try{
            Scanner input = new Scanner(System.in);
            do{
                System.out.printf("%n? ");
                request = input.nextInt();
            }
            while ((request < 1) || (request >4));
        }
        catch (NoSuchElementException noSuchElementException){
            System.out.println("Invalid input. terminating..");
        }
        return choices[request - 1];

    }
}
