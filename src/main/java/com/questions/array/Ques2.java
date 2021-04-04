package com.questions.array;


import javafx.util.Pair;


// Maximum and minimum of an array using minimum number of comparisons
public class Ques2 {

  public static void naiveMaxMin(int[] arr) {
    if (arr.length < 1) {
      System.out.println("Array is empty");
      return;
    }
    int max = arr[0];
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      else if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("Maximum: " + max);
    System.out.println("Minimum: " + min);
  }

  public static Pair optimalMaxMin(int[] arr) {
    int index;
    int min;
    int max;
    if (arr.length % 2 == 0) {
      if (arr[0] > arr[1]) {
        max = arr[0];
        min = arr[1];
      }
      else {
        max = arr[1];
        min = arr[0];
      }
      index = 2;
    }
    else {
      max = arr[0];
      min = arr[0];
      index = 1;
    }

    while (index < arr.length - 1) {
      if (arr[index] > arr[index + 1]) {
        if (arr[index] > max) {
          max = arr[index];
        }
        if (arr[index + 1] < min) {
          min = arr[index + 1];
        }
      }
      else {
        if (arr[index + 1] > max) {
          max = arr[index + 1];
        }
        if (arr[index] < min) {
          min = arr[index];
        }
      }
      index += 2;
    }
    System.out.println("Maximum: " + max);
    System.out.println("Minimum: " + min);
    return new Pair(max, min);
  }

  public static void main(String[] args) {
    int[] arr = {12, 3131, 2345, 5432, 1, 1, 1, 1, 10, -0, 2345, -234, -2345};
    naiveMaxMin(arr);
    optimalMaxMin(arr);
  }
}
