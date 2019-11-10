package io.turntabl.test;

import io.turntabl.Level;
import io.turntabl.NameOrderer;
import io.turntabl.Register;
import io.turntabl.Student;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

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
    void getRegisterByLevel2_byKey() {
        List<Student> students =  Arrays.asList(
                new Student("erbynn", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("john", Level.SECOND, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("kwesi", Level.THIRD, Arrays.asList(50.0, 60.0, 70.0))
        );
        Register rg = new Register(students);

        Map<Level, List<Student>> levelAndTheirStudents = new HashMap<>();
        levelAndTheirStudents.put(Level.FIRST, students);

        assertEquals(levelAndTheirStudents.keySet(), rg.getRegisterByLevel2(Level.FIRST).keySet());
    }
@Test
    void getRegisterByLevel2_byValue() {
        List<Student> students =  Arrays.asList(
                new Student("erbynn", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("john", Level.SECOND, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("kwesi", Level.THIRD, Arrays.asList(50.0, 60.0, 70.0))
        );
        Register rg = new Register(students);

        Map<Level, List<Student>> levelAndTheirStudents = new HashMap<>();
        levelAndTheirStudents.put(Level.FIRST, students.stream().filter(s -> s.getLevel().equals(Level.FIRST)).collect(Collectors.toList()));

        assertEquals(levelAndTheirStudents.get(Level.FIRST), rg.getRegisterByLevel2(Level.FIRST).get(Level.FIRST));
    }

    @Test
    void getRegisterByLevel2_keyContain() {
        List<Student> students =  Arrays.asList(
                new Student("erbynn", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("john", Level.SECOND, Arrays.asList(50.0, 60.0, 70.0))
        );
        Register rg = new Register(students);

        Map<Level, List<Student>> levelAndTheirStudents = new HashMap<>();
        levelAndTheirStudents.put(Level.FIRST, students.stream().filter(s -> s.getLevel().equals(Level.FIRST)).collect(Collectors.toList()));
        assertTrue(levelAndTheirStudents.containsKey(Level.FIRST));
    }

    @Test
    void getRegisterSorted() {
        List<Student> students =  Arrays.asList(
                new Student("erbynn", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("john", Level.SECOND, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("kwesi", Level.THIRD, Arrays.asList(50.0, 60.0, 70.0))
        );
        Collections.sort(students, new NameOrderer());

//        not accepted
        System.out.println(students);
        for (Student stu :
                students) {
            System.out.println(stu.getName());
        }
    }



    @Test
    void printReport() {
    }
}