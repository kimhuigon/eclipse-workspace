package ch18;

public class WashRoomMain {
  public static void main(String[] args) {
    WashRoom room = new WashRoom();
    WashRoomThread father = new WashRoomThread("father", room);
    WashRoomThread mother = new WashRoomThread("mother", room);
    WashRoomThread syster = new WashRoomThread("syster", room);
    WashRoomThread brother = new WashRoomThread("brother", room);
    
    father.start();
    mother.start();
    syster.start();
    brother.start();
  }
}
