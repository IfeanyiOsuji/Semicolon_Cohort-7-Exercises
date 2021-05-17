package africa.semicolon.ecommemrce_system.test;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    public void testProductCreation(){
        Product product = new Product();
        product.setProductCode("DC123");
        assertEquals("DC123", product.getProductCode());

    }
    @Test
    public void testProductName(){
        Product product = new Product();
        product.setProductName("iPhone12");
        assertEquals("iPhone12", product.getProductName());
    }
    @Test
    public void testUnitPrice(){
        Product product = new Product();
        product.setUnitPrice(90000.00);
        assertEquals(90000.00, product.getUnitPrice());
    }
    @Test
    public void testProductDescription(){
        Product product = new Product();
        product.setProductDescription("cool, user friendly");
        assertEquals("cool, user friendly", product.getProductDescription());
    }
    @Test
    public void testProductCategory(){
        Product product = new Product();
        product.setProductCategory("Phones");
        assertEquals("Phones", product.getProductCategory());
    }
    @Test
    public void testProductCategoryCode(){
        Product product = new Product();
        product.setProductCategoryCode("IP2653");
        assertEquals("IP2653", product.getProductCategoryCode());
    }
    @Test
    public void testUnitsInStock(){
        Product product = new Product();
        product.setUnitsInStock(45);
        assertEquals(45, product.getUnitsInStrock());
    }
    @Test
    public void testDateManufactured(){
        Product product = new Product();
        product.setDateManufactured("5/5/2021");
        assertEquals("5/5/2021", product.getDateManufactured());
    }
    @Test
    public void testExpiryDate(){
        Product product = new Product();
        product.setExpiryDate("5/5/2021");
        assertEquals("5/5/2021", product.getExpiryDate());

    }
}
