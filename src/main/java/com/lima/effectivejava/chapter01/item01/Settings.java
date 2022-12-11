package com.lima.effectivejava.chapter01.item01;

public class Settings {
  private boolean userAutoSteering;
  private boolean useABS;
  private Difficulty difficulty;

  private Settings() {

  }

  private static final Settings SETTINGS = new Settings();

  // hash code 값이 동일해짐! 한개만 쓰고있음
  public static Settings newInstance() {
    return SETTINGS;
  }

  // 플라이 웨이트 패턴: 자주 사용하는 것들은 미리 만들어 놓고 가져다 쓰는 패턴

}
