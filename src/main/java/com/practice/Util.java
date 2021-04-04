package com.practice;


import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;


public class Util {

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.println(array[array.length - 1]);
  }

  public static void printList(List<?> array) {
    if (array.size() > 0) {
      for (int i = 0; i < array.size() - 1; i++) {
        System.out.print(array.get(i) + ", ");
      }
      System.out.println(array.get(array.size() - 1));
    }
    else {
      System.out.println("List is Empty");
    }
  }

  public static void swapArrayElements(int[] array, int firstValue, int secondIndex) {
    int temp = array[firstValue];
    array[firstValue] = array[secondIndex];
    array[secondIndex] = temp;
  }

  public static List<Integer> getListFromArray(int[] array) {
    List<Integer> list = new ArrayList<>();
    for (int element : array) {
      list.add(element);
    }
    return list;
  }

  public static List<Integer> getListFromSortedArray(int[] array) {
    List<Integer> list = new ArrayList<>();
    for (int element : array) {
      if (CollectionUtils.isEmpty(list) || element != list.get(list.size() - 1)) {
        list.add(element);
      }
    }
    return list;
  }
}
