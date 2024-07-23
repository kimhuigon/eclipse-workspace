package ch07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 정규식4 {
	public static void main(String[] args) {
		String text = "991122-1096123";

		Pattern p = Pattern.compile("^\\d{6}-\\d{7}$");
		Matcher m = p.matcher(text);

		System.out.println(m.find());
	}
}
