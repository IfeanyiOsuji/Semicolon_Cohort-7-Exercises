package africa.semicolon.deitelExercises.tddTest.chapter_4;

public class CreditLimitCalculator {
    private int allowableCredit;
    private int totalCredit;
    private int numberOfItemsChargedPerMonth;
    private  int initialBalance;
    private  int accountNumber;
    private int newballance;

    public CreditLimitCalculator(int accountNumber, int initialBalance, int numberOfItemsChargedPerMonth, int totalCredit, int allowableCredit) {
        this.accountNumber = accountNumber;
        this.initialBalance = initialBalance;
        this.numberOfItemsChargedPerMonth = numberOfItemsChargedPerMonth;
        this.totalCredit = totalCredit;
        this.allowableCredit = allowableCredit;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getInitialBalance() {
        return initialBalance;
    }

    public int getNumberOfItemsChargedPerMonth() {
        return numberOfItemsChargedPerMonth;
    }

    public void setNumberOfItemsChargedPerMonth(int itemsChargedPerMonth) {
        this.numberOfItemsChargedPerMonth = itemsChargedPerMonth;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public int getAllowableCredit() {
        return allowableCredit;
    }

    public int getNewbalance() {
        newballance = initialBalance + numberOfItemsChargedPerMonth - allowableCredit;
        return newballance;
    }

    public boolean isNewBalanceAboveCreditLimit(int numberOfItemsCharged) {
        numberOfItemsChargedPerMonth += numberOfItemsCharged;
        do{
            getNewbalance();
            if(newballance > allowableCredit) return false;
            numberOfItemsChargedPerMonth += numberOfItemsCharged;
        }while(getInitialBalance() <= allowableCredit);
        System.out.println(newballance);
       return true;
    }
}
