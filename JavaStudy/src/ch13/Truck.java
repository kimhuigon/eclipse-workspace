package ch13;

public class Truck extends Car {
  @Override
  public void move() {
    System.out.println("50km/h 이동");
  }

  public void load() {
    System.out.println("짐 실음");
  }
}
