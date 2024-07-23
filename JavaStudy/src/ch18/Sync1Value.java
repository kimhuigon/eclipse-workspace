package ch18;

import java.util.ArrayList;
import java.util.Vector;

public class Sync1Value {
	StringBuffer sb;
	StringBuilder sbb;
	ArrayList list;
	Vector list2;
	
  private int memory;
  
  public int getMemory() {
	  sb.append("");
	  sbb.append("");
	  
	  list.add("");
	  list2.add("");
	  
    return memory;
  }
  
  public synchronized void setMemory(int memory) { // 동기화
    this.memory = memory;
    try {
      Thread.sleep(2000);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(
        Thread.currentThread().getName() + " : " + this.memory);
  }
}
