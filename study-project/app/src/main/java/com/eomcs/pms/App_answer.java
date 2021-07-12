package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

//1) 배열 사용 전
//2) 배열 사용 후
//3) 반복문 적용 : while 문
//4) 반복문 적용 : for 문
//5) 여러 문장에서 반복해서 사용하는 값은 변수에 담아서 사용한다.
//6) 조회용으로만 사용할 변수라면 상수로 선언한다.
//7) 특정 조건에 따라 반복을 멈춘다.
//8) 날짜의 출력형식을 "yyyy-MM-dd"로 변경한다.

public class App {

  public static void main(String[] args) {

    int i = 0;
    int size = 0;
    final int MAX_LENGTH = 5;

    Scanner scn = new Scanner(System.in);

    int [] num = new int[5];
    String [] name = new String[MAX_LENGTH];
    String [] email = new String[MAX_LENGTH];
    String [] pwd = new String[MAX_LENGTH];
    String [] photo = new String[MAX_LENGTH];
    String [] tel = new String[MAX_LENGTH];
    Date [] regitdate = new Date[MAX_LENGTH];


    System.out.println("[회원]");

    while (i < MAX_LENGTH) {
      size = size +1;
      System.out.print("번호 ? ");
      num[i] = scn.nextInt();
      System.out.print("이름 ?");
      name[i] = scn.next();
      System.out.print("이메일 ? ");
      email[i] = scn.next();
      System.out.print("암호 ?");
      pwd[i] = scn.next();
      System.out.print("사진 ?");
      photo[i] = scn.next();
      System.out.print("전화 ?");
      tel[i] = scn.next();
      regitdate[i] = new Date();
      System.out.println();
      i++;
      System.out.println("계속 입력하시겠습니까? (y/N)");
      String answer = scn.next();
      if(answer.equalsIgnoreCase("N")||answer.equals("")) {

        break;
      }
    }

    System.out.println("---------------------------------------------");

    for (int j = 0; j < size; j++) {
      System.out.printf("%d, %s, %s, %s ,%tY-%5$tm-%5$td\n",
          num[j],name[j],email[j],tel[j],regitdate[j]);
    }


  }
}
