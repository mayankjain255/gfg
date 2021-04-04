package com.questions.searchandsort;


// Find first and last positions of an element in a sorted array
public class Ques1 {

  static int min = Integer.MAX_VALUE;
  static int max = Integer.MIN_VALUE;

  static void updateMinMaxIndex(int currMin, int currMax) {
    min = Math.min(min, currMin);
    max = Math.max(max, currMax);
  }

  static void search(int[] arr, int element, int low, int high) {
    int mid = (low + high) / 2;
    if (low <= high) {
      if (arr[mid] == element) {
        updateMinMaxIndex(mid, mid);
        if (mid - 1 >= 0 && arr[mid - 1] == element) {
          updateMinMaxIndex(mid - 1, mid);
          search(arr, element, low, mid - 1);
        }
        if (mid + 1 < arr.length && arr[mid + 1] == element) {
          updateMinMaxIndex(mid + 1, mid);
          search(arr, element, mid + 1, high);
        }
      }
      else if (arr[mid] > element) {
        search(arr, element, low, mid - 1);
      }
      else {
        search(arr, element, mid + 1, high);
      }
    }
  }

  static void getStartAndLastPosition(int[] array, int element) {
    search(array, element, 0, array.length - 1);
  }

  public static void main(String[] args) {
//    int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125, 127};
    int[] arr = {3, 4, 5, 5, 5, 5, 5};
    getStartAndLastPosition(arr, 4);
    System.out.println("Low Index: " + min);
    System.out.println("high Index: " + max);
  }
}
