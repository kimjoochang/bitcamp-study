package com.eomcs.design_pattern.ex01.after;

public class Test02 {

  public static void main(String[] args) {

    A a = new A();

    B b = new B(a);

    b.f1("홍길동");
  }
}
