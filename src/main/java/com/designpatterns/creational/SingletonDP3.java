package com.designpatterns.creational;


// Thread safe Lazy initialisation but it will lack in performance a bit because we've used synchronized block
public class SingletonDP3 {

  private static SingletonDP3 instance;

  private SingletonDP3() {
    // Private constructor so that no one can create object from outside.
  }

  public static synchronized SingletonDP3 getInstance() {
    if (instance == null) {
      instance = new SingletonDP3();
    }
    return instance;
  }

}
