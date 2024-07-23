package ch06;

import java.util.Random;

public class 랜덤 {
	public static void main(String[] args) {
		
		Random r = new Random();
		System.out.println(r.nextInt(2));

		int number = getRandomNumber(0, 100);
		System.out.println(number);
	}

	public static int getRandomNumber(int startNum, int endNum) {
		// 지정된 숫자 범위 내의 임의값을 넣기
		Random random = new Random();
		int number = 0;
		while (true) { // 50 ~ 100
			number = random.nextInt(endNum);
			if (number >= startNum) {
				// 0 ~ 100
				break;
			}
		}
		return number;

	}

}
