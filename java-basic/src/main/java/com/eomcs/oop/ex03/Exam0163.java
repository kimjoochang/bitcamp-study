// 클래스 변수의 응용 : 상수변수를 import하기
//

package com.eomcs.oop.ex03;

// 상수 변수를 같은 클래스의 멤버처럼 사용하고 싶다면,
// 즉 클래스 이름 없이 사용하고 싶다면,
// 상수 변수를 미리 import하여 컴퍼일러에게 그 소속을 알려줘라
import static com.eomcs.oop.ex03.Member.*;

public class Exam0163 {

  public static void main(String[] args) {

    // Member와 관련된 상수라면 
    // Member 클래스에 선언하는 것이 유지보수에 더 낫다.

    Member m4 = new Member();
    m4.id = "aaa";
    m4.password = "1111";
    m4.type = Member.GUEST;
    // 스태틱 변수는 변수명 앞에 클래스명을 명시해야 한다.

    Member m5 = new Member();
    m5.id = "bbb";
    m5.password = "1111";
    m5.type = Member.MANAGER;

    Member m6 = new Member();
    m6.id = "ccc";
    m6.password = "1111";
    m6.type = Member.MEMBER;
  }
}








