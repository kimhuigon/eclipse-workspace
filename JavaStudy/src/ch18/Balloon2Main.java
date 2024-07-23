package ch18;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Balloon2Main {
  public static void main(String[] args) {
    JFrame j = new JFrame();
    JPanel panel = new JPanel();
    panel.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        Balloon2.makeBalloon(panel, e.getX(), e.getY());
      }
    });
    j.add(panel);
    j.setSize(700, 500);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    j.setVisible(true);
  }

}
