package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class BagOfLecturers {
    List<Lecture> lecturers = new ArrayList<>();

    public void add(Lecture lecture){
        this.lecturers.add(lecture);
    }

    public void remove(Lecture lecture){
        this.lecturers.remove(lecture);
    }

    public void clear(Lecture lecture){
        this.lecturers.clear();
    }
}
