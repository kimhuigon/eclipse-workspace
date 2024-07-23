import java.util.Scanner;

public class Main { // 히힛 똥이나 먹어라
	public static void main(String[] args) { // 반동이다! 전위대 전위대!
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		if(a % 400 == 0) {
			System.out.println('1');
		} else if(a % 100 == 0) {
			System.out.println('0');
		} else if(a % 4 == 0) {
			System.out.println('1');
		} else {
			System.out.println('0');
		}
		
	}
}



