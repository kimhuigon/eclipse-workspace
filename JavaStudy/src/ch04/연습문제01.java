package ch04;
import java.util.Calendar;

public class 연습문제01 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		year = 2022;
		System.out.printf("현재 연도는 %s년\n", year);
		
		if(year % 400 == 0) {
			System.out.println("윤년");
		} else if (year % 100 == 0) {
			System.out.println("평년");
		} else if (year % 4 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		
		/*if(year / 4 == 4 && year / 400 == 400) {
			System.out.println("평년입니다.");
		} else if(year / 100 == 100 ){
			System.out.println("윤년입니다.");
		}*/
	}
}
