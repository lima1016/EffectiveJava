package com.lima.effectivejava.chapter01.item01;

public class Order {
  private boolean prime;
  private boolean urgent;
  private Product product;

//  public Order(Product product, boolean urgent) {
//    this.urgent = urgent;
//    this.product = product;
//  }

  // 디자인 패턴의 팩터리 메소드나 추상 팩토리 메소드와는 다르다.
  public static Order primeOrder(Product product) {
    Order order = new Order();
    order.prime = true;
    order.product = product;
    return order;
  }

  public static Order primeUrgent(Product product) {
    Order order = new Order();
    order.urgent = true;
    order.product = product;
    return order;
  }
}
