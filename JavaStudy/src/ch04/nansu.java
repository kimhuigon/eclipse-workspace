package ch04;

import java.util.Scanner;

public class nansu {
	public static void main(String[] args) {
		int count = 0;
		int random = (int) (Math.random() * 100 + 1);
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("입력 : ");
			int num = scan.nextInt();
			count++;
			if (random > num) {
				System.out.println("입력값보다 큼");
			} else if (random < num) {
				System.out.println("입력값보다 적음");
			} else {
				System.out.println("맞혔음");
				break;
			}
		}
		System.out.println("시도한 횟수 : " + count);
		scan.close();
	}

}
