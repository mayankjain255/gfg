package com.practice.recursion;


import java.util.ArrayList;
import java.util.List;


public class PrimeNumberIdentifier {

  private static boolean isPrimeNumber(int counter, int number) {
    if (counter >= number) {
      return true;
    }
    int remainder = number % counter;
    counter++;
    boolean result = false;
    if (remainder != 0 && isPrimeNumber(counter, number)) {
      result = true;
    }
    return result;
  }

  /**
   * This method shares that given number is prime or not. Approach used is naive approach.
   *
   * @param number
   * @return
   */
  static boolean checkPrimeNumber(int number) {
    if (number < 2) {
      throw new IllegalArgumentException("Invalid Input number");
    }
    return isPrimeNumber(2, number);
  }

  /**
   * This method returns all prime number till the number taken as argument.
   *
   * @param number
   * @return
   */
  static List<Integer> getAllPrimeNumbers(int number) {
    List<Integer> primeNumbers = new ArrayList<>();
    for (int i = 2; i <= number; i++) {
      if (checkPrimeNumber(i)) {
        primeNumbers.add(i);
      }
    }
    return primeNumbers;
  }

  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 65;
    int num3 = 67;
    int num4 = 121;
    int num5 = 131;
    boolean isNum1Prime = checkPrimeNumber(num1);
    boolean isNum2Prime = checkPrimeNumber(num2);
    boolean isNum3Prime = checkPrimeNumber(num3);
    boolean isNum4Prime = checkPrimeNumber(num4);
    boolean isNum5Prime = checkPrimeNumber(num5);
    System.out.println("Check on " + num1 + ", Ans: " + isNum1Prime);
    System.out.println("Check on " + num2 + ", Ans: " + isNum2Prime);
    System.out.println("Check on " + num3 + ", Ans: " + isNum3Prime);
    System.out.println("Check on " + num4 + ", Ans: " + isNum4Prime);
    System.out.println("Check on " + num5 + ", Ans: " + isNum5Prime);


    System.out.println(getAllPrimeNumbers(131));
  }
}
