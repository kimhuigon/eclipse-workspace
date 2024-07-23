package ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URL연습 {
	public static void main(String[] args) throws IOException {
		String address = "https://dhlottery.co.kr/gameResult.do?method=byWin";
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
//		System.out.println(text);
		
		Pattern p = Pattern.compile("ball_645[ a-z0-9\"]+>(\\d)+");
		Matcher m = p.matcher(text);
		
		while(m.find()) {
			  // 규칙에 해당하는 문자(또는 문자열) 조회
			  String result = m.group(1) ;
			  System.out.println( result );
			}

	}
}
