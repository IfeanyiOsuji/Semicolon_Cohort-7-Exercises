package africa.semicolon.deitelExercises.tddTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Accounttest {

    @Test
    public void testThatUserCanDepositOnce(){
        Account jnetAccount = new Account();
        jnetAccount.deposit(580.00);
        double ballance = jnetAccount.getMyAccountBalance();
        assertEquals(580.0, ballance);
    }
    @Test
    public void testThatUserCanDepositTwice(){
        Account jnetAccount = new Account();
        jnetAccount.deposit(580.00);
        jnetAccount.deposit(200);
        double ballance = jnetAccount.getMyAccountBalance();
        assertEquals(780.0, ballance);
    }
    @Test
    public void testThatUserCannotDepositNegativeValue(){
        Account jnetAccount = new Account();
        jnetAccount.deposit(-580.0);
        double ballance = jnetAccount.getMyAccountBalance();
        assertEquals(0.0, ballance);
    }
    @Test
    public void testThatUserCanWithdraw(){
        Account jnetAccount = new Account();
        jnetAccount.deposit(580.0);
        double amount = jnetAccount.withdraw(580.00,"1907");
        assertEquals(0.0, amount);
    }
    @Test
    public void testThatUserCannotWithDrawnegativeAmount(){
        Account jnetAccount = new Account();
        jnetAccount.deposit(580.0);
        double amount = jnetAccount.withdraw(200.0,"1907");
        assertEquals(380.0, amount);
    }
    @Test
    public void testThatUserCannotWithdrawAboveBalance(){
        Account jnetAccount = new Account();
        jnetAccount.deposit(300);
        double amount = jnetAccount.withdraw(200.0,"1907");
        assertEquals(100, amount);
    }
    @Test
    public void testThatUserCanUpdatePIN(){
        Account jnetAccount = new Account();
        jnetAccount.setAccountPIN("2208");
        assertEquals("2208", jnetAccount.getAccountPIN());
    }
    @Test
    public void programCanDisplayUserAccountInformation(){
        Account jnetAccount = new Account("Jane DOe", 500.00);
        Account.displayAccount(jnetAccount);

    }
    @Test
    void testThatCustomerCanWithdrawWithoutPin(){
        Account jnetAccount = new Account();
        jnetAccount.deposit(300);
        double amount = jnetAccount.withdraw(200.0);
        assertEquals(100, amount);
    }
    @Test
    void testThatCustomerCanTransfer(){
        Account janetAccount = new Account();
        janetAccount.deposit(1000.00);
        Account kolaAccount = new Account();
        janetAccount.transfer(500.00);
        assertEquals(500.00, janetAccount.getMyAccountBalance());
        assertEquals(500.00, kolaAccount.getMyAccountBalance());

    }
    @Test
    void testThatCustomerCannotTransferMoreThanAvailableBalance(){
        Account janetAccount = new Account();
        janetAccount.deposit(1000.00);
        Account kolaAccount = new Account();
        janetAccount.transfer(500.00);
        assertEquals(500.00, janetAccount.getMyAccountBalance());
    }
    @Test
    void testThatAccountCanGenerateAccountNumber(){
        Account janetAccount = new Account();
        Account jane = new Account();
        int accNum1 = janetAccount.getAccountNumber();
        int accNum2 = jane.getAccountNumber();
        assertEquals(1, accNum1);
        assertEquals(2, accNum2);
    }

}
