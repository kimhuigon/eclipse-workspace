package ch07;

public class 거스름돈 {
	public static void main(String[] args) {
		int money = 2160; // 거스름돈 2160원
		int coin = 0;
		while (money > 0) {
			if (money >= 500) { // 거스름돈이 500원 보다 크면
				money -= 500; // 500원을 제외하고
				coin += 1; // 동전 1개 추가
			} else if (money >= 100) { // 거스름돈이 100원 보다 크면
				money -= 100; // 100원을 제외하고
				coin += 1; // 동전 1개 추가
			} else if (money >= 50) { // 거스름돈이 50원 보다 크면
				money -= 50; // 50원을 제외하고
				coin += 1; // 동전 1개 추가
			} else if (money >= 10) { // 거스름돈이 10원 보다 크면
				money -= 10; // 10원을 제외하고
				coin += 1; // 동전 1개 추가
			}
		}
		System.out.printf("거스름돈 동전 개수: %s", coin);
	}
}
