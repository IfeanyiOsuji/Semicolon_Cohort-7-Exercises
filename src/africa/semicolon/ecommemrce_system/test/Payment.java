package africa.semicolon.ecommemrce_system.test;

public class Payment {
    private String paymentRef;
    private int invoiceNumber;
    private String paymentmethodCode;
    private String invoice;
    private String paymentDate;
    private double paymentAmount;

    public String getPaymentRef() {
        return paymentRef;
    }
    public void setInvoiceNumber(int invoiceNumber){
        this.invoiceNumber = invoiceNumber;
    }
    public int getInvoiceNumber() {
        return invoiceNumber;
    }
    public String getPaymentMethodCode() {
        return paymentmethodCode;
    }
    public void setPaymentMethodCode(String paymentmethodCode) {
        this.paymentmethodCode = paymentmethodCode;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setPaymentRef(String paymentRef) {
        this.paymentRef = paymentRef;
    }
}
