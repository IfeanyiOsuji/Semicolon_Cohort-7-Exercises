package africa.semicolon.deitelExercises.tddTest.chapter_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreditCardNumberValidationTest {
    CreditCardNumberValidation validation;
    @BeforeEach
    void setUp(){
        validation = new CreditCardNumberValidation();

    }
    @Test
    void testThatMethodReturnsANumberIfADigitOrSumOfDigitsIfMoreThanOne(){
        int number = validation.getDigit(12);
        assertEquals(3, number);
    }
    @Test
    void testThatLengthOfNumberIsReturned(){
        int length = CreditCardNumberValidation.getSize(2383736498467321l);
        assertEquals(16, length);
    }
    @Test
    void testToDoubleEverySecondDigitAndReturnValue(){
        int [] numbers = CreditCardNumberValidation.productOfSecondDigitsFromLeft(2383736498467321l);
       // assertEquals("", Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers));
    }
    @Test
    void testThatDoubleEvenPlacesCanBeSummed(){
        int number = CreditCardNumberValidation.sumOfDoubleEvenPlace(2383736498467321l);
        assertEquals(45, number);
    }
    @Test
    void testThatOddPlacesCanBeSummed(){
        int number = CreditCardNumberValidation.sumOfOddPlace(2383736498467321l);
        assertEquals(31, number);
    }
    @Test
    void testIfDigitIsAPrefixForNumber(){
       boolean isPrefix = CreditCardNumberValidation.prefixMatched(3783736498467321l, 37);
       assertTrue(isPrefix);
    }
    @Test
    void testToSumOddAndEvenPlaces(){
        int sum = CreditCardNumberValidation.addOddAndEvenPlaces(2383736498467321l);
            assertEquals(76, sum);
    }
    @Test
   void testIfCardNumberIsValid(){
        assertTrue(CreditCardNumberValidation.isValid(4388576018410707l));
    }
    @Test
    void testThatMethodCanGetPrefix(){
        assertEquals(778373, CreditCardNumberValidation.getPrefix(7783736498467321l, 6));
    }
}
