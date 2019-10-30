package io.turntabl.test;

import io.turntabl.Student;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAverageGrade() {
        Student myStudent = new Student(Arrays.asList(2.0,3.0,4.0));
        Double result = Student.getAverageGrades(myStudent.getStudentsGrades());
//        Double result = myStudent.getAverageGrades(myStudent.getStudentsGrades());
        assertEquals(3, result);
    }
}