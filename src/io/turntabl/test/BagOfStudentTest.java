package io.turntabl.test;

import io.turntabl.BagOfStudent;
import io.turntabl.Level;
import io.turntabl.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BagOfStudentTest {

    Student student = new Student("erbynn", Level.FOURTH, Arrays.asList(50.0, 60.0, 70.0, 80.0));
//    @Test

//    since add() does not return anything.....thus cant be tested
//    void add() {
//        BagOfStudent bagOfStudent = new BagOfStudent();
//        assertEquals(student, bagOfStudent.add(student));
//    }

    @Test
    void remove() {
    }

    @Test
    void clear() {
    }
}