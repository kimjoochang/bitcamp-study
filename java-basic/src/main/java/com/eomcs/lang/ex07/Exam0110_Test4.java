package com.eomcs.lang.ex07;

import java.util.Scanner;

//1단계: 공백 출력 코드를 메서드로 추출하기
//
public class Exam0110_Test4 {

  static void printSpaces(int spaceLenParam) {
    for(int i = 0; i < spaceLenParam; i++) {
      System.out.print(" ");
    }
  }

  static void printStars(int starLenParam) {
    for (int i = 0; i < starLenParam; i++) {
      System.out.print("*");
    }
  }

  static int getSpaceLen(int totalStar, int displayLen) {
    return (totalStar - displayLen) / 2;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("밑변의 길이 : ");
    int inputLen = scn.nextInt();
    scn.close();

    for (int starLen =1; starLen <= inputLen; starLen+=2) {
      printSpaces(getSpaceLen(inputLen,starLen));
      printStars(starLen);
      System.out.println();
    }
  }
}
