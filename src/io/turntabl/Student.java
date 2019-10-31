package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Double> studentsGrades;

    public Student(List<Double> studentsGrades) {
        this.studentsGrades = studentsGrades;
    }


    public double getAverageGrade(){
        if(studentsGrades.size() == 0){
            return 0.0;
        }
        double sum = 0.0;
        int count = 0;
        for (double studentGrade :
                studentsGrades) {
            count++;
            sum += studentGrade;
        }

        return (sum/count);
    }

}
