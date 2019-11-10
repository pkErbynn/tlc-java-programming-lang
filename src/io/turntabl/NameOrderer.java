package io.turntabl;

import java.util.Comparator;

public class NameOrderer implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student1.getName());
    }
}
