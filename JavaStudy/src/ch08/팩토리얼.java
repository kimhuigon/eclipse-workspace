package ch08;

// factorial f(5) => 5 * 4 * 3 * 2 * 1
public class 팩토리얼 {
	static int f(int n) {
		System.out.printf("%s 들어옴\n", n);
		if(n == 1) {
//			System.out.println("1이라서 종료");
			return 1;
		}
		return n * f(n-1);
//		System.out.printf("%s 나감\n", n);
	}
	
	public static void main(String[] args) {
		int result = f(15);
		System.out.println(result);
	}
}