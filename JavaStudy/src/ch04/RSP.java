package ch04;

import java.util.Scanner;

public class RSP {
	public static void main(String[] args) {
		// 1. 랜덤 사용법
		// 0.0 <= X < 1.0
		double m = Math.random();
		System.out.println(m);
		int m2 = (int) (m * 3);
		
		System.out.println(m2);

		int com = m2; // 바위
		int player = new Scanner(System.in).nextInt();
//		int player = 0; // 가위

		if ((player + 1) % 3 == com) {
			System.out.println("좆밥♥");
		} else if (com == player) {
			System.out.println("비김");
		} else {
			System.out.println("감자한테 지다니");
		}
	}

}
