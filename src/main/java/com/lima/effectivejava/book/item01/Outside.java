package com.lima.effectivejava.book.item01;
// 패키지가 다르다고 생각하자!
public class Outside {
  public void createWoman() {
    // 하위 타입 객체 반환!
    Person parson = Person.createWoman("earth");

    // 생성이 불가하다
//    Person parson = new Woman("earth");
  }
}