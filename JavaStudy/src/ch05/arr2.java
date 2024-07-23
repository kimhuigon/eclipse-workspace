package ch05;

public class arr2 {
	public static void main(String[] args) {
		Integer[] numbers = { 3, 2, 1, 7, 4 };
		/* 반복문 */
		int min = Integer.MAX_VALUE; // int의 최대값
		for(int n : numbers) {
			if(n < min) {
				min = n;
			}
		}
		System.out.printf("최소값 : %d\n", min);
	}

}
