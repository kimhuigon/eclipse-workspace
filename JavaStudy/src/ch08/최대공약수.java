package ch08;

public class 최대공약수 {
	public static void main(String[] args) {
		int a = 21;
		int b = 9;
		// minimum	maximum
		int min = Math.min(a, b);
//		System.out.println(min);
		for(int i = min; i >= 1; i--) {
			if(a % i == 0 && b % i == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}