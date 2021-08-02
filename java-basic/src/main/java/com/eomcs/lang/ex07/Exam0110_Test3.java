package com.eomcs.lang.ex07;

import java.util.Scanner;

//1단계: 공백 출력 코드를 메서드로 추출하기
//
public class Exam0110_Test3 {

  static void printSpaces(int spaceLen) {
    int spaceCnt = 1;
    while (spaceCnt <= spaceLen) {
      System.out.print(" ");
      spaceCnt++;
    }
  }

  static void printStars(int starLenParam) {
    int starCnt = 1;
    while (starCnt <= starLenParam) {
      System.out.print("*");
      starCnt++;
    }
  }

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();
    keyScan.close();

    int starLen = 1;
    while (starLen <= len) {

      printSpaces((len - starLen) / 2);

      // 별 출력
      printStars(starLen);

      // 출력 줄 바꾸기
      System.out.println(starLen);
      starLen += 2;
    }
  }
}