import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		/*
		 * System.out.println(1 == 2); System.out.println(1 != 2);
		 * System.out.println("뭐라도 적어 말하는 감자!"); Scanner s = new Scanner(System.in); int
		 * score = s.nextInt(); // char grade = score >= 90 ? 'A' : 'B'; char grade =
		 * score >= 90 ? 'A' : (score >= 80 ? 'B' : (score >= 70 ? 'C' : (score >= 60 ?
		 * 'D' : 'E'))); System.out.println("말하는 감자의 등급은 " + grade + "다.");
		 */

		Scanner s = new Scanner(System.in);

		long a = s.nextLong();
		long b = s.nextLong();
		long c = s.nextLong();

		System.out.println(a + b + c);
	}
}
