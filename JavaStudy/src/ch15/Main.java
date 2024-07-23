package ch15;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper om = new ObjectMapper();
		URL url = new URL("http://ggoreb.com/api/lotto.jsp"); // ?drwNo=1111 당일 회차로 이동
		HashMap<String, String> map = om.readValue(url, HashMap.class);
		String num1 = (String)map.get("num1");
		String num2 = (String)map.get("num2");
		String num3 = (String)map.get("num3");
		String num4 = (String)map.get("num4");
		String num5 = (String)map.get("num5");
		String num6 = (String)map.get("num6");
		System.out.printf("%s %s %s %s %s %s", num1, num2, num3, num4, num5, num6);
	}
}
