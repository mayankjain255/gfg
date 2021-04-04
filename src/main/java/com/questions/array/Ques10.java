package com.questions.array;


// Minimum number of jumps to reach end - https://www.geeksforgeeks.org/minimum-number-of-jumps-to-reach-end-of-a-given-array/
public class Ques10 {

  static int getMinNumberOfJumps(int[] arr) {
    if (arr[0] == 0) {
      return -1;
    }
    int currentMax = arr[0];
    int currentMaxIndex = 0;
    int index = 0;
    int currentLimit = arr[0];
    int numberOfJumps = 1;
    while (index < arr.length - 1) {
      // If we need to perform jump
      if (currentLimit > 0) {
        if (arr[index] != 0 && currentMax < (arr[index] + index)) {
          currentMax = (arr[index] + index);
          currentMaxIndex = index;
        }
        currentLimit--;
        index++;
      }
      // If we need to perform jump
      else if (currentLimit == 0) {
        index = currentMaxIndex + arr[currentMaxIndex];
        index = Math.min(index, arr.length - 1);
        if (arr[index] == 0) {
          return -1;
        }
        numberOfJumps++;
        currentMax = Integer.MIN_VALUE;
        currentMaxIndex = -1;
        currentLimit = arr[index];
      }
    }
    return numberOfJumps;
  }

  public static void main(String[] args) {
    int[] array = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
    int[] array1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    int[] array2 = {1, 2, 3, 4, 5};
    int[] array3 = {1, 3, 2, 1, 0, 2, 6, 7, 6, 8, 9};
    int[] array4 = {1, 3, 2, 1, 2, 2, 6, 7, 6, 8, 0};
    int[] array5 = {1};
    int[] array6 = {0, 5, 6};
    int[] array7 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0};
    int[] array8 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    int[] array9 = {1, 3, 5, 9, 7, 2, 6, 7, 6, 8, 9};


    System.out.println(getMinNumberOfJumps(array));
    System.out.println("----------------------------------");
    System.out.println(getMinNumberOfJumps(array1));
    System.out.println("----------------------------------");
    System.out.println(getMinNumberOfJumps(array2));
    System.out.println("----------------------------------");
    System.out.println(getMinNumberOfJumps(array3));
    System.out.println("----------------------------------");
    System.out.println(getMinNumberOfJumps(array4));
    System.out.println("----------------------------------");
    System.out.println(getMinNumberOfJumps(array5));
    System.out.println("----------------------------------");
    System.out.println(getMinNumberOfJumps(array6));
    System.out.println("----------------------------------");
    System.out.println(getMinNumberOfJumps(array7));
    System.out.println("----------------------------------");
    System.out.println(getMinNumberOfJumps(array8));
    System.out.println("----------------------------------");
    System.out.println(getMinNumberOfJumps(array9));
  }
}
