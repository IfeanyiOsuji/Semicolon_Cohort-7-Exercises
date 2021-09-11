package africa.semicolon.estoreapp;

public class CreditCard {
    private String cvv;
    private String expiryDate;
    private String cardNumber;
    private String cardName;
    private CardType cardType;

    public CreditCard(){}
    public CreditCard(String cvv, String expiryDate, String cardNumber, String cardName, CardType cardType) {
        this.cvv = cvv;
        this.expiryDate = expiryDate;
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.cardType = cardType;
    }

    public String getCvv() {
        return cvv;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public CardType getCardType() {
        return cardType;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cvv='" + getCvv() + '\'' +
                ", expiryDate='" + getExpiryDate() + '\'' +
                ", cardNumber='" + getCardNumber() + '\'' +
                ", cardName='" + getCardName() + '\'' +
                ", cardType=" + getCardType() +
                '}';
    }
}
