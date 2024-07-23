package web2.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = "/popup")
public class PopupServlet extends HttpServlet { // Controller

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/popup.jsp");
	  
	  // ? 뒤의 데이터, 요청 꺼내기
	  String value = req.getParameter("value");
	  
	  // View(JSP)에서 사용할 수 있도록 데이터 전달(입력)하기
	  req.setAttribute("value", value);
	  
    dispatcher.forward(req, resp);
  }
  
}