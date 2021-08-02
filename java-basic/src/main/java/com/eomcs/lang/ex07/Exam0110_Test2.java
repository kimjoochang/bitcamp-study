package com.eomcs.lang.ex07;

import java.util.Scanner;

//3단계: while 대신 for 문 사용하기
//
public class Exam0110_Test2 {

  static void printSpaces(int spaceLen) {
    for (int spaceCnt = 0; spaceCnt < spaceLen; spaceCnt++) {
      System.out.print(" ");
    }
  }

  static void printStars(int starLen) {
    for (int starCnt = 0; starCnt < starLen; starCnt++) {
      System.out.print("*");
    }
  }

  static int getSpaceLength(int input, int displayStar) {
    return (input - displayStar) / 2;
  }

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();
    keyScan.close();


    for (int firstStarLen = 1; firstStarLen <= len; firstStarLen += 2) {
      printSpaces(getSpaceLength(len,firstStarLen));
      printStars(firstStarLen);
      System.out.println();
    }
  }
}