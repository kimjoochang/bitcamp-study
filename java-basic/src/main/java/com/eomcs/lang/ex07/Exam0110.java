package com.eomcs.lang.ex07;

import java.util.Scanner;

//1단계: 공백 출력 코드를 메서드로 추출하기
//2단계: 별을 출력하는 코드를 메서드로 추출하기
//3단계: while 대신 for 문 사용하기
//4단계: 공백 계산 식을 메서드로 추출하기

public class Exam0110 {

  static void printSpaces(int spaceLenParam) {
    int spaceCnt = 1;
    while (spaceCnt <= spaceLenParam) {
      System.out.print(" ");
      spaceCnt++;
    }
  }

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();
    keyScan.close();

    int starLen = 1;
    while (starLen <= len) {
      // 별 앞에 공백 출력
      printSpaces((len - starLen) / 2);

      // 별 출력
      int starCnt = 1;
      while (starCnt <= starLen) {
        System.out.print("*");
        starCnt++;
      }

      // 출력 줄 바꾸기
      System.out.println();
      starLen += 2;
    }
  }
}