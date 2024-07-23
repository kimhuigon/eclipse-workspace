package ch10;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MainButton {
	public static void main(String[] args) {
		JFrame frame = new JFrame("윈도우");
		MyButton b = new MyButton("버튼!!!");
		b.addMouseListener(new MyMouseAdapter());
		frame.add(b);

		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료시 같이 콘솔도 꺼짐
		frame.setVisible(true);
	}

}

class MyMouseAdapter extends MouseAdapter {
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("어이 도우너 어서오고");
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("아잇 싯팔");
	}
	
	public void mouseExited(MouseEvent e) {
		System.out.println("담배 하나 말아봐");
	}

}