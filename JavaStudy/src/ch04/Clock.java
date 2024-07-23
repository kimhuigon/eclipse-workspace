package ch04;

public class Clock {
	public static void main(String[] args) {
		int h = 0;
		int m = 40;
		
		int 분 = h * 60 + m;
		System.out.println(분);
		
		분 -= 45;
		System.out.println(분);
		if(분 < 0 ) {
			분 += 24 * 60;
		}
		
		h = 분 / 60; // 121 -> 2시간
		m = 분 % 60; // 121 -> 1분
		
		System.out.printf("%s시 %s분",h,m);
    }
}
