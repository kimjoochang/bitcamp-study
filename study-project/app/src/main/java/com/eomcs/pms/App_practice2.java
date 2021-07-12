package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

//1) 변경준비
//2) 사용자에게 명령 프롬프트 출력
//3) 사용자의 명령을 입력 받아 출력
//4) 명령어 입력 받아 출력하는 것을 무한반복
//5) exit나 quit 명령을 입력하면 반복 실행 중지
//6) /member/add와 /member/list 명령을 구분
//7) /member/add 명령 처리
//8) /member/list 명령 처리
public class App_practice2 {

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);

    // 최대 입력 개수
    final int LENGTH = 100;

    int[] no = new int[LENGTH];
    String[] name = new String[LENGTH];
    String[] email = new String[LENGTH];
    String[] password = new String[LENGTH];
    String[] photo = new String[LENGTH];
    String[] tel = new String[LENGTH];
    Date[] registeredDate = new Date[LENGTH];

    int i = 0;

    while (true) {
      System.out.print("명령 > ");
      String input = scn.nextLine();
      if(input.equals("exit")||input.equals("quit")) {
        System.out.println("Bye!");
        break;
      }else if (input.equals("/member/add")) {
        System.out.print("번호? ");
        no[i] = Integer.parseInt(scn.nextLine());

        System.out.print("이름? ");
        name[i] = scn.nextLine();

        System.out.print("이메일? ");
        email[i] = scn.nextLine();

        System.out.print("암호? ");
        password[i] = scn.nextLine();

        System.out.print("사진? ");
        photo[i] = scn.nextLine();

        System.out.print("전화? ");
        tel[i] = scn.nextLine();

        registeredDate[i] = new java.sql.Date(System.currentTimeMillis());

        i++;
        System.out.println(); // 빈 줄 출력
      }else if (input.equals("/member/list")) {
        for (int j = 0; j < i; j++) {
          // 번호, 이름, 이메일, 전화, 가입일
          System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
              no[j], name[j], email[j], tel[j], registeredDate[j]);
        }
      }

    }
    scn.close();

    //    System.out.println("[회원]");
    //
    //    Scanner keyboardScan = new Scanner(System.in);
    //

    //
    //    for (int i = 0; i < LENGTH; i++) {
    //      
    //    }
    //
    //    keyboardScan.close();
    //
    //    System.out.println("--------------------------------");
    //
    //    for (int i = 0; i < size; i++) {
    //      // 번호, 이름, 이메일, 전화, 가입일
    //      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
    //          no[i], name[i], email[i], tel[i], registeredDate[i]);
    //    }
  }
}
