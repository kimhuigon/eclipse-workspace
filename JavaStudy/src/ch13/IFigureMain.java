package ch13;

public class IFigureMain {
  public static void main(String[] args) {
    IFigure fig1 = new TriangleImpl();
    fig1.area(200, 100);
    
    IFigure fig2 = new QuadangleImpl();
    fig2.area(200, 100);
  }
}
