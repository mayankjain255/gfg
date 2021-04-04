package com.questions.searchandsort;


// Search in a rotated sorted array
public class Ques2 {

  /*static int getIndexByBinarySearch(int[] arr, int element, int low, int high) {

  }*/

  static int getRotationIndex(int[] arr, int element, int low, int high) {
    int index = -1;
    int mid = (low + high) / 2;
    if ((mid + 1) < arr.length && (mid - 1) >= 0 && arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
      index = mid;
    }
    else if (arr[mid] < arr[low] && arr[mid] > arr[high]) {
      index = getRotationIndex(arr, element, low, mid);
    }
    else if (arr[mid] > arr[high]) {
      index = getRotationIndex(arr, element, mid, high);
    }
    return index;
  }

  // TODO
  public static void main(String[] args) {
//    int[] arr = {4, 5, 6, 7, 0, 1, 2};
//    int[] arr = {4, 5, 6, 7, 8, 0, 1, 2, 3};
//    int[] arr = {8, 0, 1, 2, 3, 4, 5, 6, 7};
    int[] arr = {8, 7, 6, 5, 4, 3, 2, 1, 0};
    int index = getRotationIndex(arr, 0, 0, arr.length - 1);
    System.out.println("Index: " + index);
  }
}
