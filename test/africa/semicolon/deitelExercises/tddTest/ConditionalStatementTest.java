package africa.semicolon.deitelExercises.tddTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionalStatementTest {
ConditionalStatement statement;
    @BeforeEach
    void setUp() {
        //given
        statement = new ConditionalStatement();
    }
    @AfterEach
    void tearDown() {
        statement = null;
    }
    @Test
    void findMaxOfTwoNumbersTest(){
        //when
        int firstNumber=23;
        int secondNumber=34;
        statement.checkMaxNumber(firstNumber, secondNumber);

        //assert
        assertEquals(34, statement.getMaxNumber());
    }

}