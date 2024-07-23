package ch06;

public class 막대자르기 {

	static int getMinimum(int[] sticks) {
		int min = Integer.MAX_VALUE;
		for (int stick : sticks) {
			if (stick < min && stick != 0)
				min = stick;
		}
		return min;
	}

	public static void main(String[] args) {
		int[] sticks = { 5, 4, 4, 2, 2, 8 };

		while (true) {
			int min = getMinimum(sticks); // 가장 짧은 막대기

			int count = 0; // 0 보다 큰 막대기의 수 (남아있는 막대기 수)
			for (int i = 0; i < sticks.length; i++) {
				int stick = sticks[i];
				int value = 0;
				// 막대기를 자른 후 크기가 0 보다 크면 카운트 증가
				if (stick - min > 0) {
					count += 1;
					value = stick - min;
				}
				sticks[i] = value; // 자른 후 남은 길이 적용
			}
			System.out.println(count); // 남아있는 막대기 수 출력
			if (count == 0)
				break; // 모든 막대기가 0이 되면 종료
		}
	}

}
