package ch07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 첨지킴 {
	public static void main(String[] args) throws IOException {
//		서버로부터 데이터를 가져오는 코드
		String address = "http://ggoreb.com/quiz/운수좋은날.txt";
		URL url = new URL(address);
		InputStream in = url.openStream();
		InputStreamReader isr = new InputStreamReader(in, "cp949"); // 한글 깨질때 cp949사용
		BufferedReader reader = new BufferedReader(isr);
		String text = "";

		   while(true) {
		     String data = reader.readLine();
		     if(data == null) break;
		     text += data + "\n";
		   }

//		   System.out.println(text);

		Pattern p = Pattern.compile("김[ ]*첨\\s*지");
		Matcher m = p.matcher(text);

		int count = 0;
		while (m.find()) {
			// 규칙에 해당하는 문자(또는 문자열) 조회
			String result = m.group();
			System.out.println(result);
			count += 1;
		}
		System.out.println(count);
	}

}
