package ch13;

public class SoundableMain {
  public static void main(String[] args) {
    Soundable piano = new Piano();
    System.out.println(piano.sound());
    
    Soundable guitar = new Guitar();
    System.out.println(guitar.sound());    
  }
}
