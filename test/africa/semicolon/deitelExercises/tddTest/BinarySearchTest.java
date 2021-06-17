package africa.semicolon.deitelExercises.tddTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    void setUp(){
        BinarySearch search = new BinarySearch();
    }
    @Test
    void searchKey(){
        int [] elementSearch = {2, 5, 10, 6, 12, 7, 15, 19};
        Arrays.sort(elementSearch);
        assertEquals(2, BinarySearch.searchKey(elementSearch, 6));
        assertEquals(0, BinarySearch.searchKey(elementSearch, 2));
        assertEquals(4, BinarySearch.searchKey(elementSearch, 10));
        assertEquals(7, BinarySearch.searchKey(elementSearch, 19));

    }
    @Test
    void insertKeyIfNotFound(){
        int [] elementSearch = {2, 5, 10, 6, 12, 7, 15, 19};
        Arrays.sort(elementSearch);
        assertEquals("[2, 3, 5, 6, 7, 10, 12, 15, 19]", BinarySearch.insertKeyIfNotFound(elementSearch, 3));
    }
}
