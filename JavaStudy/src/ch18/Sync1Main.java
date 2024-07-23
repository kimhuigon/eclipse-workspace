package ch18;

public class Sync1Main {
  public static void main(String[] args) {
    Sync1Value value = new Sync1Value();
    
    Sync1UserA userA = new Sync1UserA();
    userA.setSyncValue(value);
    userA.start();

    Sync1UserB userB = new Sync1UserB();
    userB.setSyncValue(value);
    userB.start();
  }
}
