package com.eomcs.basic.ex10;

import java.util.Date;

public class Exam0110 {

  public static void main(String[] args) {
    long millis= System.currentTimeMillis(); // date객체를 만드는 순간의 시각을 저장해 둔다.
    Date date = new Date(millis);


    System.out.println(date);
  }

}
