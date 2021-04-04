package com.questions.searchandsort;


import javafx.util.Pair;


// Find the repeating and the missing
public class Ques7 {
// pair of missing Number and Repeated num

  // Source: gfg
  static Pair<Integer, Integer> method1(int[] arr) {
    int repeatedNumber = 0;
    int missed = 0;
    for (int i = 0; i < arr.length; i++) {
      int currIndex = Math.abs(arr[i]) - 1;
      if (arr[currIndex] > 0) {
        arr[currIndex] = -arr[currIndex];
      }
      else {
        repeatedNumber = Math.abs(arr[i]);
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        missed = i + 1;
      }
    }
    return new Pair<>(missed, repeatedNumber);
  }

  // Author: MJ
  static Pair<Integer, Integer> method2(int[] arr) {
    int repeatedNumber = 0;
    int expectedSum = (arr.length * (arr.length + 1)) / 2;
    int actualSum = 0;
    for (int value : arr) {
      actualSum += value;
    }
    int diff = expectedSum - actualSum;
    for (int i = 0; i < arr.length; i++) {
      int currIndex = Math.abs(arr[i]) - 1;
      if (arr[currIndex] > 0) {
        arr[currIndex] = -arr[currIndex];
      }
      else {
        repeatedNumber = Math.abs(arr[i]);
        break;
      }
    }

    return new Pair<>(repeatedNumber + diff, repeatedNumber);
  }

  static void checkAndPrintValues(int[] arr) {
    Pair<Integer, Integer> values = method1(arr);
    System.out.println("Missing Number: " + values.getKey() + " & Repeated Number: " + values.getValue());
  }

  public static void main(String[] args) {
    int[] arr1 = {2, 2};
    int[] arr2 = {1, 3, 3};
    int[] arr3 = {4, 3, 6, 2, 1, 1};
    int[] arr4 = {7, 3, 4, 5, 5, 6, 2};

    checkAndPrintValues(arr1);
    checkAndPrintValues(arr2);
    checkAndPrintValues(arr3);
    checkAndPrintValues(arr4);
  }

}
