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

    public static void main(String[] args) {

    }

}
