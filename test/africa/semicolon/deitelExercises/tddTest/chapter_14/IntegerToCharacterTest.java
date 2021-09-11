package africa.semicolon.deitelExercises.tddTest.chapter_14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class IntegerToCharacterTest {
    @Test
    void setUp(){
        IntegerToCharacter character = new IntegerToCharacter();
        assertNotNull(character);
    }

}
