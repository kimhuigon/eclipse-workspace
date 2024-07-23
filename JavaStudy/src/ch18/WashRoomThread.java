package ch18;

public class WashRoomThread extends Thread {
  private WashRoom room;
  private String name;

  public WashRoomThread(String name, WashRoom room) {
    this.name = name;
    this.room = room;
  }

  @Override
  public void run() {
    room.useRoom(name);
  }
}
