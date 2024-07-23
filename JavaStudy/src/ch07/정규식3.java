package ch07;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 정규식3 {
	public static void main(String[] args) {
		// shift + ctrl + O : 전체 import
		
		// 1. 8글자 이상
		// 2. 특수문자 X, 한글 X, 영어+숫자
		// 3. 영어로 시작
		Scanner s = new Scanner(System.in);
		
		String text = s.nextLine();;
		System.out.println(text);
		
		Pattern p = Pattern.compile("^[a-z][a-z0-9]{7}$");
		Matcher m = p.matcher(text);

		// 규칙에 맞는 문자(또는 문자열)가 있는지 확인
//		boolean result = m.find();
//		int count = 0;
		while (m.find()) {
			// 규칙에 해당하는 문자(또는 문자열) 조회
			String result = m.group();
			
//			count += 1;
			System.out.println(result);
		}
//		System.out.println(count);
	}

}
