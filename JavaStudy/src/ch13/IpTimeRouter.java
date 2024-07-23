package ch13;

// 인터페이스 상속 implements
public class IpTimeRouter implements Router {
  public String connect() {
    return "iptime connect";
  }
  public String disconnect() {
    return "iptime disconnect";
  }
}
