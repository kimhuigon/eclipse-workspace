package ch04;

public class 연습문제06 {
	public static void main(String[] args) {
//		boolean isContinue = true;
		int count = 0;

		while (true) {
			// 0.0 <= X < 1.0
			int dice1 = (int) (Math.random() * 6 + 1); // 1 ~ 6
			int dice2 = (int) (Math.random() * 6 + 1); // 1 ~ 6
			System.out.printf("(%s, %s)\n", dice1, dice2);
			count++;

			if (dice1 + dice2 == 10) {
				break;
//				isContinue = false;
			}

		}
		
		System.out.println("주사위를 던진 횟수 : " + count);
	}

}
