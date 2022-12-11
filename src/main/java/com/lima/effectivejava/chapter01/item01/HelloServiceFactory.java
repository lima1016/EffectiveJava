package com.lima.effectivejava.chapter01.item01;

public class HelloServiceFactory {
  public static HelloService of(String lang) {
    if (lang.equals("ko")) {
      return new KoreanHelloService();
    } else {
      return new EnglishHelloService();
    }
  }
}
