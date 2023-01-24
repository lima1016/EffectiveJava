package com.lima.effectivejava.book.item05;

import java.util.List;

public class ShellCheckerBadCase02 {
  // 싱글턴을 잘못 사용한 예 - 유연하지 않고 테스트하기 어렵다.
  private static final Lexicon dictionary = new Lexicon();

  private ShellCheckerBadCase02() {

  }

  public static ShellCheckerBadCase02 INSTANCE = new ShellCheckerBadCase02();

  public boolean isValid (String world) {
    return false;
  }

  public List<String> suggestions(String typo) {
    return null;
  }
}
