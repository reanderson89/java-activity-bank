package oop_pie_a.interface_activity;

public interface Animal {
    String finalAndStatic = "Attributes can be created for the interface. These attributes are inherited by the Class and not an instance of it (object). They are implicitly public, final, and static";

//    all methods are implicitly abstract(unless deemed default) and public
//    should return a string of what the animal is eating.
    String eat();


//    should print out that the animal is sleeping
    void sleep();


//    should return the weight of the animal in pounds
    double getWeightInLbs();

//    This is a default method that we can pass to all classes that implement this interface
    default double convertWeightToKgs(double weightInLbs){
        return weightInLbs*2.2;
    }

}
