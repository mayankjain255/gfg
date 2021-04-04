package com.questions.array;


// Minimise the maximum difference between heights [V.IMP]
public class Ques9 {

  static int minimizeMaxMinHeightDifference(int[] arr, int k) {
    // Case when all
    int diff = arr[arr.length - 1] - arr[0];

    int actualMax = Math.max((arr[0] + k), (arr[arr.length - 1] - k));
    int actualMin = Math.min((arr[0] + k), (arr[arr.length - 1] - k));
    int tempDiff = actualMax - actualMin;

//    tempDiff = Math.min(tempDiff, diff);
    for (int i = 1; i < arr.length - 1; i++) {
      int curMin = Math.min(arr[i] + k, arr[i] - k);
      int curMax = Math.max(arr[i] + k, arr[i] - k);
//      int curMax = arr[i] - k;

      if (curMin >= actualMin || curMax <= actualMax) {
        continue;
      }
      if (tempDiff > (actualMax - curMin)) {
        tempDiff = actualMax - curMin;
        actualMin = curMin;
      }
      else if (tempDiff > (curMax - actualMin)) {
        tempDiff = curMax - actualMin;
        actualMax = curMax;
      }
    }
    diff = Math.min(diff, tempDiff);
    return diff;
  }

  public static void main(String[] args) {
//    int arr[] = {1, 5, 8, 10};
//    int arr[] = {4, 5, 6, 7}; // 6, 7, 4, 5
//    int arr[] = {3, 9, 12, 16, 20};
//    int arr[] = {1, 1, 1, 1, 1};
//    int arr[] = {4, 5, 6, 6};
    int arr[] = {1, 2, 2, 4}; // 3, 4,4,2
    int k = 2;
    int ans = minimizeMaxMinHeightDifference(arr, k);
    System.out.println("Answer: " + ans);
  }
}
