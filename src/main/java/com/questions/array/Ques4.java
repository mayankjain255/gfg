package com.questions.array;


import com.practice.Util;


// Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
public class Ques4 {

  static void sortElements(int[] array) {
    int low = 0;
    int high = array.length - 1;
    for (int i = 0; i < array.length && i <= high; i++) {
//      System.out.println("i: " + i + "-- Low: " + low + " -- high: " + high);
      switch (array[i]) {
        case 0:
          Util.swapArrayElements(array, i, low);
          low++;
          break;
        case 1:
          break;
        case 2:
          Util.swapArrayElements(array, i, high);
          high--;
          i--;
          break;
      }

    }
    Util.printArray(array);
  }

  public static void main(String[] args) {
    int[] array = {0, 0, 1, 1, 2, 0, 2, 1, 0, 2, 1, 1, 2, 0};
    sortElements(array);
  }
}

/*
0----Swap currentIndex<->low[low+1,mid+1]
1----[mid+1]
2----Swap currenindx<->high[high-1, i -1]
*/
