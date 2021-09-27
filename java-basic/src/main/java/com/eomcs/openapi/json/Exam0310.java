// 객체 --> JSON 문자열 : 배열값 다루기
package com.eomcs.openapi.json;

import java.sql.Date;
import com.eomcs.design_pattern.iterator.ArrayList;
import com.google.gson.Gson;

public class Exam0310 {
  public static void main(String[] args) {

    // 1) 배열 준비
    Member m1 = new Member();
    m1.setNo(101);
    m1.setName("홍길동");
    m1.setEmail("hong@test.com");
    m1.setRegisteredDate(new Date(System.currentTimeMillis()));

    Member m2 = new Member();
    m2.setNo(102);
    m2.setName("임꺽정");
    m2.setEmail("leem@test.com");
    m2.setRegisteredDate(new Date(System.currentTimeMillis()));

    Member m3 = new Member();
    m3.setNo(102);
    m3.setName("안창호");
    m3.setEmail("ahn@test.com");
    m3.setRegisteredDate(new Date(System.currentTimeMillis()));

    ArrayList<Member> list = new ArrayList<>();
    list.add(m1);
    list.add(m2);
    list.add(m3);

    Gson gson = new Gson();
    String jsonStr = gson.toJson(list);

    System.out.println(jsonStr);
  }
}

// JSON 형식 - 배열
//      [{객체 정보},{객체 정보}, ...]
//      {"프로퍼디명" : 값, "프로퍼디명" : 값, ...}
