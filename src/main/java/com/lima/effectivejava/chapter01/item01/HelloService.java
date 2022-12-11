package com.lima.effectivejava.chapter01.item01;

public interface HelloService {

  String hello();

  // [1] 주석처리
  static HelloService of(String lang) {
    if (lang.equals("ko")) {
      return new KoreanHelloService();
    } else {
      return new EnglishHelloService();
    }
  }
  // [1] 정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다.
  // 질문3) enum의 값은 == 연산자로 동일성을 비교할 수 있는가?
  // => equals 보다는 == 을 권장함 NullPointException 을 피할 수 있음.
  // 과제) enum을 key로 사용하는 Map을 정의하세요. 또는 enum을 담고 있는 Set을 만들어 보세요
  // => EnumMap(Enum을 key로 같고있는) 과 EnumSet이 있음
}
