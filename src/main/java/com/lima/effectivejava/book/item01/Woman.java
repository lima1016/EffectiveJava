package com.lima.effectivejava.book.item01;

class Woman implements Person {

  String name;

  Woman(String name) {
    this.name = name;
  }

  @Override
  public void printInfo() {
    System.out.println(name);
  }
}