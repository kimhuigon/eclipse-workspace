package ch07;

public class Substring1 {
	public static void main(String[] args) {
//					  012345678901234567890
		String str = "Life is too short, You need Java?";
		int start = 0;
		int end = -1;

		while (true) {
			end = str.indexOf(" ", end + 1);
			if (end == -1) {
				String word = str.substring(start);
				System.out.println(word);
				break;
			}
			String word = str.substring(start, end);
			System.out.println(word);
			
			start = end;
		}
	}
}