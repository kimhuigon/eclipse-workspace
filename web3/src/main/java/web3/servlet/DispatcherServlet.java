package web3.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import web3.controller.AController;
import web3.controller.BController;
import web3.controller.PopupController;

@WebServlet(value = "/")
public class DispatcherServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String uri = req.getRequestURI();
    System.out.println(uri);
    
    // /web3/a
    //  0     1     2
    // ["", web3, a]
    String view = null;
    String[] uris = uri.split("/");
    System.out.println(uris[2]);
    switch(uris[2]) {
    case "a":
      AController a = new AController();
      view = a.action(req, resp);
      break;
    case "b":
      BController b = new BController();
      view = b.action(req, resp);
      break;
    case "popup":
        PopupController p = new PopupController();
        view = p.action(req, resp);
        break;
    }
    System.out.println(view);
    RequestDispatcher rd = 
        req.getRequestDispatcher("/WEB-INF/" + view + ".jsp");
    rd.forward(req, resp);
  }
}





