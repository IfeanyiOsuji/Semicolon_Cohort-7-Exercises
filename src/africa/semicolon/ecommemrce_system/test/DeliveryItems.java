package africa.semicolon.ecommemrce_system.test;

public class DeliveryItems {
    private  String deliveryRef;
    private String orderItemID;

    public void setDeliveryRef(String deliveryItemsRef) {
        deliveryRef = deliveryItemsRef;
    }

    public String getDeliveryRef() {
        return deliveryRef;
    }

    public void setOrderItemID(String orderItemID) {
        this.orderItemID = orderItemID;
    }

    public String getOrderItemID() {
        return orderItemID;
    }
}
