package io.turntabl;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class Register {
    private List<Student> nameables;

    public Register(List<Student> nameables) {
        this.nameables = nameables;
    }

 /*   public List<String> getRegisterByName(){
        List<String> names = new ArrayList<>();
        for (Nameable name :
                nameables) {
            names.add(name.getName());
        }
        return names;
    }*/

    public List<String> getRegisterByName_withStreams() {
        List<String> names = nameables.stream().map(nameable -> nameable.getName()).collect(Collectors.toList());
        return names;
    }

    public Student getStudentByName_withException(Student student) throws StudentNotFoundException {
        var findStudent = this.nameables
                .stream()
                .filter(n -> n.getName().equals(student.getName()))
                .collect(Collectors.toList());
        if (findStudent.size() == 0) {
            throw new StudentNotFoundException();
        }
        return findStudent.get(0);
    }

/*    public List<String> getRegisterByLevel(Level level){
        List<String> stuLevel = new ArrayList<>();
        for (Nameable nameable :
                nameables) {
            if(nameable.getLevel().equals(level)){      // NB!
                stuLevel.add(nameable.getName());
            }
        }
        return stuLevel;
    }*/

   /* public List<String> getRegisterByLevel(Level level) {
        List<String> names = nameables.stream().filter(n -> n.getLevel() == Level.FIRST).map(n -> n.getName()).collect(Collectors.toList());
        return names;
    }*/

    public Map<Level, List<Student>> getRegisterByLevel2(Level level) {
        Map<Level, List<Student>> levelNames = new HashMap<>();
        List<Student> students = nameables
                .stream()
                .filter(n -> n.getLevel().equals(level))
                .collect(Collectors.toList());
        levelNames.put(level, students);
        return levelNames;
    }

/*    public String PrintReport() {
        if (this.nameables.size() == 1) {
            return this.nameables.get(0).getName();
        }
        return this.nameables.stream()
                .sorted(Comparator.comparing(Nameable::getLevel))
                .reduce("", (partialResult, nameable) -> partialResult + nameable.getName() + ", ", String::concat);

    }*/


/*
    public Optional<Student> getStudentByName(String name){
        Optional<Student> studentOptional = Optional.of("erbynn");
        if(studentOptional.isEmpty()){
            return Optional.of(Register::getStudentByName);
        }
    }
*/

}
