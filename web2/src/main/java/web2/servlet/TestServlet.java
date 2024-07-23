package web2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = "/test")
public class TestServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("Test 서블릿");
//    resp.setContentType("text/html; charset=utf-8");
    resp.getOutputStream().write(67);
//    PrintWriter out = resp.getWriter();
//    out.println("출력1");
//    out.println("출력2");
  }
  
}








