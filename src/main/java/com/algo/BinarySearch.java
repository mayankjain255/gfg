package com.algo;


public class BinarySearch {

  static int search(int[] arr, int element) {
    int low = 0;
    int high = arr.length - 1;
    int mid = high / 2;
    while (low <= high) {
      mid = (low + high) / 2;
      if (low == high) {
        System.out.println("Mid in the last for element: " + element + " is mid: " + mid);
        return arr[low] == element ? low : -1;
      }
      else if (arr[mid] == element) {
        System.out.println("EQUAL Mid in the last for element: " + element + " is mid: " + mid);
        return mid;
      }
      else if (arr[mid] > element) {
        high = mid - 1;
      }
      else {
        low = mid + 1;
      }
    }
    System.out.println("END Mid in the last for element: " + element + " is mid: " + mid);
    return -1;
  }

  public static void main(String[] args) {
    int[] array = {1, 3, 5, 7, 9, 10, 12, 14, 16, 17, 19};
    System.out.println(search(array, 20));
    System.out.println(search(array, 19));
    System.out.println(search(array, 17));
    System.out.println(search(array, 18));
    System.out.println(search(array, 4));
    System.out.println(search(array, 5));
    System.out.println(search(array, 1));
    System.out.println(search(array, -11));
  }
}
