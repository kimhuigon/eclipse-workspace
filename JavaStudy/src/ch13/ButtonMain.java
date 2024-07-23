package ch13;

public class ButtonMain {
  public static void main(String[] args) {
    Button btn = new Button();
    MyClickListener myClickListener = new MyClickListener();
    btn.setOnClickListener(myClickListener);
  }
}
