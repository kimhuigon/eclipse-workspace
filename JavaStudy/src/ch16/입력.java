package ch16;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class 입력 {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("c:/java/test.txt") ; // Byte 계열 : 그림, 멀티미디어 등
		URL url = new URL("http:/naver.com");
		InputStream in2 = url.openStream();
		
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr); // 한줄로 읽기 위한 노력
		System.out.println(br.readLine());
		
		
//		int data1 = in.read();
//		System.out.println(data1);
//		System.out.println((char)data1);
		
		Reader reader = new FileReader("c:/java/test.txt"); // Character 계열 : 문자 / 한글 읽을 때 사용
		BufferedReader br2 = new BufferedReader(reader);
		System.out.println(br2.readLine());
//		int data2 = reader.read();
//		System.out.println(data2);
//		System.out.println((char)data2);
		
		
	}

}
