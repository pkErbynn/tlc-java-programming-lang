package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Double> studentsGrades = new ArrayList<>();

    public Student(List<Double> studentsGrades) {
        this.studentsGrades = studentsGrades;
    }


    public List<Double> getStudentsGrades() {
        return studentsGrades;
    }

    public static Double getAverageGrades(List<Double> studentsGrades){
        double sum = 0.0;
        int count = 0;
        for (double studentGrade :
                studentsGrades) {
            count++;
            sum += studentGrade;
        }
        double average = (sum/count);
        return average;
    }

}
