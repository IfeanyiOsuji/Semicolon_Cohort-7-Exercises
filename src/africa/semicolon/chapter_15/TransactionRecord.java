package africa.semicolon.deitelExercises.tddTest.chapter_14;

public class TransactionRecord {
    private int accountNumber;
    private double amount;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
