package com.designpatterns.creational;


/**
 * Reference: https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 * <p>
 * Properties:
 * 1) Single object should be there in JVM for that particular class.
 * 2) Must have a global access point to get the instance of the class.
 * 3) Used for logging, drivers objects, caching and thread pool.
 * 4) Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.
 * 5) Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.
 * <p>
 * Points:
 * 1) Private constructor to restrict instantiation of the class from other classes.
 * 2) Private static variable of the same class that is the only instance of the class.
 * 3) Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the
 * singleton class.
 */
public class SingletonDP1 {

  private static SingletonDP1 singletonDP1;
  private int id;
  private String name;

  private SingletonDP1() {
    this.id = -1;
    this.name = null;
  }

  private SingletonDP1(int id, String name) {
    this.id = id;
    this.name = name;
  }

  // Lazy initialisation but not thread safe
  public static SingletonDP1 getInstanceOfSingleton() {
    if (singletonDP1 == null) {
      singletonDP1 = new SingletonDP1(1, "test");
    }
    return singletonDP1;
  }

  /*public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }*/
}

