package ch04;

import java.util.Scanner;

public class baseball {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int b1 = (int) (Math.random() * 9 + 1);
		int b2 = (int) (Math.random() * 9 + 1);
		int b3 = (int) (Math.random() * 9 + 1); // 정답
//		System.out.println(b1);

		int strike = 0;
		int ball = 0;
		int count = 0;

		while (true) {
			System.out.println("숫자를 입력하세요");
			int n1 = s.nextInt();
			int n2 = s.nextInt();
			int n3 = s.nextInt();
			count++;

			if (strike == 0 && ball == 0) {
				System.out.println("아웃");

				if (n1 == b1) {
					// 스트라이크
					strike += 1;
				} else if (n1 == b2 || /* 또는 */ n1 == b3) {
					// 볼
					ball += 1;
				}

				if (n2 == b2) {
					// 스트라이크
					strike += 1;
				} else if (n2 == b1 || n2 == b3) {
					ball += 1;
				}

				if (n3 == b3) {
					// 스트라이크
					strike += 1;
				} else if (n3 == b1 || n3 == b2) {
					ball += 1;
				}

//			if (strike == 0 && ball == 0) {
//				System.out.println("아웃");
			} else {
				System.out.printf("%sS %sB\n", strike, ball);
				break;
			}
		}

		System.out.println("시도한 횟수 : " + count);
		s.close();

/**		if (n1 == b1) {
			// 스트라이크
			strike += 1;
		} else if (n1 == b2 ||  또는  n1 == b3) {
			// 볼
			ball += 1;
		}

		if (n2 == b2) {
			// 스트라이크
			strike += 1;
		} else if (n2 == b1 || n2 == b3) {
			ball += 1;
		}
		if (n3 == b3) {
			// 스트라이크
			strike += 1;
		} else if (n3 == b1 || n3 == b2) {
			ball += 1;
		}

		if (strike == 0 && ball == 0) {
			System.out.println("아웃");
		} else {
			System.out.printf("%sS %sB", strike, ball);
			break;
			*/
	}

}
