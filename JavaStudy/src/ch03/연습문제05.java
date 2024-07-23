package ch03;

public class 연습문제05 {
	public static void main(String[] args) {
		/*
		 * char ch = 'T'; int 임시 = (int)ch; int 임시2 = 임시 + 32;
		 * System.out.println((char)임시2);
		 * 
		 * //char ch2 = ch >= 'A' && ch <= 'Z' ? ch + 32 : ch; // char ch2 = (int)ch >=
		 * (int)'A' && (int)ch <= (int)'Z' ? (char)((int)ch + 32) : ch; char ch2 = (ch
		 * >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;
		 * 
		 * System.out.println(ch2);
		 */

		// 코드 간결화 시킨 것
		char ch = 'X';
		char lowerCase = (ch >= 'A' && ch <= 'Z') ? (char)((int)ch +32) : ch;
		System.out.println(lowerCase);
		
		System.out.println((int) ch);
		System.out.println((int) 'x');

		int 숫자 = (int) ch;
		// 위 숫자가 대문자에 해당하는가?
		if (숫자 >= (int) 'A' && 숫자 <= (int) 'Z') {
			int 더한숫자 = 숫자 + 32; // 아스키코드 120 - 88로 나온 숫자
			char 변환문자 = (char) 더한숫자;
			System.out.println(변환문자);
		} else {
			System.out.println(ch);
		}

	}
}
