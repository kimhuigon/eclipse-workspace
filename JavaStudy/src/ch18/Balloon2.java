package ch18;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Balloon2 {
  public static void makeBalloon(JPanel panel, int x, int y) {
    /* Thread 사용 */
    new Thread(new Runnable() {
      @Override
      public void run() {
        /* 내부 클래스에서 지역변수 사용 */
        int y2 = y;
        ImageIcon icon = new ImageIcon("images/balloon.png");
        JLabel label = new JLabel(icon);
        label.setSize(icon.getIconWidth(), icon.getIconHeight());
        panel.add(label);
        for (int i = 0; i < 10; i++) {
          label.setLocation(x, y2);
          try {
            panel.repaint();
            Thread.sleep(200);
          } catch (InterruptedException e1) {
            e1.printStackTrace();
          }
          y2 -= 25;
        }
      }
    }).start();
  }
}
