package oop_pie_a.zoo.solved.bears;


public class Panda extends Bear{
    String name;
    boolean knowsKungFu;

    public Panda(String primaryDiet, String name) {
        super(primaryDiet);
        this.name = name;
        this.knowsKungFu = name.equals("Po");
    }

    public void checkForDragonWarrior(){
        if(knowsKungFu){
            System.out.println(this.name + " is the Dragon Warrior!");
        } else {
            System.out.println(this.name + " is not the Dragon Warrior!");
        }
    }

    @Override
    public void makeSound() {
        if(knowsKungFu){
            System.out.println("Skadoosh!");
        } else{
            super.makeSound();
        }

    }
}
