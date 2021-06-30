package com.eomcs.lang.ex02;

public class Exam0300 {
  public static void main(String[] args) {
    System.out.println("애노테이션");
  }


  //@Override
  public String toString2() {
    return "Exam12";
  }
}
/*error: method does not override or implement a method from a supertype
  @Override
  ^
1 error*/
// 오버라이딩이 작성되어있을 경우 규칙을 검사하지만 자식클래스을 재정의 한다고 오버라이딩을 검사하지않는다.