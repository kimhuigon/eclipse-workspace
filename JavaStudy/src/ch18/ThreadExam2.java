package ch18;

public class ThreadExam2 implements Runnable {
  String name;

  ThreadExam2(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println(name + " : " + i);
    }
  }
}
