package ch04;

public class 연습문제05 {
	public static void main(String[] args) {
//		for (int a = 1; a <= 5; a++) {
//			for (int b = 1; b <= a; b++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for (int row = 1; row <= 5; row++) {
			int space = 5 - row;
			for (int col = 1; col <= 5; col++) {
				if (col <= space) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(space);
		}
	}
}