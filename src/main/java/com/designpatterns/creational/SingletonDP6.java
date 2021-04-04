package com.designpatterns.creational;


// ENUM
public enum SingletonDP6 {

  INSTANCE(12, "Binod");

  private SingletonDP6(int id, String name) {
    //
  }


  public void performOperation() {
    System.out.println("Hello.........");
  }
}
