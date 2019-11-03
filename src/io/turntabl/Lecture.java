package io.turntabl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture {
    private List<Student> students;

    public Lecture(List<Student> students) {
        this.students = students;
    }

    public void enter(Student student){
        this.students.add(student);
    }

    public double getHighestAverageGrade(){
        Double highestAverageGrade = 0.0;
        for (Student stu :
                students) {
            if(stu.getAverageGrade() > highestAverageGrade){
                highestAverageGrade = stu.getAverageGrade();
            }
        }
        return highestAverageGrade;
    }
}
