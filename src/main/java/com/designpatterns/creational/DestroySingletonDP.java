package com.designpatterns.creational;


import java.lang.reflect.Constructor;


public class DestroySingletonDP {

  public static void main(String[] args) {
    SingletonDP2 singletonDP1 = SingletonDP2.getInstance();
    SingletonDP2 singletonObj2 = null;
    try {
      Constructor[] constructors = SingletonDP2.class.getDeclaredConstructors();
      for (Constructor constructor : constructors) {
        constructor.setAccessible(true);
        singletonObj2 = (SingletonDP2) constructor.newInstance();
        break;
      }
    }
    catch (Exception e) {
      e.getStackTrace();
    }
    System.out.println("First Object hashcode:" + singletonDP1);
    System.out.println("Second Object hashcode:" + singletonObj2);
  }
}
