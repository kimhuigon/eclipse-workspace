package ch13;

public class SportsCar extends Car {
  @Override
  public void move() {
    System.out.println("100km/h 이동");
  }

  public void openSunloof() {
    System.out.println("썬루프 열림");
  }
}
