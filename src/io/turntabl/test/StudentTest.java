package io.turntabl.test;

import io.turntabl.Student;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAverageGrade_whenListIsEmpty() {
        Student erbynn = new Student(Arrays.asList());
        Double result = erbynn.getAverageGrade();
//        Double result = myStudent.getAverageGrades(myStudent.getStudentsGrades());
        assertEquals(0.0, result);
    }

    @Test
    void getAverageGrade_whenOneGradeInList() {
        Student erbynn = new Student(Arrays.asList(88.5));
        Double result = erbynn.getAverageGrade();
//        Double result = myStudent.getAverageGrades(myStudent.getStudentsGrades());
        assertEquals(88.5, result);
    }

    @Test
    void getAverageGrade_whenOneGradeInListIsIncorrect() {
        Student erbynn = new Student(Arrays.asList(88.5));
        Double result = erbynn.getAverageGrade();
//        Double result = myStudent.getAverageGrades(myStudent.getStudentsGrades());
        assertNotEquals(88.6, result);
    }


    @Test
    void getAverageGrade_whenListNotEmpty() {
        Student erbynn = new Student(Arrays.asList(2.0,3.0,4.0));
        Double result = erbynn.getAverageGrade();
//        Double result = myStudent.getAverageGrades(myStudent.getStudentsGrades());
        assertEquals(3.0, result);
    }

}