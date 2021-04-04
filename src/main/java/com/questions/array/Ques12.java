package com.questions.array;


// Merge 2 sorted arrays without using Extra space.
public class Ques12 {

  static int[] array1 = {1, 12, 14, 16};
  static int[] array2 = {9, 19, 2, 3, 7, 11};

  static int getIndexByVirtualIndex(int virtualIndex) {
    if (virtualIndex > array1.length - 1) {
      return virtualIndex - array1.length - 1;
    }
    return virtualIndex;
  }

  static int getValueByVirtualIndex(int virtualIndex) {
    if (virtualIndex > array1.length - 1) {
      return array2[virtualIndex - array1.length - 1];
    }
    return array1[virtualIndex];
  }

  static void setValueByVirtualIndex(int virtualIndex, int value) {
    if (virtualIndex > array1.length - 1) {
      array2[virtualIndex - array1.length - 1] = value;
    }
    array1[virtualIndex] = value;
  }

  static void mergeSort() {

  }

  static void mergeSortedArrays(int[] array1, int[] array2) {

  }

  public static void main(String[] args) {

    mergeSortedArrays(array1, array2);
  }
}
