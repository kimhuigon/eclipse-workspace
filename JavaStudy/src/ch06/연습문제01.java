package ch06;

public class 연습문제01 {
	public static void main(String[] args) {
		String a = gugudan(4, 4);
		System.out.println(a);

	}

	static String gugudan(int start, int end) {
		String s = "";
		for (int i = start; i <= end; i++) {
			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + (i * j));
				s += i + " * " + j + " = " + (i * j) + "\n";
			}
		}
		return s;
	}

}
