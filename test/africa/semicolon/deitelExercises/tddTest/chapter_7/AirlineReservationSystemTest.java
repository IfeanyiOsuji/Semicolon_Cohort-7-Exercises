package africa.semicolon.deitelExercises.tddTest.chapter_7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirlineReservationSystemTest {
    AirlineReservationSystem system;
    @BeforeEach
    void setUp(){
        system = new AirlineReservationSystem();
    }
    @Test
    void insertElementsToFirstClassListTest(){
        system.addFirstClassSeat(1);
        assertEquals(system.getFirstClass().get(0),1);
    }
    @Test
    void testThatListHasUniqueElements(){
        system.addFirstClassSeat(1);
        system.addFirstClassSeat(1);
        assertEquals("[1]", system.getFirstClass().toString());
    }
    @Test
    void testThatFirstClassPassengersCannotBeMoreThan5(){
        system.addFirstClassSeat(1);
        system.addFirstClassSeat(4);
        system.addFirstClassSeat(2);
        system.addFirstClassSeat(3);
        system.addFirstClassSeat(5);
        system.addFirstClassSeat(6);
        system.addFirstClassSeat(4);
        assertEquals("[1, 4, 2, 3, 5]", system.getFirstClass().toString());
    }
    @Test
    void insertElementsToEconomyListTest(){
        system.addEconomySeat(6);
        assertEquals(6,system.getEconomy().get(0));
    }
    @Test
    void testThatEconomyHasUniqueElements(){
        system.addEconomySeat(6);
        system.addEconomySeat(6);
        assertEquals("[6]", system.getEconomy().toString());
    }
    @Test
    void testThatEconomyPassengersCannotBeMoreThan5(){
        system.addEconomySeat(6);
        system.addEconomySeat(8);
        system.addEconomySeat(7);
        system.addEconomySeat(10);
        system.addEconomySeat(9);
        system.addEconomySeat(6);
        system.addEconomySeat(4);
        assertEquals("[6, 8, 7, 10, 9]", system.getEconomy().toString());
    }
}
