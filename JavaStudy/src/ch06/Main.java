package ch06;

import java.util.Random;

public class Main {
	public static void main(String[] args) { // static 메소드에서는 static 메소드만 호출가능 
		Random r = new Random();
		r.nextInt(100); // 0 ~ 100사이의 값으 반환
		
		int result = sum(10, 59);
		System.out.println(result);
		
		double 평균 = avg(result);
		System.out.println(평균);
	}
	
	// 값을 넣으면 합계를 구하는 메소드
	static int sum(int a, int b) { // 메소드 안에 작성된 이름은 메소드 안에서만 사용됨
		return a + b;
	}
	
	// 합계를 넣으면 평균을 구하는 메소드
	static double avg(int c) {
		return c / 2;
	}
}
