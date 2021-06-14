package africa.semicolon.deitelExercises.tddTest.chapter_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CryptographyTest {
    void setUp(){
        Cryptography cryptography = new Cryptography();
    }
    @Test
   void displayEncryptedData(){
        Cryptography cryptography = new Cryptography();
        assertEquals("****", cryptography.getEncryptedData(1927));
    }
}
