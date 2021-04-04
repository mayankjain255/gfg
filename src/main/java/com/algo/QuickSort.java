package com.algo;


import com.practice.Util;


public class QuickSort {

  static int partition(int[] array, int low, int high) {
    int counterIndex = low;
    int smallNumberIndex = low - 1;
    int pivot = array[high];
    while (counterIndex <= high - 1) {
      if (array[counterIndex] < pivot) {
        smallNumberIndex++;
        Util.swapArrayElements(array, smallNumberIndex, counterIndex);
      }
      counterIndex++;
    }
    smallNumberIndex++;
    Util.swapArrayElements(array, smallNumberIndex, high);
    return smallNumberIndex;
  }

  /**
   * QuickSort Algo start
   *
   * @param array
   * @param low
   * @param high
   */
  static void quickSort(int[] array, int low, int high) {
    if (low < high) {
      int pivotIndex = partition(array, low, high);

      quickSort(array, low, pivotIndex - 1);
      quickSort(array, pivotIndex + 1, high);
    }
  }

  public static void sortArray(int[] array) {
    quickSort(array, 0, array.length - 1);
  }

  public static void main(String[] args) {
    int[] array = {1, 14, 13, 16, 5, 10, 19, 2};
    int[] array1 = {10, 12, 1, 2, 5, 19, 18, 11};
//    sortArray(array);
    sortArray(array1);
    Util.printArray(array);
    Util.printArray(array1);
  }
}
