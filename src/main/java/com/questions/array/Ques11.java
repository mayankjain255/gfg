package com.questions.array;


// Find the Duplicate Number
public class Ques11 {

  static int getDuplicateNumber(int[] arr) {
    int maxElement = arr.length - 1;
    int sum = (maxElement * (maxElement + 1)) / 2; //  Sum of n Natural Numbers
    int givenSum = 0;
    for (int i = 0; i < arr.length; i++) {
      givenSum += arr[i];
    }
    return givenSum - sum;
  }

  public static void main(String[] args) {
    int arr[] = {1, 3, 4, 2, 2};
    int[] arr1 = {3, 1, 3, 4, 2};
    System.out.println("Duplicate Element: " + getDuplicateNumber(arr1));
  }
}
