package africa.semicolon.deitelExercises.tddTest.bank_application;

import africa.semicolon.deitelExercises.tddTest.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {
    public static Admin admin = new Admin();
    public static Scanner input = new Scanner(System.in);
    public static Scanner stringInput = new Scanner(System.in);
    private static  ArrayList<BankCustomer> customerList = new ArrayList();
    private static int customerChoice;
    private static int adminChoice;
    private static int option;
    private static int choice;
    private static int customerPassword;

    public static void main(String... args) {
        admin.setPassword(1901);
       do{
          displayWelcome();
          int choice = input.nextInt();
          if(choice == 3)break;
          if(choice == 1){
              if(isAdminIn()){
                  displayAdminOptions();
                  getAdminChoice();
              }
              else {
                  System.out.println("Invalid admin password");
                  main();
                  break;
              }
          }
           else if(choice == 2){
                  displayCustomerMenu();
                  int userChoice = input.nextInt();
                  if(userChoice == 1) {
                      createCustomerAccount();
                  }
                  else if(userChoice == 2){
                      if(isCustomer()){
                          displayCustomerOptions();
                          makeTransactions();
                      }
                  }
              }
       }
       while (true);
    }

    private static boolean isCustomer() {
        System.out.println("Enter your password");
        int password = input.nextInt();
        for(BankCustomer bankCustomer : getBankCustomerList()){
            if(bankCustomer.getPassword() == password){
                System.out.println("You have been successfully logged in");
                customerPassword = password;
                return true;
            }
        }
        System.out.println("Incorrect password");
        return false;
    }
    public static void displayWelcome () {
        String welcome = """
                    WELCOME TO BANK PHB
                    Enter
                      1 -> for STAFF login
                      2 -> for CUSTOMER login
                      3 ->  to EXIT
                        """;
        System.out.println(welcome);

    }
    private static void loginOptions() {
        Scanner input = new Scanner(System.in);
        option = input.nextInt();
        if(option ==1){
            adminChoice = input.nextInt();
            if(adminChoice == 1){
                displayAdminOptions();
            }
            else if(adminChoice == 2){
                deleteCustomer();
            }
            else
                if(customerChoice == 3){
                    displayWelcome();
                    loginOptions();
                }
                else
                    System.out.println("Invalid option");

        }
        else if(option == 2){
            displayCustomerMenu();
           int user = input.nextInt();
           if(user == 1){
               createCustomerAccount();
           }
           else if(user ==2){
               if(isCustomer()){
                   displayCustomerOptions();
                   makeTransactions();
               }



           }
        }

    }
  private static void makeTransactions() {
        int userChoice = input.nextInt();
        switch (userChoice){
            case 1:
                deposit();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                transfer();
                break;
            case 4:
                checkAccountBalance();
                break;
            case 5: loadAirTime();
                    break;
            case 6: logOut();
                    break;
            case 7: deleteYourAccount();
        }
    }

    private static void deleteYourAccount() {
        System.out.println("Enter your password");
        int pass = input.nextInt();
        for (BankCustomer customer : getBankCustomerList()) {
            if (customer.getPassword() == pass)
                getBankCustomerList().remove(customer);
        }
        System.out.println("Incorrect password");

    }
    private static void logOut() {
        option = 3;
    }

    private static void checkAccountBalance() {
        System.out.println("Enter your password");
        int pass = input.nextInt();
        for (BankCustomer bankUser : getBankCustomerList()) {
            if (bankUser.getPassword() == pass) {
                System.out.println("Your account balance is " + bankUser.getBalance());
                break;
            }
        }
        continueTransaction();
    }

    private static boolean isAdminIn() {
        System.out.println("Enter password ");
        int pass = input.nextInt();
        if (pass == admin.getPassword()) {
            return true;
        }
        return false;
    }
        public static void getAdminChoice(){
           int adminOption = input.nextInt();
            if(adminOption ==1) {
                admin.viewAllCustomerDetails();
                System.out.println("Would you like to carry out another activity? Enter 1 for yes and 2 for No");
                int adminChoice = input.nextInt();
                if(adminChoice == 1){
                    displayAdminOptions();
                    getAdminChoice();
                }
                else {option = 3;}
            }
            else if(adminOption == 2) {
                deleteCustomer();
                System.out.println("Would you like to carry out another activity? Enter 1 for yes and 2 for No");
                int adminChoice = input.nextInt();
                if(adminChoice == 1){
                    displayAdminOptions();
                    getAdminChoice();
                }
                else {option = 3;}

            }
            else if(adminOption == 3) {
                System.out.println("logging out_____");
                displayWelcome();
                loginOptions();
            }
        else {
            System.out.println("Incorrect input");}
    }

    private static void loadAirTime() {
        try{
        for(BankCustomer customer: getBankCustomerList()) {
            if(customer.getPassword() == customerPassword) {
                System.out.println("Enter amount to recharge");
                double rechargeAmount = input.nextDouble();
                System.out.println("Enter phone number to recharge");
                String phone = stringInput.nextLine();

                customer.loadAirtime(phone, rechargeAmount);
                System.out.println("Amount loaded successfully");
                System.out.println("Your balance is " + customer.getBalance());
            }
        }
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        continueTransaction();
    }

    private static void transfer() {
        for(BankCustomer customer:getBankCustomerList()) {
            BankCustomer thisCustomer = customer;
            if(thisCustomer.getPassword() == customerPassword) {

                System.out.println("Enter amount to transfer");
                double transferAmount = input.nextDouble();
                System.out.println("Enter account number of the recipient");
                int accountNumber = input.nextInt();

                try {
                    thisCustomer.transfer(transferAmount);
                    for (BankCustomer customerTorecieve : getBankCustomerList()) {
                        BankCustomer secondCustomer = customerTorecieve;
                        if (secondCustomer.getAccountNumber() == accountNumber) {
                            secondCustomer.deposit(transferAmount);
                            System.out.println("Amount transferred successfully");
                            System.out.println("Your balance is " + thisCustomer.getBalance());
                            break;
                        }
                    }
                }catch (IllegalArgumentException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }
        continueTransaction();
    }

    private static void withdraw() {
        for(BankCustomer customer : getBankCustomerList()) {
            if(customer.getPassword() == customerPassword) {
                System.out.println("Enter amount to withdraw");
                try {
                    double withdrawAmount = input.nextDouble();
                    for (BankCustomer bankUser : getBankCustomerList()) {
                        if (bankUser.getAccountNumber() == customer.getAccountNumber())
                            bankUser.withdraw(withdrawAmount);
                        System.out.println("Amount withdrawn successfully");
                        System.out.println("Your balance is " + bankUser.getBalance());
                        break;
                    }
                } catch (IllegalArgumentException ex) {
                    ex.getMessage();
                }
            }
        }
        continueTransaction();

    }

    private static void deposit() {
        for(BankCustomer customer : getBankCustomerList()) {
            if(customer.getPassword() == customerPassword) {
                System.out.println("Enter amount to deposit");
                try {
                    double deposit = input.nextDouble();
                    for (BankCustomer bankUser : getBankCustomerList()) {
                        if (bankUser.getAccountNumber() == customer.getAccountNumber()) {
                            bankUser.deposit(deposit);
                            System.out.println("Amount deposited successfully");
                            System.out.println("Your account balance is " + bankUser.getBalance());
                            break;
                        }
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        continueTransaction();

    }
    private static void continueTransaction() {
        System.out.println("Would you like to perform another transaction? enter 1 for yes and 2 for No");
        int answer = input.nextInt();
        if(answer == 1) {
            displayCustomerOptions();
            makeTransactions();
        }
        else
            option = 3;
    }

    private static void displayCustomerOptions() {
        String options = """
   
        Enter
          1 -> to deposit
          2 -> to withdraw
          3 -> transfer
          4 -> Check balance
          5 -> load airtime
          6 -> logOut
          7 -> deleteAccount
            """;
        System.out.println(options);
    }
    private static void createCustomerAccount() {
        System.out.println("Enter first name");
        String firstName = stringInput.nextLine();
        System.out.println("Enter last name");
        String lastName = stringInput.nextLine();
        System.out.println("Enter password");
        int pass = input.nextInt();
        System.out.println("Enter phone number");
        String phone = stringInput.nextLine();
        System.out.println("Enter initial deposit");
        double deposit = input.nextDouble();
        Account customerAccount = new Account();
        try {
            BankCustomer newCustomer = new BankCustomer(firstName, lastName, pass, phone, customerAccount);
            addCustomerToList(newCustomer, deposit);
            customerPassword = pass;
            System.out.println("Account added successfully");
            System.out.println("Would you like to login to your account? enter 1 for Yes And 2 for No");
            int answer = input.nextInt();
            if(answer ==1) {
                if(isCustomer()) {
                    displayCustomerOptions();
                    makeTransactions();
                }

            }
            else {
                System.out.println("Thank you.");
                option = 3;
            }
        }
        catch (IllegalAccessException ex){
            createCustomerAccount();
        }
    }
    private static void displayCustomerMenu() {
        String options = """
   
        Enter
          1 -> to create account
          2 -> to login
            """;
        System.out.println(options);
    }
    private static void deleteCustomer() {
        System.out.println("Enter customer account number to delete");
        int custAccountNumber = input.nextInt();
        try {
            for (BankCustomer customer2 : getBankCustomerList()) {
                if (customer2.getAccountNumber() == custAccountNumber) {
                    admin.deleteCustomer(custAccountNumber);
                    System.out.println("Customer account successfully deleted");
                    break;
                }

            }
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }

    }

    private static void displayAdminOptions() {
        String options = """
   
        Enter
          1 -> to view customer details
          2 -> delete customer
          3 ->  to logOut
            """;
        System.out.println(options);
    }
        public static void addCustomerToList(BankCustomer customer1, double accountBalance) throws IllegalAccessException {
           BankCustomer customer = customer1;
            customer.deposit(accountBalance);
            for(BankCustomer customer2 : customerList) {
                if(customer.getAccountNumber() == customer2.getAccountNumber())
                    throw new IllegalAccessException("This account already exists");
            }
            customerList.add(customer);
        }
    public static ArrayList<BankCustomer> getBankCustomerList() {
        return customerList;
    }
}
