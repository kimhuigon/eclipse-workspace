package ch07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 정규식2 {
	public static void main(String[] args) {
		// shift + ctrl + O : 전체 import
		String text = "주로 사용하는 이메일 주소는 a@ggoreb.com 이고, 가끔 사용하는 이메일 주소는 b@ggoreb.info 입니다. 이번에 새로 만든 c@ggoreb.net도 있습니다.";
		// \는 특수문자를 의미
		Pattern p = Pattern.compile("([a-z]+)@[a-z]+[.]([a-z]+)");
		Matcher m = p.matcher(text);

		// 규칙에 맞는 문자(또는 문자열)가 있는지 확인
//		boolean result = m.find();
		int count = 0;
		while (m.find()) {
			// 규칙에 해당하는 문자(또는 문자열) 조회
			String result = m.group(1);
			String result2 = m.group(2);
			
			count += 1;
			System.out.println(result);
			System.out.println(result2);
		}
		System.out.println(count);
	}

}
