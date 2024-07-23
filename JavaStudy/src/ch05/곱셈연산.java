package ch05;

public class 곱셈연산 {
	public static void main(String[] args) {
			int[] a = {4, 7, 2};
			int[] b = {3, 8, 5};
			
			int n = a[0] * 100 + a[1] * 10 + a[2]; // 100의 자리, 10의 자리, 1의 자리
			
			int total = 0;
			int num = 100;
			
			for(int c : b) {
				total += c * n * num;
				num /= 10;
				System.out.println(n * c);
			}
			System.out.println(total);
		}
}