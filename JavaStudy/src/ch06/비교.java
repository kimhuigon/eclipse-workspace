package ch06;

import java.util.Arrays;

public class 비교 {
	public static void main(String[] args) {
		//참조(기본자료가 아닌 것)
		int[] r1 = {1};
		int[] r2 = r1; // {1} 값을 저장하는 것이 아니라 {1} 값의 위치를 저장
		
		r2[0] += 100;
		System.out.printf("%s %s", Arrays.toString(r1),Arrays.toString(r2)+"\n");
		
		
		// 기본
		int b1 = 10;
		int b2 = b1;
		
		b2 += 100;
		System.out.printf("%s %s", b1, b2);
	}

}
