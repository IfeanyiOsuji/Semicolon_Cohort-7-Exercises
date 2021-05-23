package africa.semicolon.deitelExercises.tddTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeTest {
    Grade grade;
    @BeforeEach
    public void initializeObjectGrade(){
        grade = new Grade();
    }
    @Test
    public void testTheVariousGradesInPrintAnotherGradeMethode(){
        assertEquals('A', grade.printAnotherGrade((short)90));
        assertEquals('A', grade.printAnotherGrade((short)100));
        assertEquals('B', grade.printAnotherGrade((short)89));
        assertEquals('B', grade.printAnotherGrade((short)85));
        assertEquals('B', grade.printAnotherGrade((short)80));
        assertEquals('C', grade.printAnotherGrade((short)79));
        assertEquals('C', grade.printAnotherGrade((short)74));
        assertEquals('C', grade.printAnotherGrade((short)70));
        assertEquals('D', grade.printAnotherGrade((short)69));
        assertEquals('D', grade.printAnotherGrade((short)63));
        assertEquals('D', grade.printAnotherGrade((short)60));
        assertEquals('F', grade.printAnotherGrade((short)59));
        assertEquals('F', grade.printAnotherGrade((short)40));
        assertEquals('F', grade.printAnotherGrade((short)10));
        assertEquals('F', grade.printAnotherGrade((short)0));
        assertEquals(' ', grade.printAnotherGrade((short)-1));
    }
    @Test
    public void testTheVariousGradesInPrintGradeMethode(){
        assertEquals('A', grade.printGrade((short)90));
        assertEquals('A', grade.printGrade((short)100));
        assertEquals('B', grade.printGrade((short)89));
        assertEquals('B', grade.printGrade((short)85));
        assertEquals('B', grade.printGrade((short)80));
        assertEquals('C', grade.printGrade((short)79));
        assertEquals('C', grade.printGrade((short)74));
        assertEquals('C', grade.printGrade((short)70));
        assertEquals('D', grade.printGrade((short)69));
        assertEquals('D', grade.printGrade((short)63));
        assertEquals('D', grade.printGrade((short)60));
        assertEquals('F', grade.printGrade((short)59));
        assertEquals('F', grade.printGrade((short)40));
        assertEquals('F', grade.printGrade((short)10));
        assertEquals('F', grade.printGrade((short)0));
        assertEquals(' ', grade.printGrade((short)-1));

    }

}
