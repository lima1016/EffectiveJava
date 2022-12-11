package com.lima.effectivejava.chapter01.item01;

import java.util.List;

/**
 * 이 클래스의 인스턴스는 #getInstance()를 사용함.
 */
public class Settings {
  private boolean userAutoSteering;
  private boolean useABS;
  private Difficulty difficulty;

  // private 쓰지않고 제공하는 경우도 있음.
  private Settings() {

  }

  private static final Settings SETTINGS = new Settings();

  // hash code 값이 동일해짐! 한개만 쓰고있음
  public static Settings getInstance() {
    return SETTINGS;
  }

  public static void main(String[] args) {
    // 정적 팩토리 메서드
    // 여러 매개변수를 받아 적합한 타입의 인스턴스를 반환하는 집계 메서드
  List.of("hello", "world");
  }
}
