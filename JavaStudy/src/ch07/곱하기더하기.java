package ch07;

public class 곱하기더하기 {
	public static void main(String[] args) {
		String n = "02984";
		// ((((0 + 2) X 9 ) X 8) X 4) = 576
		// 1. chatAt 메소드로 각 숫자를 분리
		int result = n.charAt(0) - 48; // 0
		
		int result2 = Integer.parseInt(n.charAt(0) + ""); // 문자를 숫자로 바꾸는 방식
		
		for(int i = 1; i <n.length(); i++) {
			int now = n.charAt(i) - 48; // 2
			if(now == 0 || now == 1 || result == 0 ) {
				result += now; // result = result + now;
			} else {
				result *= now;
			}
			System.out.println(now);
		}
		System.out.println(result);
	}
}
