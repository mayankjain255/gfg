package com.questions.array;


// Find the Union and Intersection of the two sorted arrays (Different approach using two pointers for both arrays
public class Ques6_Approach2 {

  // TODO
  static void unionAndIntersection(int[] array1, int[] array2) {
    int arr1Index = 0;
    int arr2Index = 0;
    while (arr1Index <= array1.length - 1 && arr2Index <= array2.length - 1) {
      if (arr1Index == array1.length - 1 || array1[arr1Index] > array2[arr2Index]) {
        System.out.println("Union element: " + array2[arr2Index]);
        arr2Index++;
      }
      else if (arr2Index == array2.length - 1 || array1[arr1Index] < array2[arr2Index]) {
        System.out.println("Union element: " + array1[arr1Index]);
        arr1Index++;
      }
      else if (array1[arr1Index] == array2[arr2Index]) {
        System.out.println("Union element: " + array1[arr1Index]);
        arr1Index++;
        arr2Index++;
      }
    }
    while (arr1Index <= array1.length - 1) {
      System.out.println("Union element: " + array1[arr1Index]);
      arr1Index++;
    }
    while (arr2Index <= array2.length - 1) {
      System.out.println("Union element: " + array2[arr2Index]);
      arr2Index++;
    }

  }

  public static void main(String[] args) {
    int[] array1 = {1, 4, 5, 7, 8, 9, 11, 99};
    int[] array2 = {1, 2, 3, 9, 10, 99};

    unionAndIntersection(array1, array2);
  }
}
