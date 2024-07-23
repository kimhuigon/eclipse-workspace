package ch08;

public class 연습문제03 {
	int a; // int a = 0;
	
	public static void method1() {
		System.out.println("method1 실행 시작");
		
		연습문제03 a = new  연습문제03(); // 객체 생성
		for(int i = 0; i <= 5; i++) {
			a.method2(); // method2 호출
		}
		System.out.println("method1 실행 종료");
	}
	public void method2() {
		a += 1; // 전역변수 a의 값을 1씩 증가ㅣ
		System.out.printf("method2 : %s\n", a); // 전역변수 a의 값 출력
	}

}
