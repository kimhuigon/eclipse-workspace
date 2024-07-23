package ch18;

public class ThreadExam1Main {
  public static void main(String[] args) {
    ThreadExam1 t1 = new ThreadExam1("first");
    ThreadExam1 t2 = new ThreadExam1("second");

    t1.start();
    t2.start();
  }
}
