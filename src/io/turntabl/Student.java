package io.turntabl;

import java.util.List;

public class Student implements Nameable, HasLevel{

    private String name;
    private Level studentLevel;
    private List<Double> studentsGrades;

    public Student( String name,  Level studentLevel, List<Double> studentsGrades) {
        this.name = name;
        this.studentLevel = studentLevel;
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

    @Override
    public String getName() {
        return this.name;
    }


    @Override
    public Level getLevel() {
        return this.studentLevel;
    }
}
