package io.turntabl;

import java.util.List;
import java.util.stream.Stream;

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
        for (double studentGrade :
                studentsGrades) {
            sum += studentGrade;
        }
        double avg = sum/studentsGrades.size();
        return avg;
    }

    @Override
    public String getName() {
        return this.name;
    }


    @Override
    public Level getLevel() {
        return this.studentLevel;
    }

//    public double getGrades(){
//        Stream<Double> grades = studentsGrades.stream().map(g -> g.)
//    }

}
