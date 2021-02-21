package com.comp301.lec08;

// Person is an abstract class, so it can only be constructed through a concrete subclass
public abstract class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  // Person has an abstract getStatus() method
  public abstract String getStatus();
}
