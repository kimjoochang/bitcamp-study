package com.eomcs.web.ex12;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration.Dynamic;
import javax.servlet.annotation.WebListener;
import com.eomcs.web.ex01.Servlet03;

@WebListener
public class Listener01 implements ServletContextListener {
  @Override
  public void contextInitialized(ServletContextEvent sce) {
    System.out.println("웹애플리케이션 시작!!");
    System.out.println("서블릿 배치!");


    ServletContext sc =sce.getServletContext();

    Servlet03 servlet = new Servlet03();

    Dynamic 서블릿 = sc.addServlet("ex12.s03", servlet);

    서블릿.addMapping("/ex12/s03");


  }
}
