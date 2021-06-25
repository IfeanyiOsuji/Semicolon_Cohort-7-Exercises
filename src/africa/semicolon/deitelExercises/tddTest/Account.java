package africa.semicolon.deitelExercises.tddTest;

import africa.semicolon.deitelExercises.tddTest.bank_application.Admin;

public class Account {
    public static final int MINIMUM_BALANCE = 0;
    private  String name;
    private double myAccountBallance;
    private String accountPIN = "1907";
    private final int accountNumber;
    private static int counter = 0;

    public Account(String name, double amountToDeposit) {
        counter++;
        this.name = name;
        myAccountBallance = amountToDeposit;
        accountNumber = counter;
    }
    public Account(){
        counter++;
        accountNumber = counter;

    }
    public int getAccountNumber(){
        return accountNumber;
    }
//    public void setAccountNumber(int accountNumber){
//        this.accountNumber = accountNumber;
//    }
    public double getMyAccountBallance(){
        return myAccountBallance;
    }
    public void deposit(double amountToDeposit) {
        if(amountToDeposit >= MINIMUM_BALANCE)
        myAccountBallance = myAccountBallance + amountToDeposit;
    }

    public double withdraw(double amountToWithdraw, String pin) {
        if(checkIfPinIsValid(pin)) {
            validateAndWithDraw(amountToWithdraw);
        }
        else
            System.out.println("Invalid PIN");
        return myAccountBallance;
    }

    public double withdraw(double amountToWithdraw) {
        validateAndWithDraw(amountToWithdraw);
        return myAccountBallance;
    }

    private void validateAndWithDraw(double amountToWithdraw) {
        if (amountIsNegative(amountToWithdraw)) {
            throw new IllegalArgumentException("Amount cannot be less than zero");
        } else if (amountGreaterThanBalance(amountToWithdraw)) {
            throw new IllegalArgumentException("Insufficient fund");
        } else {
            myAccountBallance = myAccountBallance - amountToWithdraw;
        }
    }

    private boolean checkIfPinIsValid(String pin) {
        return accountPIN.equals(pin);
    }

    private boolean amountGreaterThanBalance(double amountToWithdraw) {
        return amountToWithdraw > myAccountBallance;
    }

    private boolean amountIsNegative(double amount){
        return amount < MINIMUM_BALANCE;
    }
    public String getAccountPIN() {
        return accountPIN;
    }

    public void setAccountPIN(String accountPIN) {
        this.accountPIN = accountPIN;
    }
    public static void displayAccount(Account accountToDisplay){
        System.out.println(accountToDisplay.getName() +" : "+accountToDisplay.getMyAccountBallance());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void transfer(Account secondAccount, double amount) {
        Account otherAccount = secondAccount;
        double withdraw = withdraw(amount);
        otherAccount.deposit(withdraw);
    }

}
