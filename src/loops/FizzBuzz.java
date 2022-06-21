package loops;

import java.util.ArrayList;

public class FizzBuzz {
//    this method just produces an array of random integers from 1-100. You do not need to change this.
    public static ArrayList<Integer> fizzBuzzTest(int numOfInts){
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0; i <= numOfInts; i++) {
            int randomIntFromOneToOneHundred = (int)(Math.random() * (101 - 1) + 1);
            intArray.add(randomIntFromOneToOneHundred);
        }
        return intArray;
    }
//    ALL OF YOUR WORK WILL BE DONE IN THE fizzBuzz() METHOD.
//    your method needs to return all of the altered values from the incoming ArrayList in String format
    public static void fizzBuzz(ArrayList<Integer> testArray){
        System.out.println(testArray);
    }

    public static void main(String[] args) {
        ArrayList<Integer> testArray = fizzBuzzTest(10);
        fizzBuzz(testArray);
//        once your fizzbuzz() method returns something, uncomment the line below and run your application.
//        System.out.println(fizzBuzz(testArray));
    }

}
