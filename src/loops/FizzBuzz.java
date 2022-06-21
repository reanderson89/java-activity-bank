package loops;

import java.util.ArrayList;

public class FizzBuzz {
    public static ArrayList<Integer> fizzBuzzTest(int numOfInts){
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0; i <= numOfInts; i++) {
            int randomIntFromOneToOneHundred = (int)(Math.random() * (101 - 1) + 1);
            intArray.add(randomIntFromOneToOneHundred);
        }
        return intArray;
    }
//    your method needs to return all of the altered values from the incoming ArrayList in String format
    public static void fizzBuzz(ArrayList<Integer> testArray){
        System.out.println(testArray);
    }

    public static void main(String[] args) {
        ArrayList<Integer> testArray = fizzBuzzTest(30);
        fizzBuzz(testArray);
//        once your fizzbuzz() method returns something, uncomment the line below and run your application.
//        System.out.println(fizzBuzz(testArray));
    }

}
