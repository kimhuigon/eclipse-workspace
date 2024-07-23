package ch18;

public class Sync1UserA extends Thread {
  private Sync1Value syncValue1;
  
  public void setSyncValue(Sync1Value syncValue1) {
    this.setName("User1");
    this.syncValue1 = syncValue1;
  }
  
  @Override
  public void run() {
    syncValue1.setMemory(100);
  }
}
