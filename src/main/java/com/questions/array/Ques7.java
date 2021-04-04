package com.questions.array;


import com.practice.Util;


// Write a program to cyclically rotate an array by k time.
public class Ques7 {

  static void reverseArrayElements(int[] array, int low, int high) {
    int limit = (low + high) / 2;
    for (int i = low; i <= limit; i++) {
      Util.swapArrayElements(array, i, low + high - i);
    }
  }

  static void cyclicRotate(int[] array, int k) {
    k = k % array.length;
    reverseArrayElements(array, 0, array.length - 1);
    reverseArrayElements(array, 0, k - 1);
    reverseArrayElements(array, k, array.length - 1);
    Util.printArray(array);
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    cyclicRotate(arr, 3);
  }
}