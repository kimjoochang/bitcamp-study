// JSON 문자열 -->  객체 : JSON 문자열을 해석하여 객체를 생성하기
package com.eomcs.openapi.json;

import com.google.gson.Gson;

public class Exam0220 {
  public static void main(String[] args) {

    // 1) JSON 문자열 준비
    String jsonStr = "[{\"no\":101,\"name\":\"홍길동\"},{\"no\":102,\"name\":\"임꺽정\"},{\"no\":102,\"name\":\"안창호\"}]\n";

    // 2) JSON 처리 객체 준비
    Gson gson = new Gson();

    Member[] members = new Gson().fromJson(jsonStr, Member[].class);

    for(Member m : members) {
      System.out.println(m);
    }
  }

}
