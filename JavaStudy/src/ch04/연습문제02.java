package ch04;

public class 연습문제02 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 2;
		
		if(a >= b && a <= c || a <= b && a >= c) {
			System.out.println(a);
		} else if(b >= a && b <= c || b <= a && c >= c) {
			System.out.println(b);
		} else {
			System.err.println(c);
		}
	}
}