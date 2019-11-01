package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    List<T> bagList = new ArrayList<>();

    public void add(T a){
        this.bagList.add(a);
    }

    public void remove(T e){
        this.bagList.remove(e);
    }

    public void clear(){
        this.bagList.clear();
    }

}
