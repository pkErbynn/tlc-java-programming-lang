package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudent {
    List<Student> students = new ArrayList<>();

    public void add(Student stu){
        this.students.add(stu);
    }

    public void remove(Student stu){
        this.students.remove(stu);
    }

    public void clear(Student stu){
        this.students.removeAll(students);
    }
}
