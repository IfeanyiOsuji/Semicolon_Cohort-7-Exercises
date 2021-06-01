package africa.semicolon.deitelExercises.tddTest.chapter_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Gas Mileage")
public class GasMileageTest {

    @BeforeEach
    void setUp(){
        GasMileage gasMileage = new GasMileage();
    }
    @Test
    void testMethodToCalculateMilesPerGallon(){
        GasMileage gasMileage = new GasMileage();

        assertEquals(25.0, gasMileage.calculateGasPerGallon(500, 20));
    }
    @Test
    void showMilesPerGallonWhenMilesDrivenIs1000AndGallonUsedIs25(){
        GasMileage gasMileage = new GasMileage();
        assertEquals(40, gasMileage.calculateGasPerGallon(1000, 25));
    }
    @Test
    void showMilesPerGallonWhenMilesDrivenIs2000AndGallonUsedIs30(){
        GasMileage gasMileage = new GasMileage();
        assertEquals(66.66666666666667, gasMileage.calculateGasPerGallon(2000, 30));
    }
}
