/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class myApp2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Date date = new Date(System.currentTimeMillis());   //System.currentTimeMills 컨닝

    String prjname, content, name, member;
    int num;

    Date startdate, finishdate;




    System.out.println("[프로젝트]");
    System.out.print("번호 ? ");
    num = scanner.nextInt();
    System.out.print("프로젝트명 ?");
    prjname = scanner.next();
    System.out.print("내용 ?");
    content = scanner.next();
    System.out.print("시작일 ?");
    startdate = Date.valueOf(scanner.next());     //valueOf 컨닝
    System.out.print("종료일 ?");
    finishdate = Date.valueOf(scanner.next());    //valueOf 컨닝  -> 
    System.out.print("만든이 ?");
    name = scanner.next();
    System.out.print("팀원 ?");
    member = scanner.next();
    System.out.println("-------------------------------");
    System.out.println(num);
    System.out.println(prjname);
    System.out.println(content);
    System.out.println(startdate);
    System.out.println(finishdate);
    System.out.println(name);
    System.out.println(member);
  }
}
