package io.turntabl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Register {
    private List<Student> nameables;

    public Register(List<Student> nameables) {
        this.nameables = nameables;
    }

    public List<String> getRegisterByName(){
        List<String> names = new ArrayList<>();
        for (Nameable name :
                nameables) {
            names.add(name.getName());
        }
        return names;
    }

    public List<String> getRegisterByLevel(Level level){
        List<String> names = new ArrayList<>();
        for (Nameable nameable :
                nameables) {
            if(nameable.getLevel()==level){
                names.add(nameable.getName());
            }
        }
        return names;
    }

    public String PrintReport(){
        if (this.nameables.size() == 1) {
            return this.nameables.get(0).getName();
        }
        return this.nameables.stream()
                .sorted(Comparator.comparing(Nameable::getLevel))
                .reduce("", (partialResult, nameable) -> partialResult + nameable.getName() + ", ", String::concat);

    }

}
