package ch01;

public class Print {
	public static void main(String[] args) {
		System.out.println(1 + 1 + "2");
		System.out.println((1 + 2) * 3); // ((1 + 2) *3) 괄호 안에 괄호는 허용
		// {(1+1)+2} * 3 = 코드 허용 안 됨
		System.out.println("\"2\""); // 특수기호, 특수문자
	}
}
