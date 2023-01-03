package com.lima.effectivejava.book.item01;

public interface Person {

  void printInfo();

  static Person createWoman(String name) {
    return new Woman(name);
  }
}
