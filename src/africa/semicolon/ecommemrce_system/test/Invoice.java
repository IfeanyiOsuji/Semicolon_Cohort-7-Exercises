package africa.semicolon.ecommemrce_system.test;

public class Invoice {
    private int invoiceNumber;
    private String orderCode;
    private String orderDate;
    private String invoiceDetails;

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setInvoiceDetails(String invoiceDetails) {
        this.invoiceDetails = invoiceDetails;
    }

    public String getInvoiceDetails() {
        return invoiceDetails;
    }
}
