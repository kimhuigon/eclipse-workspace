package ch13;

public class Triangle extends Figure {

  @Override
  public void area(int x, int y) {
    System.out.println("삼각형의 넓이 : " + (x * y / 2));
  }
  
}
