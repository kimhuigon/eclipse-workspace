package ch01;

public class Variable1 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a의 값은? " + a);
		
		int b = 30;
		System.out.println("b의 값은? " + b);
		
		a = b;
		// a의 값에 b를 입력
		// 기존 a의 값인 10은 사라짐
		System.out.println("a의 값은? " + a);
	}
}
