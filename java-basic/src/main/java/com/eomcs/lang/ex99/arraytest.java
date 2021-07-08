package com.eomcs.lang.ex99;

public class arraytest {

  public static void main(String[] args) {
    int[] arr5 = new int[100];
    arr5 = new int[2147483645];
    arr5[2147483645] = 2147483647;
    System.out.println(arr5[2147483645]);
  }

}
