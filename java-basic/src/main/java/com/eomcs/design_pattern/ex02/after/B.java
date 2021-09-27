package com.eomcs.design_pattern.ex02.after;

public class B extends PlugIn {

  public B(Printer origin) {
    super(origin);
  }

  @Override
  public void f1(String name) {
    // 새 기능 추가
    // => 머리말을 출력하는 기능을 덧붙인다
    System.out.println("[머리말]---------");

    origin.f1(name);// 기존 기능은 그대로 수행
  }

}
