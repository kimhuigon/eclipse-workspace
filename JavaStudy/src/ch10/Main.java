package ch10;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("윈도우");
		MyButton b = new MyButton("버튼!!!");
		b.addMouseListener(new MyMouseAdapter1());
		frame.add(b);

		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료시 같이 콘솔도 꺼짐
		frame.setVisible(true);
	}

}

class MyMouseAdapter1 implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
System.out.println("자 이게 클릭이라는 거야");		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}