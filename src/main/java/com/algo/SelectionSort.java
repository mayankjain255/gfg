package com.algo;


import com.practice.Util;


public class SelectionSort {

  static int getMinElement(int[] arr, int low, int high) {
    int min = Integer.MAX_VALUE;
    int minIndex = -1;
    for (int i = low; i <= high; i++) {
      if (min > arr[i]) {
        min = arr[i];
        minIndex = i;
      }
    }
    return minIndex;
  }

  static void sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      Util.swapArrayElements(arr, i, getMinElement(arr, i, arr.length - 1));
    }
  }

  public static void main(String[] args) {
    int[] arr = {64, 25, 12, 22, 11};
    sort(arr);
    Util.printArray(arr);
  }

}
