package ch18;

public class Sync2UserA extends Thread {
  private Sync2Value syncValue2;
  
  public void setSyncValue(Sync2Value syncValue2) {
    this.setName("User1");
    this.syncValue2 = syncValue2;
  }
  
  @Override
  public void run() { syncValue2.setMemory(100); }
}
