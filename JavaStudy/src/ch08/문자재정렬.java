package ch08;

import java.util.Arrays;

public class 문자재정렬 {
	public static void main(String[] args) {
		String s = "K1KA5CB7";
		int 길이 = s.length();

		String 문자 = "";
		int 숫자 = 0;

		for (int i = 0; i < 길이; i++) {
			char 한글자 = s.charAt(i);
			if (한글자 >= '0' && 한글자 <= '9') {
				숫자 += (한글자 - 48);
			} else {
				문자 += 한글자; // KKACB -> 배열 + 정렬가능 -> 문자 변경
			}
		}
		char[] 배열 = 문자.toCharArray();
		Arrays.sort(배열);
		문자 = new String(배열);
		
		
		System.out.println(문자 + 숫자);
	}
}
