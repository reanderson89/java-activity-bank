package oop_pie_a.zoo.solved;


import oop_pie_a.zoo.solved.bears.Bear;
import oop_pie_a.zoo.solved.bears.BlackBear;
import oop_pie_a.zoo.solved.bears.Panda;

import java.util.ArrayList;

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
        Panda hank = new Panda("bamboo", "hank");
        hank.makeSound();

        Panda po = new Panda("pot stickers", "Po");
        po.makeSound();
        po.checkForDragonWarrior();

        Bear yogi = new Bear("picnic baskets");
        addAnimalToZoo(hank);

    }
}
