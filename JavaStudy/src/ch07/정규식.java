package ch07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 정규식 {
	public static void main(String[] args) {
		// shift + ctrl + O : 전체 import
		String text = "전화번호 : 010-1234-5678, 번호 : 010-0987-6543";
		//							\는 특수문자를 의미
		Pattern p = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
		Matcher m = p.matcher(text);

		// 규칙에 맞는 문자(또는 문자열)가 있는지 확인
//		boolean result = m.find();

		while (m.find()) {
			// 규칙에 해당하는 문자(또는 문자열) 조회
			String result = m.group();
			System.out.println(result);
		}

	}

}
