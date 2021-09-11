package africa.semicolon.deitel_example_practice;

import africa.semicolon.chapter_15.TransactionRecord;

import java.io.Serializable;

public class SerializableAccount implements Serializable {
    private int account;
    private String firstName;
    private String lastName;
    private double balance;
    public SerializableAccount(){
        this(0, "", "", 0.0);
    }

    public SerializableAccount(int account, String firstName, String lastName, double balance) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double combine(TransactionRecord record) {
        if(this.account == record.getAccountNumber()) {
            double newBalance = this.balance + record.getAmount();
            return newBalance;
        }
        return this.balance;
    }
}
