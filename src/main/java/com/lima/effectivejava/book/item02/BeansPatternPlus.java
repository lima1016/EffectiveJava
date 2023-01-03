package com.lima.effectivejava.book.item02;
// 빌더패턴 - 점층적 생성자 패턴과 자바 빈즈 패턴의 장점만 취했다.
public class BeansPatternPlus {
  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrate;

  public static class Builder {
    // 필수 매개 변수
    private final int servingSize;
    private final int servings;

    // 선택 매개변수
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }

    public Builder calories(int value) {
      calories = value;
      return this;
    }

    public Builder fat(int value) {
      fat = value;
      return this;
    }

    public Builder sodium(int value) {
      sodium = value;
      return this;
    }

    public Builder carbohydrate(int value) {
      carbohydrate = value;
      return this;
    }

    public BeansPatternPlus build() {
      return new BeansPatternPlus(this);
    }
  }

  private BeansPatternPlus(Builder builder) {
    servingSize = builder.servingSize;
    servings = builder.servings;
    calories = builder.calories;
    fat = builder.fat;
    sodium = builder.sodium;
    carbohydrate = builder.carbohydrate;
  }

}
