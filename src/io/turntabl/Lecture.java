package io.turntabl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture {
    private List<Student> students = new ArrayList<>();

    public Lecture(List<Student> students) {
        this.students = students;
    }

    public void enter(Student student){
        this.students.add(student);
    }

    public double getHighestAverageGrade(){
        Student erbynn = new Student(Arrays.asList(1.0,2.0,3.0));
        double result1 = erbynn.getAverageGrade();

        Student pkay = new Student(Arrays.asList(4.0,5.0,6.0));
        double result2 = pkay.getAverageGrade();

        Double highestAverageGrade = 0.0;

        if(result1 > result2){
            highestAverageGrade = result1;
        }
        else{
            highestAverageGrade = result2;
        }

        return highestAverageGrade;
    }
}
