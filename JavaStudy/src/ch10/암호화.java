package ch10;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class 암호화 {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String plainText = "1";
		MessageDigest md = null;
		md = MessageDigest.getInstance("sha256");
		md.update(plainText.getBytes());
		byte[] pwd = md.digest();
		String result = "";
		for (byte p : pwd) {
			// 10진수 숫자를 16진수로 변환
			result += String.format("%02x", p);
		}
		System.out.println(result);

		plainText = "2";
		md = MessageDigest.getInstance("sha256");
		md.update(plainText.getBytes());
		pwd = md.digest();
		result = "";
		for (byte p : pwd) {
			// 10진수 숫자를 16진수로 변환
			result += String.format("%02x", p);
		}
		System.out.println(result);

		plainText = "3";
		md = MessageDigest.getInstance("sha1");
		md.update(plainText.getBytes());
		pwd = md.digest();
		result = "";
		for (byte p : pwd) {
			// 10진수 숫자를 16진수로 변환
			result += String.format("%02x", p);
		}
		System.out.println(result);
	}

}
