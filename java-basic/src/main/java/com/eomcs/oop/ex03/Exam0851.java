// 변수 초기화 문장(variable initializer) - 인스턴스 초기화 블록과 필드 초기화, 생성자의 실행 순서
package com.eomcs.oop.ex03;

public class Exam0851 {

  static class A {

    int b ;
    int c;
    int a;
    
    b =200;
    A() {
      

      System.out.println("A()");
    }

    int a = 100;

    {
      a = 111;
      System.out.println("초기화 블록 실행");
    }
  }

  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a = %d, b = %d, c = %d\n", obj1.a, obj1.b, obj1.c);
  }
}


