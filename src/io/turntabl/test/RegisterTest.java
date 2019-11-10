package io.turntabl.test;

import io.turntabl.*;
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
        assertEquals(Arrays.asList("erbynn", "john", "kwesi", "bin"), rg.getRegisterByName_withStreams());
    }

    @Test
    void getRegisterByName_singleName() {
        Register rg = new Register(Arrays.asList(
                new Student("erbynn", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0))));
        assertEquals(Arrays.asList("erbynn"), rg.getRegisterByName_withStreams());
    }

    @Test
    void getRegisterByName() {
        Register rg = new Register(Arrays.asList(
                new Student("erbynn", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("john", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("kwesi", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0)),
                new Student("bin", Level.FIRST, Arrays.asList(50.0, 60.0, 70.0))
        ));
        assertEquals(Arrays.asList("erbynn", "john", "kwesi", "bin"), rg.getRegisterByName_withStreams());
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
    public void getStudentByName_withExceptionTest() throws StudentNotFoundException {
        Student ampadu = new Student("erbynn", Level.FOURTH, Arrays.asList(20.0, 30.0, 40.0));
        Register register = new Register(Arrays.asList(
                new Student("raph", Level.SECOND, Arrays.asList(80.5, 90.0)),
                new Student("Margaret", Level.FOURTH, Arrays.asList(90.5, 95.8)),
                new Student("Anthoy", Level.FIRST, Arrays.asList(70.0, 99.8))
        ));
        assertThrows(StudentNotFoundException.class, () -> register.getStudentByName_withException(ampadu));
    }



    @Test
    void printReport() {
    }
}