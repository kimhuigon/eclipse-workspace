package job;

import java.util.Calendar;

public class Leapyear {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		year = 1996;
		System.out.printf("현재 년도는 %s년\n", year);
		
		if(year % 400 == 0) {
			System.out.println("윤년입니다");
		} else if(year % 100 == 0){
			System.out.println("평년입니다");
		} else if(year % 4 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
	}
}
