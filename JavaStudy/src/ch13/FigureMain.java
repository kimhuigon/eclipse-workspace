package ch13;

public class FigureMain {
  public static void main(String[] args) {
    Figure fig1 = new Triangle();
    fig1.area(200, 100);
    
    Figure fig2 = new Quadangle();
    fig2.area(200, 100);
  }
}
