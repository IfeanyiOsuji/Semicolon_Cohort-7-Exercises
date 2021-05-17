package africa.semicolon.ecommemrce_system.test;

public class ProductCategory {
    private String productCategoryCode;
    private String productCategoryName;
    private String productCategoryDescription;

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryCode(String productCategoryCode) {
        this.productCategoryCode = productCategoryCode;
    }

    public String getProductCategoryCode() {
        return  productCategoryCode;
    }

    public void setProductCategoryDescription(String productCategoryDescription) {
        this.productCategoryDescription = productCategoryDescription;
    }

    public String getProductCategoryDescription() {
        return productCategoryDescription;
    }
}
