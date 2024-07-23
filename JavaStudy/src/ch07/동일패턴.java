package ch07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 동일패턴 {
	public static void main(String[] args) throws IOException {
		String address = "http://ggoreb.com/quiz/pattern.html";
		URL url = new URL(address);
		InputStream in = url.openStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(isr);
		String text = "";

		while (true) {
			String data = reader.readLine();
			if (data == null)
				break;
			text += data + "\n";
		}
		
		text = text.substring(text.indexOf("kAe"));
		System.out.println(text);
		
		Pattern p = Pattern.compile("[^A-Z][A-Z]{3}([a-z])[A-Z]{3}[^A-Z]"); // ^(부정)A-Z : 대문자 A ~ Z가 아니다
		Matcher m = p.matcher(text);

		// 규칙에 맞는 문자(또는 문자열)가 있는지 확인
//		   boolean result = m.find();

		while (m.find()) {
			// 규칙에 해당하는 문자(또는 문자열) 조회
			String result = m.group(1);
			System.out.println(result);
		}

	}

}
