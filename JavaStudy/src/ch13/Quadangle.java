package ch13;

public class Quadangle extends Figure {

  @Override
  public void area(int x, int y) {
    System.out.println("사각형의 넓이 : " + (x * y));
  }
  
}
