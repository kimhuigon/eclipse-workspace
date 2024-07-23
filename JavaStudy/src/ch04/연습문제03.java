package ch04;

import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 연습문제03 {
	public static void main(String[] args) {
		
		JFrame j = new JFrame();
		
		JButton b1 = new JButton();
		b1.setText("네이버"); // 버튼 글자 넣기
		b1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				try {
					Desktop.getDesktop().browse(new URI("http://www.naver.com")); // 웹사이트 접속
					} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
					}
			}
		});
		
		JButton b2 = new JButton();
		b2.setText("너튜브");
		b2.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				try {
					Desktop.getDesktop().browse(new URI("http://www.youtube.com")); // 웹사이트 접속
					} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
					}
			}
		});
		
		j.add(b1);
		j.add(b2);
		j.setLayout(new FlowLayout());
		
		j.setSize(180,100);
		j.setVisible(true);
				
	}
}