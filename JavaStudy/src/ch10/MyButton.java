package ch10;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

// 상속받아서 작성된 내 버튼의 배경색을 노란색으로
public class MyButton extends JButton { // 상속받으면 마음껏 커스텀이 가능함

	public MyButton(String 제목) {
		// new JButton("제목")
		super(제목);
		this.setFont(new Font("고딕체",Font.BOLD, 30));
		this.setBackground(Color.YELLOW);
		this.setBackground(new Color(255,255,0));
	}

}
