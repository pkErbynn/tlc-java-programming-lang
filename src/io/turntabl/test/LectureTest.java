package io.turntabl.test;

import io.turntabl.Lecture;
import io.turntabl.Level;
import io.turntabl.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

//    cannot write a test for this method cus it animic and does not return anything
//    @Test
//    void testenter() {
//
//    }

    @Test
    void getHighestAverageGrade() {
        List<Student> students = Arrays.asList(
                new Student("hot", Level.FIRST, Arrays.asList(3.0, 4.0, 5.0)),
                new Student("hot", Level.FIRST, Arrays.asList(4.0, 5.0, 6.0)),
                new Student("hot", Level.FIRST, Arrays.asList(3.0, 4.0, 5.0)),
                new Student("hot", Level.FIRST, Arrays.asList(3.0, 4.0, 5.0))
        );
        Lecture lt = new Lecture(students);
        assertEquals((new Student("hot", Level.FIRST, Arrays.asList(4.0, 5.0, 6.0)).getAverageGrade()), lt.getHighestAverageGrade());
    }
}