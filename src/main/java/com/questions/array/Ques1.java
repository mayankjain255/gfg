package com.questions.array;


import com.practice.Util;


// Reverse the array
public class Ques1 {


  private static void reverseNaive(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      Util.swapArrayElements(arr, i, arr.length - i - 1);
//            arr[i] += arr[arr.length - i - 1];
//            arr[arr.length - i - 1] = arr[i] - arr[arr.length - i - 1];
//            arr[i] -= arr[arr.length - i - 1];
    }
    Util.printArray(arr);
  }

  public static void main(String[] args) {
//    int[] arr = {1, 2, 3, 14, 15, 16, 17, 8, 9};
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    reverseNaive(arr);
  }

}
