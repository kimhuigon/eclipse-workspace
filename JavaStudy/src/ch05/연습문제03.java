package ch05;

public class 연습문제03 {
	public static void main(String[] args) {
		int[][] matrix = new int[5][5]; // 5 x 5 2차원 배열 생성
		int num = 0;
		/* 1 ~ 25 요소 저장 */
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				matrix[row][col] = ++num;
			}
		}
		
		// 배열 출력 코드 작성
		for (int col = 0; col < 5; col++) {
			for (int row = 0; row < 5; row++) {
//				System.out.print(matrix[row][col] + " ");
				System.out.printf("%02d ", matrix[row][col]); // 2자리 수에 1의 자리 숫자에 0을 넣기
			}
			System.out.println();
		}
	}

}
