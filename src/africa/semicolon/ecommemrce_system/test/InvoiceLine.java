package africa.semicolon.ecommemrce_system.test;

public class InvoiceLine {
    private String orderItemID;
    private int productNumber;
    private String productCode;
    private String productName;
    private int productQuantity;
    private double productPrice;
    private double deliveryproductCost;
    private double VAT;
    private double totalCost;


    public void setOrderItemID(String orderItemID) {
        this.orderItemID = orderItemID;
    }

    public String getOrderItemID() {
        return orderItemID;
    }
    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
    public int getProductNumber() {
        return productNumber;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setDeliveryProductCost(double deliveryProductCost) {
        this.deliveryproductCost = deliveryProductCost;
    }

    public double getDeliveryProductCost() {
        return deliveryproductCost;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public double getVAT() {
        return VAT;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductCode() {
        return  productCode;
    }
}
