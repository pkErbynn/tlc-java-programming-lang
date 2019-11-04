package io.turntabl;

import java.util.*;
import java.util.stream.Collectors;

public class Register {
    private List<Student> nameables;

    public Register(List<Student> nameables) {
        this.nameables = nameables;
    }

    // using for-each loop
    public List<String> getRegisterByName(){
        List<String> names = new ArrayList<>();
        for (Nameable name :
                nameables) {
            names.add(name.getName());
        }
        return names;
    }

//    using fxnal programming
//    public List<String> getRegisterByName() {
//        List<String> names = nameables.stream().map(nameable -> nameable.getName()).collect(Collectors.toList());
//        return names;
//    }


    // using for-each loop
//    public List<String> getRegisterByLevel(Level level){
//        List<String> stuLevel = new ArrayList<>();
//        for (Nameable nameable :
//                nameables) {
//            if(nameable.getLevel().equals(level)){      // NB!
//                stuLevel.add(nameable.getName());
//            }
//        }
//        return stuLevel;
//    }

    public Map<Level, List<Student>> getRegisterByLevel2(Level level){
        Map<Level, List<Student>> levelNames = new HashMap<>();
        List<Student> students = nameables
                .stream()
                .filter(n -> n.getLevel().equals(level))
                .collect(Collectors.toList());
        levelNames.put(level, students);
        return levelNames;
    }

//     using fxnal programming
//    public List<String> getRegisterByLevel(Level level){
//        List<String> names = nameables.stream().filter(n -> n.getLevel() == Level.FIRST).map(n -> n.getName()).collect(Collectors.toList());
//        return names;
//    }



    public String PrintReport(){
        if (this.nameables.size() == 1) {
            return this.nameables.get(0).getName();
        }
        return this.nameables.stream()
                .sorted(Comparator.comparing(Nameable::getLevel))
                .reduce("", (partialResult, nameable) -> partialResult + nameable.getName() + ", ", String::concat);

    }

//    public Optional<Student> getStudentByName(String name){
//        Optional<Student> studentOptional = Optional.empty();
//        if(studentOptional.isEmpty()){
////            return Optional.of(getRegisterByName("go"));
//        }
//    }

}
