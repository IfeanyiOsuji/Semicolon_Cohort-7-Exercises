package africa.semicolon.deitelExercises.tddTest;

public class Account {
    public static final int MINIMUM_BALANCE = 0;
    private double myAccountBallance;
    private String accountPIN = "1907";

    public double getMyAccountBallance(){
        return myAccountBallance;
    }
    public void deposit(double amountToDeposit) {
        if(amountToDeposit >= MINIMUM_BALANCE)
        myAccountBallance = myAccountBallance + amountToDeposit;
    }

    public double withdraw(double amountToWithdraw, String pin) {
        if(checkIfPinIsValid(pin)) {
            if (amountIsNegative(amountToWithdraw)) {
            } else if (amountGreaterThanBalance(amountToWithdraw)) {
            } else {
                myAccountBallance = myAccountBallance - amountToWithdraw;
            }
        }
        else
            System.out.println("Invalid PIN");
        return myAccountBallance;
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

}
