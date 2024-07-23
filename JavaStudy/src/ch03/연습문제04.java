package ch03;

public class 연습문제04 {
	public static void main(String[] args) {
		// 조건식(비교연산자) ?		:
		int age = 30;
		System.out.println(age > 25 ? "참" : "거짓");
		String result = age > 25 ? "참" : "거짓";
		System.out.println(result);
		
		int num = 10;
		System.out.println(num % 2 == 0 ? "짝" : "홀");
	}
}
