package com.questions.array;


public class Ques8 {

  static int getMaxSumOfSubarray(int[] arr) {
    int maxSum = arr[0];
    int currentSum = 0;
    for (int i = 0; i < arr.length; i++) {
      currentSum += arr[i];
      maxSum = Integer.max(currentSum, maxSum);
      if (currentSum < 0) {
        currentSum = 0;
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int[] array = {1, 2, 3, -3, -2, 6, -9, 9};
    int[] array1 = {1, 2, 3, -3, -2, 6, 3, -9, 9};
    int[] array2 = {-1, -2, -3, -4};
    System.out.println(getMaxSumOfSubarray(array));
    System.out.println(getMaxSumOfSubarray(array1));
    System.out.println(getMaxSumOfSubarray(array2));
  }

}
