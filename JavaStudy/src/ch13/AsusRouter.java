package ch13;

//인터페이스 상속 implements
public class AsusRouter implements Router {
  public String connect() {
    return "asus connect";
  }
  public String disconnect() {
    return "asus disconnect";
  }
}
