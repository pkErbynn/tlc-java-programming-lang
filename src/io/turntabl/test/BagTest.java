package io.turntabl.test;

import io.turntabl.Bag;
import io.turntabl.Level;
import io.turntabl.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {


    @Test
    void add() {
        Bag<Student> studentBag = new Bag<>();
        Student student = new Student(
                "erbyn",
                Level.FOURTH,
                Arrays.asList(80.0, 70.6)
        );
        studentBag.add(student);
        assertEquals(1, studentBag.size());
    }

    @Test
    void remove() {
        Bag<Student> studentBag = new Bag<>();
        Student student = new Student(
                "erbyn",
                Level.FOURTH,
                Arrays.asList(80.0, 70.6)
        );
        studentBag.add(student);
        studentBag.remove(student);
        assertEquals(0, studentBag.size());
    }

    @Test
    void clear() {
        Bag<Student> studentBag = new Bag<>();
        Student student = new Student(
                "erbyn",
                Level.FOURTH,
                Arrays.asList(80.0, 70.6)
        );
        studentBag.add(student);
        studentBag.clear();
        assertEquals(0, studentBag.size());

    }
}