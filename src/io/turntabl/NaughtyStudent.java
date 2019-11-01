package io.turntabl;

import java.util.List;

public class NaughtyStudent extends Student {

    // building the super class
    public NaughtyStudent(String name, Level studentLevel, List<Double> studentsGrades) {
        super(name, studentLevel, studentsGrades);
    }

    @Override
    public double getAverageGrade() {
        double avg = super.getAverageGrade() ;
        double hackedAvg = avg + (0.1*avg);
        if(avg > 100.0){
            return avg;     // meaning 10% mark can not be added
        }
        return hackedAvg;
    }



}
