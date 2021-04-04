package com.designpatterns.creational;


// Thread safe Lazy initialisation but we will apply double checking and sonar-lint blocker error will there coz its Non-compliant code.
public class SingletonDP4 {

  private static SingletonDP4 singletonDP4;

  private SingletonDP4() {

  }

  public static SingletonDP4 getInstance() {
    if (singletonDP4 == null) {
      synchronized (SingletonDP4.class) {
        if (singletonDP4 == null) {
          singletonDP4 = new SingletonDP4();
        }
      }
    }
    return singletonDP4;
  }

}
