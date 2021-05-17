package africa.semicolon.ridehailing.test;

import org.junit.jupiter.api.Test;

import java.sql.Driver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DriverTest {
    CarDriver driver = new CarDriver();
    @Test
    public void testCarID(){
        driver.setCarID("");
        assertEquals("", driver.getCarID());
    }
    @Test
    public void testCarName(){
        driver.setCarName("");
        assertEquals("", driver.getCarName());
    }
    @Test
    public void testCarType(){
        driver.setCarType("");
        assertEquals("", driver.getCarType());
    }
    @Test
    public void testIfContractDriver(){
        driver.contractDriver();
    }
    @Test
    public void testRideRating(){
        driver.rateRide();
    }

}

