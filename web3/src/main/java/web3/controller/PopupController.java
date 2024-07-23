package web3.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PopupController {
  public String action(HttpServletRequest req, HttpServletResponse resp) {
    return "popup";
  }
}
