package africa.semicolon.ecommemrce_system.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
private String productCategoryCode;
    private String productCategoryName;
    private String productCategoryDescription;
 */

public class ProductCategoryTest{
    ProductCategory productCategory = new ProductCategory();
    @Test
    public void testInstanceVariables(){
        productCategory.setProductCategoryName("Phones");
        assertEquals("Phones", productCategory.getProductCategoryName());
        productCategory.setProductCategoryCode("PH123");
        assertEquals("PH123", productCategory.getProductCategoryCode());
        productCategory.setProductCategoryDescription("12GB ram, 250 ROM");
        assertEquals("12GB ram, 250 ROM", productCategory.getProductCategoryDescription());

    }

}
