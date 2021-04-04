package com.designpatterns.creational;


// Bill Pugh's approach, here we don't need anu synchronization with respect to thread safety. This is mot widely used approach to create Singleton
// class.
public class SingletonDP5 {

  private SingletonDP5() {
    // No one should be able to create object outside.
  }

  private static class SingletonInner {

    public static final SingletonDP5 instance = new SingletonDP5();
  }

  public static SingletonDP5 getInstance() {
    return SingletonInner.instance;
  }

}
