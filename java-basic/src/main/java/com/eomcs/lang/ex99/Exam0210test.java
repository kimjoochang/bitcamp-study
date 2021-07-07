package com.eomcs.lang.ex99;

//# 키보드 입력 받기 - System.in 과 java.util.Scanner
//
public class Exam0210test {
  public static void main(String[] args) {

    int a;
    java.io.InputStream keyboard = System.in;

    java.util.Scanner keyScan = new java.util.Scanner(keyboard);

    System.out.print("팀명? "); 

    a = keyScan.nextInt();

    // 사용자가 입력한 문자열을 출력한다.
    System.out.println(a);

    // 스캐너는 사용 후 키보드와의 연결을 끊고 닫는다.
    keyScan.close();
  }
}

// System.out
// - 표준 출력 장치.
// - 즉 콘솔(모니터, 명령창)을 가리킨다.
// System.in
// - 표준 입력 장치.
// - 즉 키보드를 가리킨다.
