package ch05;

public class 연습문제04 {
	public static void main(String[] args) {
		int[][] matrix = new int[5][5]; // 5 x 5 2차원 배열 생성
		int num = 0;
		/* 1 ~ 25 요소 저장 */
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				matrix[row][col] = ++num;
			}
		}
		
		int first = 0;
		int last = 4;
		int cv = 1;
		for (int row = 0; row < 5; row++) {
			for (int col = first; col != last + cv; col += cv) {
				System.out.printf("%02d ", matrix[row][col]);
			}
			
			int temp = first;
			first = last;
			last = temp;
			cv *= -1;
			System.out.println();
		}
	}

}
