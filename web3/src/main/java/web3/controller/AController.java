package web3.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AController {
  public String action(HttpServletRequest req, HttpServletResponse resp) {
    return "a";
  }
}
