package ch18;

import java.util.Random;

public class WashRoom {
  public synchronized void useRoom(String name) {
    System.out.println(name + " 입장");
    try {
      System.out.println(name + " 사용중");
      int random = new Random().nextInt(3) + 1;
      Thread.sleep(random * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(name + " 퇴장");
  }
}
