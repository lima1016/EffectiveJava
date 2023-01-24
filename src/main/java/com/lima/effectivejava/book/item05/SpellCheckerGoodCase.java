package com.lima.effectivejava.book.item05;

import java.util.List;
import java.util.Objects;

public class SpellCheckerGoodCase {
    private final Lexicon dictionary;

  private SpellCheckerGoodCase(Lexicon dictionary) {
    this.dictionary = Objects.requireNonNull(dictionary);
  }

  public boolean isValid (String world) {
    return false;
  }

  public List<String> suggestions(String typo) {
    return null;
  }
}
