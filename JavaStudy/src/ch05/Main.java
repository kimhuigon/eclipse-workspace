package ch05;

import java.util.Scanner;
import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper om = new ObjectMapper();
		URL url = new URL("http://ggoreb.com/http/list1.jsp");
		String[] 결과 = om.readValue(url, String[].class);
		
		for(int i = 0; i <결과.length; i++) {
			System.out.println(결과[i]);
		}
		
		// 기본 자료형을 제오한 댑분의 자료들은 선언과 대입되는 값이 동일함
		//int a = 10;
		/** String a1 = new String();
		
		Scanner s = new Scanner(System.in);
		
		char[] c = new char[2];
		
		int[] b = new int[2]; // 기본 모습
		
		int b2[] = new int[2];
		
		int[] b3 = new int[] {1, 2, 3}; // 값을 바로 넣는 방법1
		int[] b4 = {1, 2, 3}; // 값을 바로 넣는 방법2
		*/
	}

}
