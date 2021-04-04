package com.designpatterns.creational;


// Eager Initialisation - Maybe we don't need the object but this will necessarily create object of this singleton class.
public class SingletonDP2 {

  private static final SingletonDP2 singletonDP2 = new SingletonDP2();

  private SingletonDP2() {
    // Private Constructor so that no can create object for this class.
  }

  public static SingletonDP2 getInstance() {
    return singletonDP2;
  }

}
