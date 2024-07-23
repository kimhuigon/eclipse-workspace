import java.util.Calendar;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// 오늘 날짜
		// 함수 Calendar
		Calendar c = Calendar.getInstance();
		int y = c.get(Calendar.YEAR); // 년
		int m = c.get(Calendar.MONTH); // 월을 표기하려면 +1이 붙어야함 출력에 따라 변환시키면 됨
		int d = c.get(Calendar.DAY_OF_MONTH); // 일
		System.out.println(y);
		System.out.println(m+1);
		System.out.println(d);
		
		Scanner s = new Scanner(System.in); // 입력 받기
		String 결과 = s.next(); // 단어 입력 받음 - string 띄어쓰기 안 읽어짐
		System.out.println(결과);
		// 주석comment 설명을 위해서 사용
		//명령어 - syso
		//마지막 ;세미콜론(semicolon)
		//자주 소괄호() 등장 -> 함수, 메소드
		System.out.println(11); // 출력
		// ?? 출력할 내용, 출력할 대상
	}
}
