package ch10;

public class SportsCar extends Car {
	public static void main(String[] args) {
//		SportsCar sc = new SportsCar(); : 업캐스팅
		// 자식객체를 생성하지만 형태(선언)는 부모 객체
		Car sc = new SportsCar();
		
		// 자식만 가지는 기능을 실행하려면 다시 자식 셩태로 변경시킨 후 사용
		((SportsCar)sc).openSunloof();
		
		System.out.println(sc); //.toString을 써도 똑같이 나옴, 타고 들어가면 object로 toString이 불러져있음
		
//		Car c = new Car();
//		SportsCar sc2 = (SportsCar) c; // 부모 객체는 자식 객체가 될 수 없음, 그러므로 실행시 에러가 발생함 : 다운캐스팅
		
	}
	char color = 'R';

	SportsCar() {
		System.out.println("SportsCar 객체 생성");
	}

	void openSunloof() {
		System.out.println("썬루프 열림");
	}
}
