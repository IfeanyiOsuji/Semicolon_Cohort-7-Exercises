package africa.semicolon.deitelExercises.tddTest.chapter_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TableOfBinaryOctalAndHexadecimalTest {
    void setUp() {
        TableOfBinaryOctalAndHexadecimal table = new TableOfBinaryOctalAndHexadecimal();
    }
    @Test
    void testForDecimalConversionToBinary(){
        //TableOfBinaryOctalAndHexadecimal table = new TableOfBinaryOctalAndHexadecimal();
        assertEquals("10", TableOfBinaryOctalAndHexadecimal.convertDecimalToBinaryOrOctal(2,2));
        assertEquals("1100100", TableOfBinaryOctalAndHexadecimal.convertDecimalToBinaryOrOctal(100,2));
        assertEquals("100000000", TableOfBinaryOctalAndHexadecimal.convertDecimalToBinaryOrOctal(256,2));
    }
    @Test
    void covertDecimalToOctalDecimal(){
        assertEquals("2", TableOfBinaryOctalAndHexadecimal.convertDecimalToBinaryOrOctal(2,8));
        assertEquals("7", TableOfBinaryOctalAndHexadecimal.convertDecimalToBinaryOrOctal(7,8));
        assertEquals("12", TableOfBinaryOctalAndHexadecimal.convertDecimalToBinaryOrOctal(10,8));
        assertEquals("144", TableOfBinaryOctalAndHexadecimal.convertDecimalToBinaryOrOctal(100,8));
        assertEquals("400", TableOfBinaryOctalAndHexadecimal.convertDecimalToBinaryOrOctal(256,8));
    }
    @Test
    void convertDecimalToHexadecimal(){
        assertEquals("2", TableOfBinaryOctalAndHexadecimal.convertDecimalToHexadecimal(2,16));
        assertEquals("7", TableOfBinaryOctalAndHexadecimal.convertDecimalToHexadecimal(7,16));
        assertEquals("A", TableOfBinaryOctalAndHexadecimal.convertDecimalToHexadecimal(10,16));
        assertEquals("64", TableOfBinaryOctalAndHexadecimal.convertDecimalToHexadecimal(100,16));
        assertEquals("96", TableOfBinaryOctalAndHexadecimal.convertDecimalToHexadecimal(150,16));
        assertEquals("AA", TableOfBinaryOctalAndHexadecimal.convertDecimalToHexadecimal(170,16));
        assertEquals("AB", TableOfBinaryOctalAndHexadecimal.convertDecimalToHexadecimal(171,16));
        assertEquals("AC", TableOfBinaryOctalAndHexadecimal.convertDecimalToHexadecimal(172,16));
        assertEquals("AD", TableOfBinaryOctalAndHexadecimal.convertDecimalToHexadecimal(173,16));
        assertEquals("AE", TableOfBinaryOctalAndHexadecimal.convertDecimalToHexadecimal(174,16));
        assertEquals("AF", TableOfBinaryOctalAndHexadecimal.convertDecimalToHexadecimal(175,16));
        assertEquals("100", TableOfBinaryOctalAndHexadecimal.convertDecimalToHexadecimal(256,16));
    }


}
