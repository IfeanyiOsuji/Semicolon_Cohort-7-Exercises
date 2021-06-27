package africa.semicolon.deitelExercises.tddTest;

import java.util.Scanner;

public class AccountApplication {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Bola");
        account.getAccountPIN();
        String welcome = """
                Welcome to IfyWanne bank
                -> Please enter your pin
                """;
        System.out.println(welcome);
        String usermanual = """
                -> Press 1 to withdraw
                -> Press 2 to deposit
                -> press 3 to check balance
                -> press 4 to change pin
                -> Enter 0 to exit
                """;
        Scanner input = new Scanner(System.in);
            String userPin = input.nextLine();
            if(userPin.equals(account.getAccountPIN())) {
                System.out.println(usermanual);
                int userChoice;
                do {
                   userChoice = input.nextInt();
                    switch (userChoice) {
                        case 1 -> {
                            System.out.println("Enter amount ");
                            int amount = input.nextInt();
                            input.nextLine();
                            System.out.println("Enter pin");
                            String pin = input.nextLine();
                            account.withdraw(amount, pin);
                            System.out.println(account.getMyAccountBalance());
                            break;
                        }
                        case 2 -> {
                            System.out.println("Enter amount to deposit ");
                            int amount = input.nextInt();
                            account.deposit(amount);
                            System.out.println(account.getMyAccountBalance());
                            break;
                        }
                        case 3 -> Account.displayAccount(account);

                        case 4 -> {
                            System.out.println("Change Pin");
                            input.nextLine();
                            account.setAccountPIN(input.nextLine());
                            break;
                        }
                        default ->{ System.out.println("End of transaction");
                            System.out.println(usermanual);}
                    }

                } while (userChoice != 0);
            }
            else
                System.out.println("Invalid Pin");
    }
}
