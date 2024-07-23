package ch03;

public class 연습문제03 {
	public static void main(String[] args) {
		int num = 12345;
		// 1. 숫자를 문자로 변환
		String n = num + "";
		// 2. 문자열의 각 문자를 얻어냄
		char c1 = n.charAt(0);
		char c2 = n.charAt(1);
		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println(c1-48 + c2-48);
		/* int num1 = num  % 10; // 12345 -> 5
		int num2 = (num / 10) % 10; // 1234 -> 4
		int num3 = (num / 100) % 10; // 123 -> 3
		int num4 = (num / 1000) % 10; // 12 -> 2
		int num5 = (num / 10000) % 10; // 1 -> 1
		int total = num1 + num2 + num3 + num4 + num5;
		System.out.println("각 자리 숫자의 합 : " + total);*/
	}
}
