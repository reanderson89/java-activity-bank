# FizzBuzz coding challenge

* Given an array of integers, swap the values based on the given conditions:

- testArray.get(i) == "FizzBuzz" if "i" is divisible by 3 and 5.
- testArray.get(i) == "Fizz" if "i" is divisible by 3.
- testArray.get(i) == "Buzz" if "i" is divisible by 5.
- testArray.get(i) == i (as a string) if none of the above conditions are true.
  

* Example 1:
`Input: [1,2,3]
Output: ["1","2","Fizz"]`

* Example 2:
`Input: [1,2,3,4,5]
Output: ["1","2","Fizz","4","Buzz"]`

* Example 3:
`Input: [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]`

* You are given a method that creates an array of random integers from 1-100. Your fizzBuzz method is being called and is using the output of the fizzBuzzTest method for the argument. 
* You need to find a way to check each element in the array for the above cases and replace each instance with the appropriate values. 
