package ch13;

public class QuadangleImpl implements IFigure {

  @Override
  public void area(int x, int y) {
    System.out.println("사각형의 넓이 : " + (x * y));
  }
  
}
