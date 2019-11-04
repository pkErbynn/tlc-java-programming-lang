package io.turntabl.substitability_test;

import io.turntabl.substitability_test.Animal;
import io.turntabl.substitability_test.Cat;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("eat", "sleep");
        animal.printEat(animal);

        Animal c = new Cat("cat eats", "cat sleeps");
        c.printEat(c);
    }



}
