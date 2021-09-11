package africa.semicolon.estoreapp;

import africa.semicolon.ecommemrce_system.test.Product;

public class Items {
    private int productQuantity;
    private ItemProduct product;

    public Items(int productQuantity, ItemProduct product) {
        this.productQuantity = productQuantity;
        this.product = product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public ItemProduct getProduct() {
        return product;
    }

}
