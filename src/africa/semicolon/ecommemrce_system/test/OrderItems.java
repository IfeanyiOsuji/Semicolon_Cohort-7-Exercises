package africa.semicolon.ecommemrce_system.test;

public class OrderItems {
    private String orderITemID;
    private String productCode;
    private String orderCode;
    private int productQuantity;
    private double unitSalesPrice;

    public String getOrderITemID() {
        return orderITemID;
    }

    public void setOrderITemID(String orderITemID) {
        this.orderITemID = orderITemID;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getUnitSalesPrice() {
        return unitSalesPrice;
    }

    public void setUnitSalesPrice(double unitSalesPrice) {
        this.unitSalesPrice = unitSalesPrice;
    }

    public void setorderItemID(String orderItemID) {
        this.orderITemID = orderItemID;
    }
}
