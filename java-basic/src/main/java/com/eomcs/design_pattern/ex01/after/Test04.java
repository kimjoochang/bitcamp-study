package com.eomcs.design_pattern.ex01.after;

public class Test04 {

  public static void main(String[] args) {
    A a = new A();

    //    B b = new B(a);

    C c = new C(b);

    c.f1("홍길동");
  }
}
