package ch04;

import java.util.Scanner;

public class star2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("원하는 숫자를 입력하시오(단 홀수로만 입력)");
		int size = s.nextInt();
//		int size = 15;
		int left = size / 2; // 2번째에서 시작
		int right = left + 2; // 4번째에서 시작
		int center = size / 2 + 1; // 중간 지점 설정

		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (col > left && col < right) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			if (row >= center) { // 줄바꿈 중간 지점 통과
				left += 1;
				right -= 1;
			} else {
				left -= 1;
				right += 1;
			}

			System.out.println(); // 줄바꿈
		}
	}

}