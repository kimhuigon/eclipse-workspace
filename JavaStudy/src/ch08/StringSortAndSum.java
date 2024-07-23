package ch08;

import java.util.*;

public class StringSortAndSum { // gpt 대다네

	public static String sortAndSum(String input) {
		StringBuilder letters = new StringBuilder();
		int sum = 0;

		// 문자열을 문자와 숫자로 분리하여 처리
		for (char ch : input.toCharArray()) {
			if (Character.isAlphabetic(ch)) {
				// 알파벳인 경우 문자열에 추가
				letters.append(ch);
			} else if (Character.isDigit(ch)) {
				// 숫자인 경우 숫자를 더함
				sum += Character.getNumericValue(ch);
			}
		}

		// 알파벳을 오름차순으로 정렬
		char[] sortedLetters = letters.toString().toCharArray();
		Arrays.sort(sortedLetters);

		// 정렬된 알파벳과 숫자의 합을 문자열로 반환
		return new String(sortedLetters) + sum;
	}

	public static void main(String[] args) {
		// 입력으로 주어지는 문자열
		String input = "AJKDLSI412K4JSJ9D";

		// 결과 출력
		String result = sortAndSum(input);
		System.out.println(result); // 결과 출력: ABCKK13
	}
}
