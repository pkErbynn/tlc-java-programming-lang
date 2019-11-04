package io.turntabl.test;

import io.turntabl.Level;
import io.turntabl.NaughtyStudent;
import io.turntabl.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    @Test
    void getAverageGrade_whenHackable() {
        NaughtyStudent papa = new NaughtyStudent("GEE", Level.FIRST, Arrays.asList(60.0, 70.0, 80.0));
        assertEquals(70.0 + (0.1 * 70.0), papa.getAverageGrade());
    }

    @Test
    void getAverageGrade_whenHackNotNecessary() {
        NaughtyStudent papa = new NaughtyStudent("GEE", Level.FIRST, Arrays.asList(95.0, 100.0, 100.0));
        assertEquals( (new Student("GEE", Level.FIRST, Arrays.asList(95.0, 100.0, 100.0))).getAverageGrade(), papa.getAverageGrade());
    }


}