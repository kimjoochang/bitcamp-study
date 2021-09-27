package com.eomcs.design_pattern.ex02.after;

public class C extends PlugIn {

  public C(Printer origin) {
    super(origin);
  }

  @Override
  public void f1(String name) {
    origin.f1(name);

    System.out.println("**********************[끝]");
  }
}
