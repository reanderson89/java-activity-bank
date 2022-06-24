package oop_pie_a.zoo;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    static ArrayList<Animal> allAnimals = new ArrayList<>();


    private static void addAnimalToZoo(Animal animal){
        if(animal instanceof Animal){
            allAnimals.add(animal);
            System.out.println("Your animal was successfully added to the Zoo");
        } else {
            System.out.println("They don't belong in the Zoo");
        }

    }


    public static void main(String[] args) {

    }
}
