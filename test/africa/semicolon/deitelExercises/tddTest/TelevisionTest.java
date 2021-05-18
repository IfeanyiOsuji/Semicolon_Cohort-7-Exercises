package africa.semicolon.deitelExercises.tddTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    private Television television;
    @BeforeEach
    public void instanciateTelevisionObject(){
        television = new Television(120);
    }
    @Test
    public void checkThatTVHasManufaturerName(){
        assertEquals("LG", television.getManucturerName());
    }
    @Test
    public void checkThatTelevisionIspoweredOffByDefault(){
        assertFalse(television.powerOn());
    }
    @Test
    public void checkIftelevisionCanBePoweredOn(){
        television.power(true);
        assertTrue(television.powerOn());
    }
    @Test
    public void testThatManufacturerCanSetAndDisplayScreenSizeOfTelevidion(){
       //television.setScreenSize(120);
        assertEquals(120,  television.getScreenSize());
    }
    @Test
    public void checkThatUserCanSetAndDisplayChannel(){
        television.power(true);
        television.setChannel(33);
        assertEquals(33, television.getChannel());
    }
    @Test
    public void checkIfUserCanIncreaseChannel(){
        television.power(true);
        television.setChannel(33);
        television.displayNextChannel();
        assertEquals(34, television.getChannel());
        television.setChannel(150);
        television.displayNextChannel();
        assertEquals(150, television.getChannel());
    }
    @Test
    public void testIfUserCanReduceChannel(){
        television.power(true);
        television.setChannel(33);
        television.displayPreviousChannel();
        assertEquals(32, television.getChannel());
        television.setChannel(1);
        television.displayPreviousChannel();
        assertEquals(1, television.getChannel());
    }
    @Test
    public void testThatTelevisionHasADefaultChannel(){
        assertEquals(35, television.getChannel());
    }
    @Test
    public void checkThatUserCannotIncreaseChannelWhenPowerIsOff(){
        television.power(false);
        television.displayNextChannel();
        assertEquals(35, television.getChannel());
    }
    @Test
    public void checkThatUserCannotReduceChannelWhenPowerIsOff(){
        television.power(false);
        television.displayPreviousChannel();
        assertEquals(35, television.getChannel());
    }
    @Test
    public void testThatUserCannotSetChannelWhenTVIsOff(){
        television.setChannel(50);
        assertEquals(35, television.getChannel());
    }
    @Test
    public void testThatMinimumChannelMustBeOne(){
        television.power(true);
        television.setChannel(0);
        assertEquals(35, television.getChannel());
        television.setChannel(45);
        assertEquals(45, television.getChannel());
    }
    @Test
    public void testThatMaximumChannelMustBe150(){
        television.power(true);
        television.setChannel(151);
        assertEquals(35, television.getChannel());
    }
    @Test
    public void testThattelevisionHasDefaultVolume(){
        assertEquals(10, television.getVolume());
    }
    @Test
    public void testThatUserCanIncreaseVolumeBytwo(){
        television.increaseVolume();
        assertEquals(12,television.getVolume() );
    }
    @Test
    public void testThatUserCanReduceVolumeByTwo(){
        television.reduceVolume();
        assertEquals(8, television.getVolume());
    }
    @Test
    public void testThatTelevisionHasMinimumVolumeOftwo(){
        television.reduceVolume();
        television.reduceVolume();
        television.reduceVolume();
        television.reduceVolume();
        television.reduceVolume();
        assertEquals(2, television.getVolume());
    }
    @Test
    public void testThattelevisionHasMaximumVolumeOfFifty(){
        television.increaseVolume();//12
        television.increaseVolume();//14
        television.increaseVolume();//16
        television.increaseVolume();//18
        television.increaseVolume();//20
        television.increaseVolume();//22
        television.increaseVolume();//24
        television.increaseVolume();//26
        television.increaseVolume();//28
        television.increaseVolume();//30
        television.increaseVolume();//32
        television.increaseVolume();//34
        television.increaseVolume();//36
        television.increaseVolume();//38
        television.increaseVolume();//40
        television.increaseVolume();//42
        television.increaseVolume();//44
        television.increaseVolume();//46
        television.increaseVolume();//48
        television.increaseVolume();//50
        television.increaseVolume();//50
        assertEquals(50, television.getVolume());
    }
}
