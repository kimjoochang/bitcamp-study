// JSON 문자열 -->  객체 : JSON 문자열을 해석하여 객체를 생성하기
package com.eomcs.openapi.json;

import com.google.gson.Gson;

public class Exam0420 {
  public static void main(String[] args) {

    String jsonStr = "{\"no\":1,\"title\":\"제목\",\"content\":\"내용\",\"writer\":{\"no\":100,\"name\":\"홍길동\",\"email\":\"hong@test.com\",\"password\":\"1111\",\"photo\":\"hong.gif\",\"tel\":\"010-2222-1111\",\"registeredDate\":\"9월 16, 2021\"},\"registeredDate\":\"9월 16, 2021\",\"viewCount\":98,\"like\":5}\n";

    Board b = new Gson().fromJson(jsonStr, Board.class);

    System.out.println(jsonStr);
  }

}
