package ch18;

public class ThreadExam2Main {
  public static void main(String[] args) {
    ThreadExam2 t1 = new ThreadExam2("first");
    ThreadExam2 t2 = new ThreadExam2("second");

    Thread thread1 = new Thread(t1);
    Thread thread2 = new Thread(t2);
    thread1.start();
    thread2.start();
  }
}
