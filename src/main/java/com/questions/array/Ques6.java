package com.questions.array;


import java.util.ArrayList;
import java.util.List;

import com.practice.Util;
import javafx.util.Pair;
import org.springframework.util.CollectionUtils;


// Find the Union and Intersection of the two sorted arrays.
public class Ques6 {

  static Pair<Integer, Integer> search(int[] arr, int low, int high, int element) {
    int mid = low + high / 2;
    while (low <= high) {
      mid = (low + high) / 2;
      if (low == high) {
        return new Pair<>(arr[low] == element ? low : -1, mid);
      }
      else if (arr[mid] == element) {
        return new Pair<>(mid, mid);
      }
      else if (arr[mid] > element) {
        high = mid - 1;
      }
      else {
        low = mid + 1;
      }
    }
    return new Pair<>(-1, mid);
  }

  static Pair<List<Integer>, List<Integer>> getUnionAndIntersection(int[] arr1, int[] arr2) {
    List<Integer> union = Util.getListFromArray(arr1);
    List<Integer> intersection = new ArrayList<>();
    int low = 0;
    int high = arr1.length - 1;
    if (arr2[0] > arr1[arr1.length - 1] || arr1[0] > arr2[arr2.length - 1]) {
      union.addAll(Util.getListFromArray(arr2));
    }
    else {
      for (int value : arr2) {
        Pair<Integer, Integer> indexAndMidPair = search(arr1, low, high, value);
        if (indexAndMidPair.getKey() != -1) {
          intersection.add(value);
        }
        else {
          union.add(value);
        }
        if (indexAndMidPair.getValue() >= arr1.length - 1) {
          break;
        }
        low = indexAndMidPair.getValue() + 1;
      }
    }
    return new Pair<>(union, intersection);
  }

  static Pair<List<Integer>, List<Integer>> getUnionAndIntersectionForDuplicates(int[] arr1, int[] arr2) {
    List<Integer> union = Util.getListFromSortedArray(arr1);
    List<Integer> intersection = new ArrayList<>();
    int low = 0;
    int high = arr1.length - 1;
    if (arr2[0] > arr1[arr1.length - 1] || arr1[0] > arr2[arr2.length - 1]) {
      union.addAll(Util.getListFromSortedArray(arr2));
    }
    else {
      for (int value : arr2) {
        Pair<Integer, Integer> indexAndMidPair = search(arr1, low, high, value);
        if (indexAndMidPair.getKey() != -1) {
          if (CollectionUtils.isEmpty(intersection) || intersection.get(intersection.size() - 1) != value) {
            intersection.add(value);
          }
        }
        else if (CollectionUtils.isEmpty(union) || union.get(union.size() - 1) != value) {
          union.add(value);
        }
        if (indexAndMidPair.getValue() >= arr1.length - 1) {
          break;
        }
        low = indexAndMidPair.getValue() + 1;
      }
    }
    return new Pair<>(union, intersection);
  }

  public static void main(String[] args) {
    int[] arr1 = {1, 2, 4, 7, 8, 10, 10, 10};
    int[] arr2 = {3, 10, 10, 11};
    Pair<List<Integer>, List<Integer>> result = getUnionAndIntersection(arr1.length > arr2.length ? arr1 : arr2, arr1.length > arr2.length ? arr2 :
                                                                                                                 arr1);
    Pair<List<Integer>, List<Integer>> result1 = getUnionAndIntersectionForDuplicates(arr1.length > arr2.length ? arr1 : arr2,
                                                                                      arr1.length > arr2.length ? arr2 : arr1);
    Util.printList(result1.getKey());
    System.out.println("----- ^ Union ^-----");
    System.out.println("----------------------------");
    System.out.println("---- Intersection ->  ---");
    Util.printList(result1.getValue());
    System.out.println();
    System.out.println("-----------------------------------------");
    System.out.println("---------By handling Duplicates----------");
    System.out.println("-----------------------------------------");
    System.out.println();
    Util.printList(result1.getKey());
    System.out.println("----- ^ Union ^ -----");
    System.out.println("----------------------------");
    System.out.println("---- Intersection -> ---");
    Util.printList(result1.getValue());
  }
}
