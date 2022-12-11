package com.lima.effectivejava.chapter01.item01;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {
  // [1] 주석처리
//  public static HelloService of(String lang) {
//    if (lang.equals("ko")) {
//      return new KoreanHelloService();
//    } else {
//      return new EnglishHelloService();
//    }
//  }

  // [1] 정적 팩토리 메서드가 있는 상태일때 인터페이스ㅏㄴ 존재하면된다.
  public static void main(String[] args) {
    // KoreanHelloService 의존적이지 않음 import안해도됨
    ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
    Optional<HelloService> helloServiceOptional = loader.findFirst();
    helloServiceOptional.ifPresent(h -> System.out.println(h.hello()));

    // KoreanHelloService 의존적임 import해야함
    HelloService helloService = new KoreanHelloService();
    System.out.println(helloService.hello());
  }
}
