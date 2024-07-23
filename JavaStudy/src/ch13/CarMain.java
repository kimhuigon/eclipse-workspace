package ch13;

public class CarMain {
  public static void main(String[] args) {
    Car car1 = new SportsCar();
    car1.move();
    ((SportsCar) car1).openSunloof();
    
    Car car2 = new Truck();
    car2.move();
    ((Truck) car2).load();
  }
}
