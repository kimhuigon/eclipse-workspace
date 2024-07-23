package ch18;

public class Sync2Main {
  public static void main(String[] args) {
    Sync2Value value = new Sync2Value();
    
    Sync2UserA userA = new Sync2UserA();
    userA.setSyncValue(value);
    userA.start();

    Sync2UserB userB = new Sync2UserB();
    userB.setSyncValue(value);
    userB.start();
  }
}
