package ch18;

public class MyThreadRunnableMain{
  public static void main(String[] args) {
    Thread m = new Thread(new MyThreadRunnable());
    m.start();
  }
}
