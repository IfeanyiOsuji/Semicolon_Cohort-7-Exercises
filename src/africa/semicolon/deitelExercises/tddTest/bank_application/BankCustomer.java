package africa.semicolon.deitelExercises.tddTest.bank_application;

import africa.semicolon.deitelExercises.tddTest.Account;

public class BankCustomer {
    private Account myAccount;
    private String phoneNumber;
    private int password;
    private String firstName;
    private String lastName;
    public BankCustomer(String firstName, String lastName, int password,String phoneNumber, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        myAccount = account;
    }

    public BankCustomer() {
        myAccount = new Account();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public void deposit(double amount) {

        myAccount.deposit(amount);
    }

    public double getBalance() {
        return myAccount.getMyAccountBalance();
    }

    public double withdraw(double amount) {
        return myAccount.withdraw(amount);
    }

    public void transfer(double amount) {
        myAccount.transfer( amount);
    }

    public double loadAirtime(String phoneNumber, double rechargeAmount) {
            return myAccount.withdraw(rechargeAmount);
    }

    public int getAccountNumber() {
        return myAccount.getAccountNumber();
    }
    public Account getMyAccount(){
        return myAccount;
    }
    @Override
    public String toString() {
        return "BankCustomer{" +
                "account=" + myAccount +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password=" + password +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", AccountNumber='" + myAccount.getAccountNumber() + '\'' +
                '}';
    }
}
