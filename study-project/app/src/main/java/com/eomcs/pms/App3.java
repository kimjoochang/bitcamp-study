package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

//1) 배열 사용 전
//2) 배열 사용 후
//3) 반복문 적용 : while 문
//4) 반복문 적용 : for 문
//5) 여러 문장에서 반복해서 사용하는 값은 변수에 담아서 사용한다.
//6) 조회용으로만 사용할 변수라면 상수로 선언한다.
//7) 특정 조건에 따라 반복을 멈춘다.
//8) 날짜의 출력형식을 "yyyy-MM-dd"로 변경한다.

public class App3 {

  public static void main(String[] args) {

    int i = 0;
    int size = 0;
    final int MAX_LENGTH = 5;

    Scanner scn = new Scanner(System.in);
    //Date date= new Date(System.currentTimeMillis());




    int [] num = new int[MAX_LENGTH];
    String [] prj = new String[MAX_LENGTH];
    String [] content = new String[MAX_LENGTH];
    Date [] finishDate = new Date[MAX_LENGTH];
    int[] state = new int[MAX_LENGTH];
    String [] name = new String[MAX_LENGTH];
    String [] member = new String[MAX_LENGTH];



    System.out.println("[작업]");

    while (i < MAX_LENGTH) {
      size = size +1;
      System.out.print("번호 ? ");
      num[i] = scn.nextInt();
      System.out.print("프로젝트명 ?");
      prj[i] = scn.next();
      System.out.print("내용 ? ");
      content[i] = scn.next();
      System.out.print("마감일 ?");
      finishDate[i] = Date.valueOf(scn.next());
      System.out.print("상태 ?\n0: 신규\n1: 진행중\n2: 완료\n>");
      state[i] = scn.nextInt();
      System.out.print("담당자 ?");
      name[i] = scn.next();
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
      switch (state[j]) {
        case 1:
          System.out.printf("%d, %s, %s, %s, %s", num[j], prj[j], finishDate[j], "신규", name[j]);
          break;
        case 2:
          System.out.printf("%d, %s, %s, %s, %s", num[j], prj[j], finishDate[j], "진행중", name[j]);
          break;
        case 3:
          System.out.printf("%d, %s, %s, %s, %s", num[j], prj[j], finishDate[j], "완료", name[j]);
          break;
      }

    }


  }
}
