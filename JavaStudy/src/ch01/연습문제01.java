package ch01;

public class 연습문제01 {
	public static void main(String[] args) {
		int a = 1, b = 2, c = 3, d = 4, e = 5;
		System.out.println( "1 +" + " 2 +" + " 3의 연산 결과는 '" + (a + b + c) + "'입니다" );
		System.out.println( "1 +" + " 2 +" + " 3의 연산 결과는 \"" + (a + b + c) + "\"입니다" ); // \" 내용 "\
		
		System.out.println( "1 ~ 5 곱셉 결과는 " + a*b*c*d*e + " 입니다" ); // a ~ e 변수를 활용하여 연산
	}
}
