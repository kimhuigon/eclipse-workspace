package ch13;

public class Notebook {
  Router router = null;
  
  public void setRouter(Router router) {
    this.router = router;
  }
  
  public void connect() {
    String result = this.router.connect();
    System.out.println(result);
  }

  public void disconnect() {
    String result = this.router.disconnect();
    System.out.println(result);
  }
}
