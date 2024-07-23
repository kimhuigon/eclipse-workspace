package ch14;

import javax.security.auth.login.AccountNotFoundException;

public class 예외연습 {
	public static void main(String[] args) {
		try {
			글자길이("1234");
		} catch (AccountNotFoundException e) {
			System.out.println("잘못된 문자입니다.");
		}
	}

	static int 글자길이(String text) throws AccountNotFoundException {
		char 첫글자 = text.charAt(0);
		if(첫글자 >= 'a' && 첫글자 <= 'z') {
			int len = text.length();
			return len;
		} else {
			throw new AccountNotFoundException();
		}
		

	}
}
