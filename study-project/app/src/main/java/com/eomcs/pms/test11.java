package com.eomcs.pms;

public class test11 {

  public static void main(String[] args) {
    int [] a = {20, 10, 35, 30, 7};
    int i = 0, j;
    while (i<a.length+1) {
      if (a[i]<a[i+1]) {
        i++;
      }else {
        j =a[i];
        a[i]=a[i+1];
        a[i+1]= j;
      }
    }
    System.out.println("최소값 : " + a[0]);
    System.out.println("최소값 : " + a[4]);
  }
}

