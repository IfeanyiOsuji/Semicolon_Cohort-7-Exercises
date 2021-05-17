package africa.semicolon.ridehailing.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapImplementationTest {
    MapImplementation mapImplementation = new MapImplementation();

    @Test
    public void testLocation(){
        mapImplementation.setLocation("");
        assertEquals("", mapImplementation.getLocation());
    }
}
