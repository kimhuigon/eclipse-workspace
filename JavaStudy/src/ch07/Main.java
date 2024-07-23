package ch07;

public class Main {
	static void run() {
		
	}
	public static void main(String[] args) {
		int a = 10;
		String s1 = "ddd";
		String s2 = "ddd";
		System.out.println(s1 == s2);
		
		String s3 = new String("ddd");
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s3));
		
		// 1. 문자 찾기
		// 2. 문자 변경(치환)
		// 		영어 알파벳 대/소문자 변경
		// 3. 문자 잘라내기(슬라이싱)
		// 4. 문자 개수
		System.out.printf("%s %s",a,s1);
	}

}
