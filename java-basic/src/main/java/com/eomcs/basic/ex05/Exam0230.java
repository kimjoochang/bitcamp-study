// Deque의 Iterator와 for(:)문
package com.eomcs.basic.ex05;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Exam0230 {

  public static void main(String[] args) {

    // Dequeue 인터페이스
    // - "Double ended que"의 약자이다.
    //   즉 앞, 뒤 모두 양방향에서 값을 넣고 꺼낼 수 있다.
    // - 그래서 큐로도 사용할 수 있고 스택으로도 사용할 수 있다.
    // - 큐, 스택 둘 다 사용할 수 있도록 que와 stack 사용법을 모두 정의한 인터페이스다.

    // 다음은 Deque 구현체 중의 하나이다.
    ArrayDeque<String> stack = new ArrayDeque<>();

    // 다음과 같이 스택으로서 사용할 수 있다.
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");


    // Stack 클래스와는 다르게
    // Deque 구현체에서 Iterator는 스택 방식(LIFO)으로 데이터를 꺼낸다.

    Iterator<String> iterator = stack.iterator();

    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    // 여기서 잠깐!
    // Iterator 설계 기법의 목적
    // - 컬렉션의 데이터 조회 방식(LIFO,FIFO)에 상관없이 
    //   일관된 방법으로 데이터를 조회할 수 있게 도와준다.
    // - 즉 스택처럼 입력 역순으로 꺼내든,
    //   큐처럼 입력 순으로 꺼내든 상관없이
    //   개발자는 hasNext(), Next() 라는 동일한 메서드를 사용하여 데이터를 조회한다.
  }

}

