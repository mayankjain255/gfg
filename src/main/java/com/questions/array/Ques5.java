package com.questions.array;


import com.practice.Util;


// Move all negative numbers to beginning and positive to end with constant extra space
public class Ques5 {

  static void rearrangeElementsOne(int[] array) {
    int low = 0;
    int high = array.length - 1;
    for (int i = 0; i < array.length && i <= high; i++) {
      if (array[i] < 0) {
        Util.swapArrayElements(array, i, low);
        low++;
      }
      else {
        Util.swapArrayElements(array, i, high);
        i--;
        high--;
      }
    }
    Util.printArray(array);
  }

  static void rearrangeElementsSecond(int[] array) {
    int low = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        Util.swapArrayElements(array, i, low);
        low++;
      }
    }
    Util.printArray(array);
  }

  public static void main(String[] args) {
    int[] array = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
    rearrangeElementsOne(array);
    rearrangeElementsSecond(array);
  }

}
