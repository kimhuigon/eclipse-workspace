package ch04;

import java.util.Scanner;

public class SPR {
	public static void main(String[] args) {
		boolean isContinue = true;
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while (isContinue) {
			count += 1;
			System.out.println("가위0, 바위1, 보2");
			System.out.print("숫자 입력 > ");
			int player = scan.nextInt();
			int com = (int) (Math.random() * 3);
			System.out.println(player + "/" + com);
			if ((player + 1) % 3 == com) {
				System.out.println("Com 이김");
			} else if (player == com) {
				System.out.println("비김");
			} else {
				System.out.println("Player 이김");
				isContinue = false;
			}
		}
		scan.close();
		System.out.println("무능한 당신은 " + count +"번의 시도만에 이겼습니다");
	}

}
