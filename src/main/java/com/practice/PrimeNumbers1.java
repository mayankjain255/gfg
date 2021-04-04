package com.practice;


/**
 * Property-1: Every prime number can be represented in the form of 6n+1 or 6n-1 except the prime number 2 & 3, where n is a natural number.
 */
public class PrimeNumbers1 {

  /**
   * @param totalNumbers
   */
  static void printAllPrimeNumbers1(int totalNumbers) {
    String primeNumbers = "";
    int[] allPossibleNumbers = new int[totalNumbers - 1];
    for (int i = 0; i < totalNumbers - 1; i++) {
      allPossibleNumbers[i] = i + 2;
    }

    for (int i = 0; i < totalNumbers - 1; i++) {
      if (allPossibleNumbers[i] != 0) {
        int currentNumber = i + 2;
        int counter = currentNumber;
        while ((currentNumber * counter) <= totalNumbers) {
          allPossibleNumbers[(currentNumber * counter) - 2] = 0;
          counter++;
        }
      }
    }
    for (int i = 0; i < allPossibleNumbers.length; i++) {
      if (allPossibleNumbers[i] != 0) {
        if (!primeNumbers.isEmpty()) {
          primeNumbers += ", ";
        }
        primeNumbers += allPossibleNumbers[i];
      }
    }
    System.out.println("Prime Numbers: : " + primeNumbers);
  }

  /**
   * This method identifies that given number is prime or not.
   *
   * @param number Number to be checked whether prime or not.
   * @return true if number is prime else false.
   */
  static boolean isPrimeNumber1(int number) {
    if (number == 2 || number == 3) {
      return true;
    }
    double value1 = ((double) number + 1) / 6;
    double value2 = ((double) number - 1) / 6;
    return value1 % 1 == 0 || value2 % 1 == 0;
  }

  static void m1(int val) {
    if (val >= 1) {
      val--;
      m1(val);
      System.out.println(val);
    }
  }

  static void m2(int val) {
    if (val >= 1) {
      System.out.println(val);
      val--;
      m2(val);
    }
  }

  static int method(int num) {
    System.out.println(num);
    if (num < 10) {

      return num;
    }
    int val = method(num / 10);
    return val + num;
  }

  public static void main(String[] args) {
//    System.out.println("Is 55 Prime Number: " + isPrimeNumber1(55));
//    System.out.println("Is 56 Prime Number: " + isPrimeNumber1(56));
//    System.out.println("Is 57 Prime Number: " + isPrimeNumber1(57));
//    System.out.println("Is 58 Prime Number: " + isPrimeNumber1(58));
//    System.out.println("Is 59 Prime Number: " + isPrimeNumber1(59));
//
//    printAllPrimeNumbers1(10);
//    printAllPrimeNumbers1(50);
//    printAllPrimeNumbers1(30);
//    printAllPrimeNumbers1(20);
//    printAllPrimeNumbers1(122);

//    m1(5);
//    m2(5);
//    System.out.println(method(121));

  }
}

