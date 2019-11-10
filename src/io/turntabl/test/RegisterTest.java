package io.turntabl.test;

import io.turntabl.Level;
import io.turntabl.Register;
import io.turntabl.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegisterTest {

    @Test
    void getRegisterByName_optional() {
        Register rg = new Register(Arrays.asList(
                new Student("erbynn", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("john", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("kwesi", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("bin", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0))
        ));
        assertEquals(Arrays.asList("erbynn", "john", "kwesi", "bin"), rg.getRegisterByName());
    }

    @Test
    void getRegisterByName_singleName() {
        Register rg = new Register(Arrays.asList(
                new Student("erbynn", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0))));
        assertEquals(Arrays.asList("erbynn"), rg.getRegisterByName());
    }

    void getRegisterByName() {
        Register rg = new Register(Arrays.asList(
                new Student("erbynn", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("john", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("kwesi", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("bin", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0))
        ));
        assertEquals(Arrays.asList("erbynn", "john", "kwesi", "bin"), rg.getRegisterByName());
    }

//    @Test
//    void getRegisterByLevel() {
//        Register rg = new Register(Arrays.asList(
//                new Student("erbynn", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0)),
//                new Student("john", Level.SECOND, Arrays.asList(50.0, 60.0, 70.0)),
//                new Student("kwesi", Level.THIRD, Arrays.asList(50.0, 60.0, 70.0)),
//                new Student("bin", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0))
//        ));
//        assertEquals(Arrays.asList("erbynn", "bin") , rg.getRegisterByLevel(Level.FIRST));
//    }

    @Test
    void getRegisterByLevel() {
        List<Student> students =  Arrays.asList(
                new Student("erbynn", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("john", Level.SECOND, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("kwesi", Level.THIRD, Arrays.asList(50.0, 60.0, 70.0))
        );
        Register rg = new Register(students);
        Map<Level, List<Student>> levelStudents = new HashMap<>();

        levelStudents.put(Level.FIRST, students);
        System.out.println(levelStudents);
        assertEquals(levelStudents.get(Level.FIRST), rg.getRegisterByLevel2(Level.FIRST));
    }

    @Test
    void printReport() {
    }
}