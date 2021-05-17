package africa.semicolon.ecommemrce_system.test;

import java.util.Date;

public class Product {
    private String productCode;
    private String productName;
    private double unitPrice;
    private String productDescription;
    private String productCategory;
    private String productCategoryCode;
    private int unitsInStock;
    private String dateManufactured;
    private String expiryDate;
   // private byte productPicture;

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return  productName;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategoryCode(String productCategoryCode) {
        this.productCategoryCode = productCategoryCode;
    }

    public String getProductCategoryCode() {
        return productCategoryCode;

    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public int getUnitsInStrock() {
        return unitsInStock;
    }

    public void setDateManufactured(String dateManufactured) {
        this.dateManufactured = dateManufactured;
    }

    public String getDateManufactured() {
        return dateManufactured;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return  expiryDate;
    }
}
