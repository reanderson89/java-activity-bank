# FizzBuzz coding challenge

* Given an integer n, return a string array answer (1-indexed) where:

- answer[i] == "FizzBuzz" if "i" is divisible by 3 and 5.
- answer[i] == "Fizz" if "i" is divisible by 3.
- answer[i] == "Buzz" if "i" is divisible by 5.
- answer[i] == i (as a string) if none of the above conditions are true.
  

* Example 1:
`Input: n = 3
Output: ["1","2","Fizz"]`

* Example 2:
`Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]`

* Example 3:
`Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]`

* You are given a method that creates an array of random integers from 1-100. Your fizzBuzz method is being called and is using the output of the fizzBuzzTest method for the argument. 
* You need to find a way to check each element in the array for the above cases and replace each instance with the appropriate values. 