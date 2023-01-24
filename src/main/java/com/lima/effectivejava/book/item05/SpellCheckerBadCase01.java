package com.lima.effectivejava.book.item05;

import java.util.List;

public class SpellCheckerBadCase01 {
  // 정적 유틸리티를 잘못 하용한 예 - 유연하지 않고 테스트하기 어렵다.
  private static final Lexicon dictionary = new Lexicon();

  private SpellCheckerBadCase01() { // 객체 생성 방지

  }
  public static boolean isValid (String world) {
    return false;
  }

  public static List<String> suggestions(String typo) {
    return null;
  }
}
