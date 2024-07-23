package ch07;

public class Replace {
	public static void main(String[] args) {
		String str1 = "Java Programming 01~12";
		String str2 = str1.replaceAll(" [A-Za-z] ", "");
		System.out.println(str2);
		
//		String str2 = str1.replace("Java", "자바");
//		System.out.println(str1);
//		System.out.println(str2);
	}
}

