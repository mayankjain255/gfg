package com.questions.array;


import com.practice.Util;


// Find Kth smallest element ----- where K is smaller than size of array
public class Ques3 {

  static int partition(int[] array, int low, int high) {
    int pivot = array[high];
    int indexOfSmallerElement = low - 1;
    for (int i = low; i < high; i++) {
      if (array[i] < pivot) {
        indexOfSmallerElement++;
        Util.swapArrayElements(array, low, indexOfSmallerElement);
      }
    }
    // Increasing index by one to make indexOfSmallerElement to reach future valid posi of pivot
    indexOfSmallerElement++;

    // Swap Pivot with its calculated position in array.
    Util.swapArrayElements(array, indexOfSmallerElement, high);
    return indexOfSmallerElement;
  }

  static int getKthElement(int[] arr, int k, int low, int high) {
    int response = -1;
    if (low < high) {
      int indexOfPivot = partition(arr, low, high);
      if (indexOfPivot == k) {
        response = arr[indexOfPivot];
      }
      else if (indexOfPivot > k) {
        response = getKthElement(arr, k, low, indexOfPivot - 1);
      }
      else {
        response = getKthElement(arr, k, indexOfPivot + 1, high);
      }
    }
    return response;
  }

  static void kthSmallest(int[] arr, int k) {
    System.out.println(getKthElement(arr, k - 1, 0, arr.length - 1));
  }

  public static void main(String[] args) {
//    int[] arr = {12, 10, 5, 6, 0, 19, 21, 90, 123};
//    kthSmallest(arr, 4);
    int[] arr1 = {7, 10, 4, 3, 20, 15};
    kthSmallest(arr1, 2); // factor - 2, ep - 2
  }
}
//
//O(n) -----
//min = array[0] = 12;
//
//counter --
//TreeSet[kth] = {1,2,2}
