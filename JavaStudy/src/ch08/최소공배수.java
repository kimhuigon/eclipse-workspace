package ch08;

public class 최소공배수 {
	public static void main(String[] args) {
		int a = 21;
		int b = 9;
		
		int max = Math.max(a, b);
		
		for(int i = max; i <= a * b; i++) {
			if(i % a == 0 && i % b == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}