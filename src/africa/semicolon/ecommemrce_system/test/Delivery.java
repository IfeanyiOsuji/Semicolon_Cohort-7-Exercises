package africa.semicolon.ecommemrce_system.test;

public class Delivery {
    private String deliveryRef;
    private String orderID;
    private int trackingNumber;
    private String dateShipped;
    private String dateDelivered;
    private String deliveryDetails;

    public void setDeliveryRef(String deliveryRef) {
        this.deliveryRef = deliveryRef;
    }

    public String getDeliveryRef() {
        return deliveryRef;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setTrackingNumber(int trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public int getTrackingNumber() {
        return trackingNumber;
    }

    public void setDateShipped(String dateShipped) {
        this.dateShipped = dateShipped;
    }

    public String getDateShipped() {
        return dateShipped;
    }

    public void setDateDelivered(String dateDelivered) {
        this.dateDelivered = dateDelivered;
    }

    public String getDateDelivered() {
        return dateDelivered;
    }

    public void setDeliveryDetails(String deliveryDetails) {
        this.deliveryDetails = deliveryDetails;
    }

    public String getDeliveryDetails() {
        return deliveryDetails;
    }
}
