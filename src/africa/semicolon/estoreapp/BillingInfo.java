package africa.semicolon.estoreapp;

public class BillingInfo {
    private Customer customer;
    private CreditCard creditCard;

    public BillingInfo(){
        customer = new Customer();
        creditCard = new CreditCard();
    }
    public String getPhoneNumber(){
        return customer.getPhone();
    }
    public String getName(){
        return customer.getName();
    }

    public Address getDeliveryAddress(){
        return customer.getHomeAddress();
    }

    public String getCreditCardInfo(){
        return creditCard.toString();
    }
}
