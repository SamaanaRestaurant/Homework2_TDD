# Homework2_TDD
This repository contains a TDD Java project using junit 4.12 library.
# Project requirements
1. Create a class to test if a given number is a Fibonacci number
   - Name this class FibonacciTest
   - Create three methods to test 3rd, 5th and 8th Fibonacci numbers
2. Create a class that computes a Fibonacci number based on an index
   - Name this class Fibonacci
   - Implement both recursive and non-recursive methods 
   - Name the methods 'computeRecursive' and 'computeNonRecursive'
3. Recursion vs. Iteration 
   - Modify Fibonacci class by adding a main method 
   - In main() it will be displayed the execution time for both recursive and non-recursive methods
   - Use following flow (will be the same for non-recursive method)
     - int index = 30;
     - long start = System.currentTimeMillis();
     - double result = computeRecursively(index);
     - end = System.currentTimeMillis();
     - sout(“f(“ + index + ") = " + result + " : time = " + (end - start) + "ms");
     - (if index is too big try with smaller values)
     - (note that compute functions should be modified to be static in order to be called from main)
   - Which one is faster?
   - What happens when index = 50?
     - Think about possible explanations
   
**TDD class**
- Fibonacci
  - FibonacciTest
