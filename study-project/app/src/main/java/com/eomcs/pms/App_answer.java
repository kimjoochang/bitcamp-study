package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

// 1) 변경준비
// 2) 사용자에게 명령 프롬프트 출력
// 3) 사용자의 명령을 입력 받아 출력
// 4) 명령어 입력 받아 출력하는 것을 무한반복
// 5) exit나 quit 명령을 입력하면 반복 실행 중지
// 6) /member/add와 /member/list 명령을 구분
// 7) /member/add 명령 처리
// 8) /member/list 명령 처리
public class App_answer {

  public static void main(String[] args) {

    Scanner keyboardScan = new Scanner(System.in);

    // 최대 입력 개수
    final int LENGTH = 100;

    int[] no = new int[LENGTH];                     // 7)
    String[] name = new String[LENGTH];             // 7)
    String[] email = new String[LENGTH];            // 7)
    String[] password = new String[LENGTH];         // 7)
    String[] photo = new String[LENGTH];            // 7)
    String[] tel = new String[LENGTH];              // 7)
    Date[] registeredDate = new Date[LENGTH];       // 7)

    int size = 0;


    while (true) { // 4)
      System.out.print("명령>"); // 2)

      String input = keyboardScan.nextLine(); // 3)
      if (input.equals("exit")||input.equals("quit")) { // 5)
        System.out.println("안녕!");
        break;                                          // 5)
      }else if (input.equals("/member/add")) {              // 6)
        System.out.println("[회원 등록]");                    // 6)

        System.out.print("번호? ");                                   // )7 ~~~
        no[size] = Integer.parseInt(keyboardScan.nextLine());           

        System.out.print("이름? ");                                   
        name[size] = keyboardScan.nextLine();                           

        System.out.print("이메일? ");                                      
        email[size] = keyboardScan.nextLine();                              

        System.out.print("암호? ");                                   
        password[size] = keyboardScan.nextLine();                          

        System.out.print("사진? ");                                   
        photo[size] = keyboardScan.nextLine();                              

        System.out.print("전화? ");       
        tel[size] = keyboardScan.nextLine();

        registeredDate[size] = new java.sql.Date(System.currentTimeMillis());
        System.out.println("");
        size++;                                                                 // ~~~ 7)


      }else if (input.equals("/member/list")) {             // 6)
        System.out.println("[회원목록]");                     // 6)

        for (int i = 0; i < size; i++) {                                    // 8) ~~~~
          // 번호, 이름, 이메일, 전화, 가입일
          System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
              no[i], name[i], email[i], tel[i], registeredDate[i]);
          System.out.println(" ");                                          // ~~~~ 8)
        }



      }else {                                               // 6)
        System.out.println("실행할 수 없는 명령입니다.");   // 6)
      }

      //      System.out.println(input); // 4)
    }








    /*System.out.println("[회원]");



    for (int i = 0; i < LENGTH; i++) {
      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboardScan.nextLine());

      System.out.print("이름? ");
      name[i] = keyboardScan.nextLine();

      System.out.print("이메일? ");
      email[i] = keyboardScan.nextLine();

      System.out.print("암호? ");
      password[i] = keyboardScan.nextLine();

      System.out.print("사진? ");
      photo[i] = keyboardScan.nextLine();

      System.out.print("전화? ");
      tel[i] = keyboardScan.nextLine();

      registeredDate[i] = new java.sql.Date(System.currentTimeMillis());

      size++;
      System.out.println(); // 빈 줄 출력

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String str = keyboardScan.nextLine();
      if (!str.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println(); // 빈 줄 출력
    }

    keyboardScan.close();

    System.out.println("--------------------------------");

     */
    keyboardScan.close();
  }
}
