package ch06;

public class 유효범위 {
	static int num = 10; // 전역 변수

	public static void main(String[] args) { // 콘솔에 출력되는 구간
		int num = 20; // 지역 변수
		System.out.println(num);
		System.out.println(유효범위.num); // class명을 적고 .으로 변수를 불러냄
		temp();
	}

	public static void temp() {
		int num = 30;
		temp2();
		System.out.println(num);
		
	}
	public static void temp2() {
		int num = 31;
		temp3();
		System.out.println(num);
	}
	public static void temp3() {
		int num = 32;
		System.out.println(num);
	}

}
