// 변수 초기화 문장(variable initializer) - 인스턴스 초기화 블록과 필드 초기화, 생성자의 실행 순서
package com.eomcs.oop.ex03;

public class Exam0850 {

  static class A {

    int b = 200;
    int c;

    A() {


      System.out.println("A()");
    }

    // 인스턴스 초기화 블록(initializer block)
    {
      a = 111;
      System.out.println("초기화 블록 실행");
    }

    // 필드 초기화 문장(variable initializer)
    int a = 100;
  }

  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a = %d, b = %d, c = %d\n", obj1.a, obj1.b, obj1.c);
  }
}


