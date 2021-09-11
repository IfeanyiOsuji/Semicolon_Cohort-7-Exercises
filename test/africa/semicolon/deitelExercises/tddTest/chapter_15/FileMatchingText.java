package africa.semicolon.deitelExercises.tddTest.chapter_15;

import africa.semicolon.deitelExercises.tddTest.chapter_14.FileMatching;
import africa.semicolon.deitelExercises.tddTest.chapter_14.TransactionRecord;
import africa.semicolon.deitel_example_practice.SerializableAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FileMatchingText {
    @Test
    void setUp(){
        FileMatching matching = new FileMatching();
        assertNotNull(matching);
    }
    @Test
    void testThatTransactionRecordClassExists(){
        TransactionRecord record = new TransactionRecord();
        assertNotNull(record);
    }
    @Test
    void testThatTransactionRecordHasAccountNumber(){
        TransactionRecord record = new TransactionRecord();
        record.setAccountNumber(100);
        assertEquals(100, record.getAccountNumber());
    }
    @Test
    void testThatTransactionRecordHasAmount(){
        TransactionRecord record = new TransactionRecord();
        record.setAmount(200.50);
        assertEquals(200.50, record.getAmount());
    }
    @Test
    void testThatSerializableAccountCanCombineTwoDifferentAmounts(){
        SerializableAccount account = new SerializableAccount();
        TransactionRecord record = new TransactionRecord();
        record.setAmount(5000.00);
        account.combine(record);
    }
    @Test
    void testThatMasterRecordFileExists(){

    }
}
