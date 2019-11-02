package io.turntabl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Register {
    private List<Student> nameables;

    public Register(List<Student> nameables) {
        this.nameables = nameables;
    }

//    public List<String> getRegisterByName(){
//        List<String> names = new ArrayList<>();
//        for (Nameable name :
//                nameables) {
//            names.add(name.getName());
//        }
//        return names;
//    }


    public List<String> getRegisterByName() {
        List<String> names = nameables.stream().map(nameable -> nameable.getName()).collect(Collectors.toList());
        return names;
    }

//    public List<String> getRegisterByLevel(Level level){
//        List<String> stuLevel = new ArrayList<>();
//        for (Nameable nameable :
//                nameables) {
//            if(nameable.getLevel()==level){
//                stuLevel.add(nameable.getLevel().name());
//            }
//        }
//        return stuLevel;
//    }


    public List<String> getRegisterByLevel(Level level){
        List<String> names = nameables.stream().filter(n -> n.getLevel() == Level.FIRST).map(n -> n.getName()).collect(Collectors.toList());
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

//    public Optional<Student> getStudentByName(String name){
//        Optional<Student> studentOptional = Optional.empty();
//        if(studentOptional.isEmpty()){
////            return Optional.of(getRegisterByName("go"));
//        }
//    }

}
