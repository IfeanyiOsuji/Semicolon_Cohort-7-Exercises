package africa.semicolon.deitelExercises.tddTest.bank_application;

import africa.semicolon.deitelExercises.tddTest.Account;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private int password;
    private String userName;
    // rivate static ArrayList<BankCustomer>customerList = new ArrayList<>();
    private BankCustomer customer;

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }



//    public ArrayList<BankCustomer> getBankCustomerList() {
//
//        return customerList;
//    }
//    public BankCustomer getCustomer(){
//        return customer;
//    }


    public static int getCustomerSize() {
        return BankApp.getBankCustomerList().size();
    }

    public void deleteCustomer(int accountNumber) {
       boolean found = BankApp.getBankCustomerList().removeIf(customer2 -> customer2.getAccountNumber() == accountNumber);
       if(!found)
           throw new NullPointerException("This account does not exist");
    }
    public void viewAllCustomerDetails(){
        System.out.println("Below are the details of the customers\n");
        for(int i=0; i<BankApp.getBankCustomerList().size(); i++){
            BankCustomer customer = BankApp.getBankCustomerList().get(i);

            String firstName = customer.getFirstName();
            String lastName = customer.getLastName();
            String phone = customer.getPhoneNumber();
            int accountNumber = customer.getAccountNumber();
            double balance = customer.getBalance();

            System.out.println("AccountName : "+firstName+" "+lastName);
            System.out.println("AccountNumber : "+accountNumber);
            System.out.println("PhoneNumber : "+phone);
            System.out.println("AccountBalance : "+balance);
            System.out.println("_________________________________________________________");
        }
    }

}
