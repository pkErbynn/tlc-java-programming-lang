package io.turntabl;

import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(List<Double> studentsGrades) {
        super(studentsGrades);
    }

    @Override
    public double getAverageGrade() {
        double avg = super.getAverageGrade() + (super.getAverageGrade()*0.1);
        if(avg > 100){
            return avg;     // meaning 10% mark can not be added
        }
        return avg;
    }



}
