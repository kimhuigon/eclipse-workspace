package ch14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자를 넣으세요");
		
		int num = 0;
		
		try {
			num = s.nextInt();
			System.out.println("정상 실행");
			System.out.println(4/0);
		} catch(InputMismatchException e) {
			System.out.println("숫자랑 글자도 모르니? 왜 사냐?");
		} catch(ArithmeticException e) {
			System.out.println("나누는데 왜 0을 넣니? 공기가 아깝다");
		}
		System.out.println(num);
	}

}
