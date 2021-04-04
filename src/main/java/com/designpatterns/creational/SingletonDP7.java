package com.designpatterns.creational;


// Static Block
public class SingletonDP7 {

  private static SingletonDP7 singletonDP7;

  static {
    singletonDP7 = new SingletonDP7();
  }

  private SingletonDP7() {
    // No Constructor access to outside class
  }

  public static SingletonDP7 getInstance() {
    return singletonDP7;
  }

}
