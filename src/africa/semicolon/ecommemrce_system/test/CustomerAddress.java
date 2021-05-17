package africa.semicolon.ecommemrce_system.test;

public class CustomerAddress {
    /*
    */
    private String customerAddressID;
    private String customerID;
    private String addressLine1;
    private String addressLine2;
    private String townCity;
    private String postalCode;
    private String state;
    private String country;

    public void setCustomerAddressID(String customerAddressID) {
        this.customerAddressID = customerAddressID;
    }

    public String getCustomerAddressID() {
        return customerAddressID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setTownCity(String townCity) {
        this.townCity = townCity;
    }

    public String getTownCity() {
        return  townCity;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;

    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
