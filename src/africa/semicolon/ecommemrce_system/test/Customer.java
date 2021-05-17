package africa.semicolon.ecommemrce_system.test;

public class Customer {
    private String customerID;
    private String title;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String loginPassword;
    private String customerAddress;
    private String phoneNumber1;
    //private String getPhoneNumber2;

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerID() {
        return  customerID;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setFirstNmae(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;

    }

    public String getEmailAddress() {
        return  emailAddress;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getLoginAddress() {
        return loginPassword;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber1 = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber1;
    }
}
