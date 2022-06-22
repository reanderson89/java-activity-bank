package loops.solved;

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
    public static ArrayList<String> fizzBuzz(ArrayList<Integer> testArray){
        ArrayList<String> fizzBuzzArr = new ArrayList<>();
        for (int currentNum : testArray) {
            if (currentNum % 3 == 0 && currentNum % 5 == 0) {
                fizzBuzzArr.add("FizzBuzz");
            } else if (currentNum % 3 == 0) {
                fizzBuzzArr.add("Fizz");
            } else if (currentNum % 5 == 0) {
                fizzBuzzArr.add("Buzz");
            } else {
                fizzBuzzArr.add(String.valueOf(currentNum));
            }

        }

//        for (int currentNum : testArray) {
//            if (currentNum % 3 == 0 && currentNum % 5 == 0) {
//                fizzBuzzArr.add("FizzBuzz");
//            } else if (currentNum % 5 == 0) {
//                fizzBuzzArr.add("Buzz");
//            } else if (currentNum % 3 == 0) {
//                fizzBuzzArr.add("Fizz");
//            } else {
//                fizzBuzzArr.add(String.valueOf(currentNum));
//            }
//        }
//
//        testArray.forEach(currentNum -> {
//            if (currentNum % 3 == 0 && currentNum % 5 == 0) {
//                fizzBuzzArr.add("FizzBuzz");
//            } else if (currentNum % 5 == 0) {
//                fizzBuzzArr.add("Buzz");
//            } else if (currentNum % 3 == 0) {
//                fizzBuzzArr.add("Fizz");
//            } else {
//                fizzBuzzArr.add(String.valueOf(currentNum));
//            }
//        });
        return fizzBuzzArr;

    }

    public static void main(String[] args) {
        ArrayList<Integer> testArray = fizzBuzzTest(30);

        System.out.println(testArray);
        System.out.println(fizzBuzz(testArray));

//        once your fizzbuzz() method returns something, uncomment the line below and run your application.
//        System.out.println(fizzBuzz(testArray));
    }

}
