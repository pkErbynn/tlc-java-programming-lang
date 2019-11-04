package io.turntabl.substitability_test;

public class Animal {
    private String eat;
    private String sleep;

    public Animal(String eat, String sleep) {
        this.eat = eat;
        this.sleep = sleep;
    }

    public String getEat() {
        return eat;
    }

    public String getSleep() {
        return sleep;
    }


    public void printEat(Animal a){
        System.out.println(a.getEat());
    }
    public void printSleep(Animal a){
        System.out.println(a.getSleep());
    }
}
