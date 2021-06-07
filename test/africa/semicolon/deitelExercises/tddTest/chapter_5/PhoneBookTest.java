package africa.semicolon.deitelExercises.tddTest.chapter_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    @Test
    void setUp(){
        PhoneBook phoneBook = new PhoneBook();
    }
    @Test
    void addNameToPhoneBook(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.setName("John");
    }
    @Test
    void searchForAName(){
        PhoneBook phoneBook = new PhoneBook();
        //phoneBook.setName("John");
        //phoneBook.setName("Paul");
        //phoneBook.setName("Mark");
        phoneBook.setName("John:09078654321");
        phoneBook.setName("Paul:08056764534");
        phoneBook.setName("Mark:07076563452");
        assertEquals("Paul:08056764534",phoneBook.search("Paul") );
        assertEquals("Mark:07076563452",phoneBook.search("Mark") );
        assertEquals("John:09078654321", phoneBook.search("john"));
    }
    @Test
    void editAName(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.setName("John:09078654321");
        phoneBook.setName("Paul:08056764534");
        phoneBook.setName("Mark:07076563452");
        assertEquals("Stephen:07076563452",phoneBook.edit("MaRk", "Stephen"));
        assertEquals("Kanu:09078654321",phoneBook.edit("John", "Kanu"));
    }
    @Test
    void editNumber(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.setName("John:09078654321");
        phoneBook.setName("Paul:08056764534");
        phoneBook.setName("Mark:07076563452");
        assertEquals("Stephen:07076563452",phoneBook.edit("MaRk", "09056431265"));
        assertEquals("Kanu:09078654321",phoneBook.edit("John", "07156238909"));
    }
    @Test
    void eraseAName(){
        PhoneBook phoneBook = new PhoneBook();
        //phoneBook.setName("John");
        //phoneBook.setName("Paul");
        //phoneBook.setName("Mark");
        phoneBook.setName("John:09078654321");
        phoneBook.setName("Paul:08056764534");
        phoneBook.setName("Mark:07076563452");
        System.out.println(phoneBook.getname());
        assertEquals("John:09078654321 Paul:08056764534",phoneBook.erase("Mark",2) );
        assertEquals("Paul:08056764534 Mark:07076563452",phoneBook.erase("John",0) );
        assertEquals("John:09078654321 Mark:07076563452",phoneBook.erase("paul",1) );
    }
}
