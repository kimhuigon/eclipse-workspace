package ch07;

public class 거스름돈2 {
	public static void main(String[] args) {
		int money = 2160; // 거스름돈 2160원
		int coin = 0;
		while (money > 0) {
			System.out.println(money);
			if (money >= 500) { // 거스름돈이 500원 보다 크면
				int 동전개수 = money / 500;
				money = money - (500 * 동전개수);
				coin += 동전개수;
			} else if (money >= 100) { // 거스름돈이 100원 보다 크면
				int 동전개수 = money / 100;
				money = money - (100 * 동전개수);
				coin += 동전개수;
			} else if (money >= 50) { // 거스름돈이 50원 보다 크면
				int 동전개수 = money / 50;
				money = money - (50 * 동전개수);
				coin += 동전개수;
			} else if (money >= 10) { // 거스름돈이 10원 보다 크면
				int 동전개수 = money / 10;
				money = money - (10 * 동전개수);
				coin += 동전개수;
			}
		}
		System.out.printf("거스름돈 동전 개수: %s", coin);
	}
}
