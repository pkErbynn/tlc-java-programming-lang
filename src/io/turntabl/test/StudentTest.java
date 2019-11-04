package io.turntabl.test;

import io.turntabl.Level;
import io.turntabl.Student;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAverageGrade_whenListIsEmpty() {
        Student erbynn = new Student("pk", Level.FIRST, Arrays.asList());
        Double actual = erbynn.getAverageGrade();
        assertEquals(0.0, actual);
    }

    @Test
    void getAverageGrade_whenOneGrade() {
        Student erbynn = new Student("erbynn", Level.FIRST, Arrays.asList(88.5));
        Double actual = erbynn.getAverageGrade();
        assertEquals(88.5, actual);
    }

    @Test
    void getAverageGrade_whenOneGradeIsIncorrect() {
        Student erbynn = new Student("erbynn", Level.SECOND, Arrays.asList(80.5));
        Double result = erbynn.getAverageGrade();
//        Double result = myStudent.getAverageGrades(myStudent.getStudentsGrades());
        assertNotEquals(80.0, result);
    }


    @Test
    void getAverageGrade_whenListNotEmpty() {
        Student erbynn = new Student("erbynn", Level.SECOND, Arrays.asList(50.0, 60.0, 70.0));
        Double actual = erbynn.getAverageGrade();
        assertEquals(60.0, actual);
    }

    @Test
    void getnametest() {
        Student erbynn = new Student("erbynn", Level.SECOND, Arrays.asList(50.0, 60.0, 70.0));
        String actual = erbynn.getName();
        assertEquals("erbynn", actual);
    }

@Test
    void getLevelTest() {
        Student erbynn = new Student("erbynn", Level.SECOND, Arrays.asList(50.0, 60.0, 70.0));
        assertNotEquals(Level.FIRST, erbynn.getLevel());
    }

}