package ch07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 숨어있는 {
	public static void main(String[] args) throws IOException {
		String address = "http://ggoreb.com/quiz/special.html";
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
		text = text.substring(text.indexOf("%%$"));
		System.out.println(text);
		
		Pattern p = Pattern.compile("[a-zA-Z0-9가-힣]");
		Matcher m = p.matcher(text);

		while(m.find()) {
		  // 규칙에 해당하는 문자(또는 문자열) 조회
		  String result = m.group() ;
		  System.out.println( result );
		}

	}

}
