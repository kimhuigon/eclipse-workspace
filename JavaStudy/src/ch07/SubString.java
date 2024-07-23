package ch07;

public class SubString {
	public static void main(String[] args) {
//					  012345678901234567890
		String str = "Life is too short, You need Java?";
		int 시작 = str.indexOf("short"); // 12
		int 끝 = 시작 + "short".length(); // 17
		
		System.out.println(str.substring(시작, 끝));
	}

}
