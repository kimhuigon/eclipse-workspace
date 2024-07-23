package ch18;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Balloon1 {
  public static void makeBalloon(JPanel panel, int x, int y) {
    /* 이미지 생성 */
    ImageIcon icon = new ImageIcon("images/balloon.png");

    /* 이미지를 보여주기 위해서 JLabel 사용 */
    JLabel label = new JLabel(icon);

    /* 이미지 크기와 같게 JLabel 크기 지정 */
    label.setSize(icon.getIconWidth(), icon.getIconHeight());

    /* 이미지를 가지고 있는 JLabel을 JPanel로 추가 */
    panel.add(label);
    for(int i = 0; i < 10; i++) {
      /* 이미지가 보여질 위치 지정 */
      label.setLocation(x, y);
      try {
        /* 그래픽 표현 상태 변경 후 새로 고침을 해야 화면에 반영 */
        panel.repaint();
        Thread.sleep(200);
      } catch (InterruptedException e1) {
        e1.printStackTrace();
      }
      /* Y축 위치 변경 (위로 이동) */
      y -= 25;
    }
  }
}
