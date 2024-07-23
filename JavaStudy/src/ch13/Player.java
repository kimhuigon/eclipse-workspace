package ch13;

public class Player {
  private Soundable soundable;

  public Player(Soundable soundable) {
    this.soundable = soundable;
  }

  public void printSound() {
    System.out.println(soundable.sound());
  }
}
