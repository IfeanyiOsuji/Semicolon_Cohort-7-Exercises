package africa.semicolon.deitelExercises.tddTest;

public class Account {
    public static final int MINIMUM_BALANCE = 0;
    private  String name;
    private double myAccountBalance;
    private String accountPIN = "1907";
    private final int accountNumber;
    private static int accountNumberGenerator = 0;

    public Account(String name, double amountToDeposit) {
        accountNumberGenerator++;
        this.name = name;
        myAccountBalance = amountToDeposit;
        accountNumber = accountNumberGenerator;
    }
    public Account(){
        accountNumberGenerator++;
        accountNumber = accountNumberGenerator;

    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getMyAccountBalance(){
        return myAccountBalance;
    }
    public void deposit(double amountToDeposit) {
        if(amountToDeposit >= MINIMUM_BALANCE)
        myAccountBalance = myAccountBalance + amountToDeposit;
    }

    public double withdraw(double amountToWithdraw, String pin) {
        if(checkIfPinIsValid(pin)) {
            validateAndWithDraw(amountToWithdraw);
        }
        else
            System.out.println("Invalid PIN");
        return myAccountBalance;
    }

    public double withdraw(double amountToWithdraw) {
        validateAndWithDraw(amountToWithdraw);
        return myAccountBalance;
    }

    private void validateAndWithDraw(double amountToWithdraw) {
        if (amountIsNegative(amountToWithdraw)) {
            throw new IllegalArgumentException("Amount cannot be less than zero");
        } else if (amountGreaterThanBalance(amountToWithdraw)) {
            throw new IllegalArgumentException("Insufficient fund");
        } else {
            myAccountBalance = myAccountBalance - amountToWithdraw;
        }
    }

    private boolean checkIfPinIsValid(String pin) {
        return accountPIN.equals(pin);
    }

    private boolean amountGreaterThanBalance(double amountToWithdraw) {
        return amountToWithdraw > myAccountBalance;
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
        System.out.println(accountToDisplay.getName() +" : "+accountToDisplay.getMyAccountBalance());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void transfer(double amount) {
        this.withdraw(amount);
    }

}
