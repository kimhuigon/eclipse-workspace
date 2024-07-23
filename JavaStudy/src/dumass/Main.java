package dumass;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 472 * 385
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*(b%100 / 10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
	}
}