package com.eomcs.design_pattern.ex02.after;

public class Test03 {

  public static void main(String[] args) {
    A a = new A();

    B b = new B(a);

    C c = new C(b);

    c.f1("홍길동");
  }
}
