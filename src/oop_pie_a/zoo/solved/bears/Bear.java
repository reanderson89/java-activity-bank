package oop_pie_a.zoo.solved.bears;

import oop_pie_a.zoo.solved.Animal;

public class Bear extends Animal {
    boolean hasFur = true;
    String primaryDiet;

    public Bear( String primaryDiet) {
        super(true);
        this.primaryDiet = primaryDiet;
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }
}
