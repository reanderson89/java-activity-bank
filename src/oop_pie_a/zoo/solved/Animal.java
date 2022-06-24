package oop_pie_a.zoo.solved;

public class Animal {
    boolean isHungry = true;
    boolean isTired = false;
    boolean isWarmBlooded;

    public Animal(boolean isWarmBlooded) {
        this.isWarmBlooded = isWarmBlooded;
    }

    public void eat(){
        if(isHungry){
            System.out.println("Time to eat!");
            this.isHungry = false;
            this.isTired = true;
        }
    }
    public void sleep(){
        if(isTired){
            System.out.println("Time to sleep!");
            this.isHungry = true;
            this.isTired = false;
        }
    }
//
    public void makeSound(){
        System.out.println("This should print a sound more accurate to each specific animal");
    }
}
